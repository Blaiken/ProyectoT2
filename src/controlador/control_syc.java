package controlador;

import java.sql.CallableStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.CambioMenstruacion;
import modelo.Sintomas;

public class control_syc {
    
    conexion_bd con = new conexion_bd();
    
    public void InsertarSyC(JLabel LblCedula, JTable sintomas, JComboBox CboxHumor, JComboBox CboxTipoDolor, JComboBox CboxSE){
         LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = now.format(formatter);
        Sintomas sin = new Sintomas();
        CambioMenstruacion cam = new CambioMenstruacion();
        
        String consultaSintomas = "INSERT INTO sintomas (cedula,tipo,intensidad,durabilidad,fecharegistro) VALUES (?,?,?,?,?);";
        
        try {
            DefaultTableModel modelo = (DefaultTableModel) sintomas.getModel();

            CallableStatement cs1 = con.establecerConexion().prepareCall(consultaSintomas);
            
            for (int i = 0; i < modelo.getRowCount(); i++) {
                String tipo = (String) modelo.getValueAt(i, 0);
                String durabilidad = (String) modelo.getValueAt(i, 1);
                String intensidad = (String) modelo.getValueAt(i, 2);
                
                cs1.setInt(1, Integer.parseInt(LblCedula.getText()));
                cs1.setString(2, tipo);
                cs1.setString(3, durabilidad);
                cs1.setString(4, intensidad);
                cs1.setString(5, fechaFormateada);
                cs1.execute();
            }
        } catch (Exception e) {
            
        }

        cam.setHumor(CboxHumor.getSelectedItem().toString());
        cam.setTipo_dolor(CboxTipoDolor.getSelectedItem().toString());
        cam.setSensibilidad_emocional(CboxSE.getSelectedItem().toString());
        
        
        String consultaCambios = "INSERT INTO cambiomenstruacion (cedula,humor,tipodolor,sensiemocional,fecharegistro) VALUES (?,?,?,?,?);";
        
        try {
            
            CallableStatement cs2 = con.establecerConexion().prepareCall(consultaCambios);
            
            cs2.setInt(1, Integer.parseInt(LblCedula.getText()));
            cs2.setString(2, cam.getHumor());
            cs2.setString(3, cam.getTipo_dolor());
            cs2.setString(4, cam.getSensibilidad_emocional());
            cs2.setString(5, fechaFormateada);
            
            cs2.execute();

            JOptionPane.showMessageDialog(null,
                    "Se ha registrado correctamente.",
                    "¡TODO LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se inserto los sintomas y cambios.\nError: " +e.toString());
            }
    }
    
}
