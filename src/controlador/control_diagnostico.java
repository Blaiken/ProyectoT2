package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

public class control_diagnostico {

    conexion_bd con = new conexion_bd();

    public void MostrarDiagnostico(JLabel LabelCedula, JLabel LblNombre, JLabel LblCedula, JLabel LblFechaNacimiento, JLabel LblCorreo, JLabel LblPeso, JLabel LblAltura,
            JTable tablaSintoma,
            JLabel LblFechaInicio, JLabel LblFechaFinal, JLabel LblIntensidadFlujo, JLabel LblDuracion, JLabel LblDiasFertiles, JLabel LblDiasSeguridad, JLabel LblProximoCiclo, JLabel LblOvulacion,
            JLabel LblHumor, JLabel LblTipoDolor, JLabel LblSE) {

        PreparedStatement psDP = null;
        ResultSet rsDP = null;
        PreparedStatement psSintomas = null;
        ResultSet rsSintomas = null;
        PreparedStatement psCM = null;
        ResultSet rsCM = null;
        PreparedStatement psCaM = null;
        ResultSet rsCaM = null;

        try {
            String cedula = LabelCedula.getText();
            System.out.println("Cédula proporcionada: " + cedula); // Mensaje de depuración

            String consultaDP = "SELECT nombre, nacionalidad, cedula, fechanace, correo, peso, altura FROM estudiantef WHERE cedula = ?;";
            psDP = con.establecerConexion().prepareStatement(consultaDP);
            psDP.setString(1, cedula);
            rsDP = psDP.executeQuery();

            if (rsDP.next()) {
                LblNombre.setText(rsDP.getString("nombre"));
                String Nacionalidad = rsDP.getString("nacionalidad");
                String Cedula = rsDP.getString("cedula");
                LblCedula.setText(Nacionalidad + "-" + Cedula);
                LblFechaNacimiento.setText(rsDP.getString("fechanace"));
                LblCorreo.setText(rsDP.getString("correo"));
                LblPeso.setText(rsDP.getString("peso") + " kg");
                LblAltura.setText(rsDP.getString("altura") + " cm");

                // Obtener la fecha actual
                LocalDate fechaActual = LocalDate.now();
                System.out.println("Fecha para síntomas: " + fechaActual.toString());

                // Consulta de síntomas (a partir de la fecha actual)
                String consultaSintomas = "SELECT * FROM sintomas WHERE cedula = ? AND fecharegistro >= ?;";
                psSintomas = con.establecerConexion().prepareStatement(consultaSintomas);
                psSintomas.setString(1, cedula);
                psSintomas.setString(2, fechaActual.toString());

                System.out.println("Consulta síntomas: " + consultaSintomas); // Mensaje de depuración
                System.out.println("Parámetros: Cédula = " + cedula + ", Fecha = " + fechaActual.toString()); // Parámetros de consulta

                rsSintomas = psSintomas.executeQuery();

                if (!rsSintomas.isBeforeFirst()) {
                    // Mensaje de depuración
                    System.out.println("No se encontraron síntomas para la cédula y fecha proporcionadas.");
                    JOptionPane.showMessageDialog(null, "No hay síntomas registrados para la fecha seleccionada.");
                } else {
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("Tipo");
                    modelo.addColumn("Intensidad");
                    modelo.addColumn("Durabilidad");

                    String[] datos = new String[3];

                    while(rsSintomas.next()) {
                        String tipo = rsSintomas.getString("tipo");
                        String intensidad = rsSintomas.getString("intensidad");
                        String durabilidad = rsSintomas.getString("durabilidad");

                        // Mensaje de depuración
                        System.out.println("Síntoma: " + tipo + ", Intensidad: " + intensidad + ", Durabilidad: " + durabilidad);

                        datos[0] = (tipo != null && !tipo.isEmpty()) ? tipo : "(?)";
                        datos[1] = (intensidad != null && !intensidad.isEmpty()) ? intensidad : "(?)";
                        datos[2] = (durabilidad != null && !durabilidad.isEmpty()) ? durabilidad : "(?)";

                        modelo.addRow(datos);
                    }

                    tablaSintoma.setModel(modelo);
                }

                String consultaCaM = "SELECT * FROM cambiomenstruacion WHERE cedula = ?;";
                psCaM = con.establecerConexion().prepareStatement(consultaCaM);
                psCaM.setString(1, cedula);
                rsCaM = psCaM.executeQuery();

                if (rsCaM.next()) {
                    LblHumor.setText(rsCaM.getString("humor"));
                    LblTipoDolor.setText(rsCaM.getString("tipodolor"));
                    LblSE.setText(rsCaM.getString("sensiemocional"));
                } else {
                    LblHumor.setText("(?)");
                    LblTipoDolor.setText("(?)");
                    LblSE.setText("(?)");
                }

                // Nueva sección añadida
                String consultaCM = "SELECT * FROM ciclomenstrual WHERE cedula = ?;";
                psCM = con.establecerConexion().prepareStatement(consultaCM);
                psCM.setString(1, cedula);
                rsCM = psCM.executeQuery();

                if (rsCM.next()) {
                    LblFechaInicio.setText(rsCM.getString("fechainiciou"));
                    LblFechaFinal.setText(rsCM.getString("fechainicioa"));
                    LblIntensidadFlujo.setText(rsCM.getString("intensidadflujo"));
                    LblDuracion.setText(rsCM.getString("duracion") + " días");
                    String DFA = rsCM.getString("diasfertilesantes");
                    String DFD = rsCM.getString("diasfertilesdespues");
                    String DF = "Los día " + DFA + " y " + DFD;
                    LblDiasFertiles.setText(DF);
                    String DSA = rsCM.getString("diasseguridadantes");
                    String DSD = rsCM.getString("diasseguridaddespues");
                    String DS = "Los día " + DSA + " y " + DSD;
                    LblDiasSeguridad.setText(DS);
                    LblProximoCiclo.setText(rsCM.getString("proximociclo"));
                    LblOvulacion.setText(rsCM.getString("ovulacion"));
                } else {
                    LblFechaInicio.setText("(?)");
                    LblFechaFinal.setText("(?)");
                    LblIntensidadFlujo.setText("(?)");
                    LblDuracion.setText("(?)");
                    LblDiasFertiles.setText("(?)");
                    LblDiasSeguridad.setText("(?)");
                    LblProximoCiclo.setText("(?)");
                    LblOvulacion.setText("(?)");
                }
            } else {
                System.out.println("No se encontraron registros personales para la cédula: " + cedula); // Mensaje de depuración
                JOptionPane.showMessageDialog(null, "Verifique la cédula.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Mensaje de depuración de excepción
            JOptionPane.showMessageDialog(null, "No se pudo mostrar el perfil.\nError: " + e.toString());
        } finally {
            try {
                if (rsDP != null) rsDP.close();
                if (rsSintomas != null) rsSintomas.close();
                if (psDP != null) psDP.close();
                if (psSintomas != null) psSintomas.close();
                if (rsCM != null) rsCM.close();
                if (psCM != null) psCM.close();
            } catch (Exception e) {
                e.printStackTrace(); // Mensaje de depuración de excepción
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }

}
