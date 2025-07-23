package controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class control_historial {
    
    conexion_bd con = new conexion_bd();
    
    public void MostrarHistorialDP(JTable TblDatosPersonales){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        TblDatosPersonales.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("Cédula");
        modelo.addColumn("Nacionalidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Peso");
        modelo.addColumn("Estatura");
        
        TblDatosPersonales.setModel(modelo);
        
        sql = "SELECT cedula, nacionalidad, nombre, correo, peso, altura FROM estudiantef;";
        
        String[] datos = new String[6];
        Statement st;
        
        try {
            st = con.establecerConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("nacionalidad");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("correo");
                datos[4] = rs.getString("peso");
                datos[5] = rs.getString("altura");
                
                modelo.addRow(datos);
                
            }
            
            TblDatosPersonales.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " +e.toString());
        }
    }
    
    public void MostrarHistorialSintomas(JTable TlbSintomas){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        TlbSintomas.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("Cédula");
        modelo.addColumn("Tipo");
        modelo.addColumn("Intensidad");
        modelo.addColumn("Durabilidad");
        
        TlbSintomas.setModel(modelo);
        
        sql = "SELECT * FROM sintomas;";
        
        String[] datos = new String[4];
        Statement st;
        
        try {
            st = con.establecerConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("intensidad");
                datos[3] = rs.getString("durabilidad");
                
                modelo.addRow(datos);
                
            }
            
            TlbSintomas.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " +e.toString());
        } 
    }
    
    public void MostrarHistorialCM(JTable TlbCicloMenstrual){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        TlbCicloMenstrual.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("Cédula");
        modelo.addColumn("Fecha de inicio - U");
        modelo.addColumn("Fecha de inicio - A");
        modelo.addColumn("Intensidad del flujo");
        modelo.addColumn("Duración");
        modelo.addColumn("Estado");
        modelo.addColumn("Ovulación");
        modelo.addColumn("Días fértiles");
        modelo.addColumn("Días de seguridad");
        modelo.addColumn("Próximo ciclo");
        
        TlbCicloMenstrual.setModel(modelo);
        
        sql = "SELECT * FROM ciclomenstrual;";
        
        String[] datos = new String[10];
        Statement st;
        
        try {
            st = con.establecerConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("fechainiciou");
                datos[2] = rs.getString("fechainicioa");
                datos[3] = rs.getString("intensidadflujo");
                datos[4] = rs.getString("duracion");
                datos[5] = rs.getString("estado");
                datos[6] = rs.getString("ovulacion");
                String DFA = rs.getString("diasfertilesantes");
                String DFD = rs.getString("diasfertilesdespues");
                datos[7] = "Del " + DFA + " al " + DFD;
                String DSA = rs.getString("diasseguridadantes");
                String DSD = rs.getString("diasseguridaddespues");
                datos[8] = "Del " + DSA + " al " + DSD;
                datos[9] = rs.getString("proximociclo");
                
                modelo.addRow(datos);
                
            }
            
            TlbCicloMenstrual.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " +e.toString());
        } 
    }
    
    public void MostrarHistorialCambios(JTable TlbCambios){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        TlbCambios.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("Cédula");
        modelo.addColumn("Humor");
        modelo.addColumn("Tipo de dolor");
        modelo.addColumn("Sensibilidad emocional");
        
        TlbCambios.setModel(modelo);
        
        sql = "SELECT * FROM cambiomenstruacion;";
        
        String[] datos = new String[4];
        Statement st;
        
        try {
            st = con.establecerConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("humor");
                datos[2] = rs.getString("tipodolor");
                datos[3] = rs.getString("sensiemocional");
                
                modelo.addRow(datos);
                
            }
            
            TlbCambios.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " +e.toString());
        } 
    }
    
    public void BuscarPorCedula(JTable TblDP, JTable TblSintomas, JTable TblCicloMenstrual, JTable TblCambio, JTextField TextCedula) {
        
        String[] op = {"Datos Personales","Sintomas","Ciclo Menstrual","Cambios"};
        
        int opcion = JOptionPane.showOptionDialog(null,
            "¿Cuál tabla desea visualizar?",
            "Selecciona una tabla", JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, op, op[2]);
        
        if(opcion == 0){
            
            DefaultTableModel TablaDP = (DefaultTableModel) TblDP.getModel();
            TablaDP.setRowCount(0);
            
            String[] datos = new String[6];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT cedula, nacionalidad, nombre, correo, peso, altura FROM estudiantef WHERE cedula LIKE ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                
                ps.setString(1, TextCedula.getText() + "%");
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("nacionalidad");
                    datos[2] = rs.getString("nombre");
                    datos[3] = rs.getString("correo");
                    datos[4] = rs.getString("peso");
                    datos[5] = rs.getString("altura");
                    TablaDP.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique correctamente la cédula.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
        else if(opcion == 1){
            
            DefaultTableModel TablaSintomas = (DefaultTableModel) TblSintomas.getModel();
            TablaSintomas.setRowCount(0);
            
            String[] datos = new String[4];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT * FROM sintomas WHERE cedula LIKE ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, TextCedula.getText()  + "%");
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("tipo");
                    datos[2] = rs.getString("intensidad");
                    datos[3] = rs.getString("durabilidad");
                    TablaSintomas.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique correctamente la cédula.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
        else if(opcion == 2){
            DefaultTableModel TablaCM = (DefaultTableModel) TblCicloMenstrual.getModel();
            TablaCM.setRowCount(0);
            
            String[] datos = new String[10];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT * FROM ciclomenstrual WHERE cedula LIKE ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, TextCedula.getText() + "%");
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("fechainicio");
                    datos[2] = rs.getString("fechafinal");
                    datos[3] = rs.getString("intensidadflujo");
                    datos[4] = rs.getString("duracion");
                    datos[5] = rs.getString("estado");
                    datos[6] = rs.getString("ovulacion");
                    String DFA = rs.getString("diasfertilesantes");
                    String DFD = rs.getString("diasfertilesdespues");
                    datos[7] = "Del " + DFA + " al " + DFD;
                    String DSA = rs.getString("diasseguridadantes");
                    String DSD = rs.getString("diasseguridaddespues");
                    datos[8] = "Del " + DSA + " al " + DSD;
                    datos[9] = rs.getString("proximociclo");
                    TablaCM.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique correctamente la cédula.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
        else if(opcion == 3){
            DefaultTableModel TablaCaM = (DefaultTableModel) TblCambio.getModel();
            TablaCaM.setRowCount(0);
            
            String[] datos = new String[4];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT cedula,humor,tipodolor,sensiemocional FROM cambiomenstruacion WHERE cedula LIKE ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, TextCedula.getText() + "%");
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("humor");
                    datos[2] = rs.getString("tipodolor");
                    datos[3] = rs.getString("sensiemocional");
                    TablaCaM.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique correctamente la cédula.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
    }
    
    public void BuscarPorFecha(JTable TblDP, JTable TblSintomas, JTable TblCicloMenstrual, JTable TblCambio, JDateChooser Fecha) {
        
        String[] op = {"Datos Personales","Sintomas","Ciclo Menstrual","Cambios"};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(Fecha.getDate());
        
        int opcion = JOptionPane.showOptionDialog(null,
            "¿Cuál tabla desea visualizar?",
            "Selecciona una tabla", JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, op, op[2]);
        
        if(opcion == 0){
            
            DefaultTableModel TablaDP = (DefaultTableModel) TblDP.getModel();
            TablaDP.setRowCount(0);
            
            String[] datos = new String[6];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT cedula, nacionalidad, nombre, correo, peso, altura FROM estudiantef WHERE fecharegistro = ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, fechaFormateada);
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("nacionalidad");
                    datos[2] = rs.getString("nombre");
                    datos[3] = rs.getString("correo");
                    datos[4] = rs.getString("peso");
                    datos[5] = rs.getString("altura");
                    TablaDP.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la fecha seleccionada.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
        else if(opcion == 1){
            
            DefaultTableModel TablaSintomas = (DefaultTableModel) TblSintomas.getModel();
            TablaSintomas.setRowCount(0);
            
            String[] datos = new String[4];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT * FROM sintomas WHERE fecharegistro = ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, fechaFormateada);
                rs = ps.executeQuery();
                

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("tipo");
                    datos[2] = rs.getString("intensidad");
                    datos[3] = rs.getString("durabilidad");
                    TablaSintomas.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la fecha seleccionada.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
        else if(opcion == 2){
            DefaultTableModel TablaCM = (DefaultTableModel) TblCicloMenstrual.getModel();
            TablaCM.setRowCount(0);
            
            String[] datos = new String[10];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT * FROM ciclomenstrual WHERE fecharegistro = ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, fechaFormateada);
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("fechainicio");
                    datos[2] = rs.getString("fechafinal");
                    datos[3] = rs.getString("intensidadflujo");
                    datos[4] = rs.getString("duracion");
                    datos[5] = rs.getString("estado");
                    datos[6] = rs.getString("ovulacion");
                    String DFA = rs.getString("diasfertilesantes");
                    String DFD = rs.getString("diasfertilesdespues");
                    datos[7] = "Del " + DFA + " al " + DFD;
                    String DSA = rs.getString("diasseguridadantes");
                    String DSD = rs.getString("diasseguridaddespues");
                    datos[8] = "Del " + DSA + " al " + DSD;
                    datos[9] = rs.getString("proximociclo");
                    TablaCM.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la fecha seleccionada.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
        else if(opcion == 3){
            DefaultTableModel TablaCaM = (DefaultTableModel) TblCambio.getModel();
            TablaCaM.setRowCount(0);
            
            String[] datos = new String[4];
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String consulta = "SELECT cedula,humor,tipodolor,sensiemocional FROM cambiomenstruacion WHERE fecharegistro = ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, fechaFormateada);
                rs = ps.executeQuery();

                int filas = 0;

                while (rs.next()) {
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("humor");
                    datos[2] = rs.getString("tipodolor");
                    datos[3] = rs.getString("sensiemocional");
                    TablaCaM.addRow(datos);
                    filas++;
                }

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la fecha seleccionada.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
            }
        }
    }
    
    public void BuscarPorNombre(JTable TblDP, JTextField TextNombre){
         
        DefaultTableModel TablaDP = (DefaultTableModel) TblDP.getModel();
        TablaDP.setRowCount(0);

        String[] datos = new String[6];
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT cedula, nacionalidad, nombre, correo, peso, altura FROM estudiantef WHERE nombre LIKE ?;";
            ps = con.establecerConexion().prepareStatement(consulta);
            ps.setString(1,"%" + TextNombre.getText() + "%");
            rs = ps.executeQuery();

            int filas = 0;

            while (rs.next()) {
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("nacionalidad");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("correo");
                datos[4] = rs.getString("peso");
                datos[5] = rs.getString("altura");
                TablaDP.addRow(datos);
                filas++;
            }

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Verifique correctamente la cédula.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
        }
    }
    
    public void BuscarPorSintoma(JTable TblSintomas, JComboBox CboxTipo, JComboBox CboxIntensidad, JComboBox CboxDurabilidad){
        
        DefaultTableModel TblS = (DefaultTableModel) TblSintomas.getModel();
        TblS.setRowCount(0);

        String[] datos = new String[4];
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT * FROM sintomas WHERE tipo LIKE ? AND intensidad LIKE ? AND durabilidad LIKE ?;";
            ps = con.establecerConexion().prepareStatement(consulta);
            ps.setString(1, CboxTipo.getSelectedItem().toString());
            ps.setString(2, CboxIntensidad.getSelectedItem().toString());
            ps.setString(3, CboxDurabilidad.getSelectedItem().toString());
            rs = ps.executeQuery();

            int filas = 0;

            while (rs.next()) {
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("intensidad");
                datos[3] = rs.getString("durabilidad");
                TblS.addRow(datos);
                filas++;
            }

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Los datos que desea encontrar no existen.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
        } 
    }
    
    public void BuscarPorCambio(JTable TblCambio, JComboBox CboxHumor, JComboBox CboxTipoDolor, JComboBox CboxSensibilidad){
        
        DefaultTableModel TblCam = (DefaultTableModel) TblCambio.getModel();
        TblCam.setRowCount(0);

        String[] datos = new String[4];
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT * FROM cambiomenstruacion WHERE humor LIKE ? AND tipodolor LIKE ? AND sensiemocional LIKE ?;";
            ps = con.establecerConexion().prepareStatement(consulta);
            ps.setString(1, CboxHumor.getSelectedItem().toString());
            ps.setString(2, CboxTipoDolor.getSelectedItem().toString());
            ps.setString(3, CboxSensibilidad.getSelectedItem().toString());
            rs = ps.executeQuery();

            int filas = 0;

            while (rs.next()) {
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("humor");
                datos[2] = rs.getString("tipodolor");
                datos[3] = rs.getString("sensiemocional");
                TblCam.addRow(datos);
                filas++;
            }

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se ha encontrado con éxito.", "¡ENCONTRADO!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Los datos que desea encontrar no existen.", "¡UN PROBLEMA!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
        }
        
    }
    
    public void Rnombreapellido(JTextField TextNombreApellido, JTable TblDP){
        
        if(TextNombreApellido.getText().isEmpty()){
            MostrarHistorialDP(TblDP);
        }
    }
    
    public void Rcedula(JTextField TextCedula, JTable TblDP){
        
        if(TextCedula.getText().isEmpty()){
            MostrarHistorialDP(TblDP);
        }
    }
    
    public void btninforme(){
        
        Object seleccion = JOptionPane.showInputDialog(null,
        "Ingrese la opción que desea realizar", "SELECCIÓN",
        JOptionPane.QUESTION_MESSAGE, null, new Object[]
        {"Crear informe general","Crear un informe de sintomas de una estudiante"}, "Crear informe general");

        if(seleccion == "Crear informe general"){
            crearinformegeneral();
        }
        if(seleccion == "Crear un informe de sintomas de una estudiante"){
            informesintomas();
        }
        
    }
    
    public void informesintomas() {
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula de la estudiante: ");

        while (cedula != null && !cedula.matches("\\d{8}")) {
            cedula = JOptionPane.showInputDialog("Por favor, ingrese una cédula válida de 8 números: ");
        }

        if (cedula == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return; // Salir del método si la operación es cancelada
        }

        PreparedStatement psDP = null;
        ResultSet rsDP = null;

        try {
            String consultaDP = "SELECT * FROM estudiantef WHERE cedula LIKE ?;";
            psDP = con.establecerConexion().prepareStatement(consultaDP);
            psDP.setString(1, cedula);
            rsDP = psDP.executeQuery();

            if (!rsDP.next()) {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para la cédula ingresada.");
                return; // Salir del método si no se encuentra la cédula
            }

            Document document = new Document(PageSize.A4.rotate());
            String dest = ".pdf";
            PreparedStatement psSintomas = null;
            ResultSet rsSintomas = null;

            try {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Guardar respaldo en...");
                int userSelection = fileChooser.showSaveDialog(null);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File Destino = fileChooser.getSelectedFile();
                    PdfWriter.getInstance(document, new FileOutputStream(Destino + dest));
                }

                document.open();

                Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
                Paragraph PTituloPrincipal = new Paragraph("- Informe de síntomas -", fuenteNegrita);
                PTituloPrincipal.setSpacingAfter(10f);
                PTituloPrincipal.setAlignment(Element.ALIGN_CENTER);
                document.add(PTituloPrincipal);

                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String FechaSalida = now.format(formatter);

                Font fuenteN = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
                Paragraph PFechaSalida = new Paragraph("Fecha de salida: " + FechaSalida, fuenteN);
                PFechaSalida.setSpacingAfter(10f);
                PFechaSalida.setAlignment(Element.ALIGN_CENTER);
                document.add(PFechaSalida);

                Font fuenteNegrita2 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
                Paragraph PDatosPersonales = new Paragraph("Datos Personales", fuenteNegrita2);
                PDatosPersonales.setSpacingAfter(10f);
                PDatosPersonales.setAlignment(Element.ALIGN_CENTER);
                document.add(PDatosPersonales);

                String Estudiante = rsDP.getString("nombre");
                String Nacionalidad = rsDP.getString("nacionalidad");
                String nCedula = rsDP.getString("cedula");
                String Cedula = Nacionalidad + "-" + nCedula;
                String FechaNacimiento = rsDP.getString("fechanace");
                String Correo = rsDP.getString("correo");
                String Peso = rsDP.getString("peso");
                String Estatura = rsDP.getString("altura");

                Font fuenteGrande = new Font(Font.FontFamily.TIMES_ROMAN,16);
                Paragraph PNombre = new Paragraph("Nombre completo: " + Estudiante + ".", fuenteGrande);
                PNombre.setSpacingAfter(10f);
                document.add(PNombre);

                Paragraph PCedula = new Paragraph("Cédula: " + Cedula + ".", fuenteGrande);
                PCedula.setSpacingAfter(10f);
                document.add(PCedula);

                Paragraph PFechaNacimiento = new Paragraph("Fecha de nacimiento: " + FechaNacimiento + ".", fuenteGrande);
                PFechaNacimiento.setSpacingAfter(10f);
                document.add(PFechaNacimiento);

                Paragraph PTelefono = new Paragraph("Correo electrónico: " + Correo + ".", fuenteGrande);
                PTelefono.setSpacingAfter(10f);
                document.add(PTelefono);

                Paragraph PPeso = new Paragraph("Peso: " + Peso + "kg.", fuenteGrande);
                PPeso.setSpacingAfter(10f);
                document.add(PPeso);

                Paragraph PEstatura = new Paragraph("Estatura: " + Estatura + "cm.", fuenteGrande);
                PEstatura.setSpacingAfter(10f);
                document.add(PEstatura);

                Paragraph PSintomas = new Paragraph("Síntomas", fuenteNegrita2);
                PSintomas.setSpacingAfter(10f);
                PSintomas.setAlignment(Element.ALIGN_CENTER);
                document.add(PSintomas);

                PdfPTable TblSintomas = new PdfPTable(4);

                TblSintomas.setWidthPercentage(100);

                TblSintomas.addCell("Tipo");
                TblSintomas.addCell("Intensidad");
                TblSintomas.addCell("Durabilidad");
                TblSintomas.addCell("Registro");

                String consultaSin = "SELECT * FROM sintomas WHERE cedula LIKE ?;";
                psSintomas = con.establecerConexion().prepareStatement(consultaSin);
                psSintomas.setString(1, cedula);
                rsSintomas = psSintomas.executeQuery();

                while (rsSintomas.next()) {
                    TblSintomas.addCell(rsSintomas.getString("tipo"));
                    TblSintomas.addCell(rsSintomas.getString("intensidad"));
                    TblSintomas.addCell(rsSintomas.getString("durabilidad"));
                    TblSintomas.addCell(rsSintomas.getString("fecharegistro"));
                }
                document.add(TblSintomas);

                document.close();

                JOptionPane.showMessageDialog(null, "El informe de síntomas se ha guardado con éxito.");

                JOptionPane.showMessageDialog(null,
                        "Se sugiere guardar el pdf en un lugar seguro,\nya sea subirlo a la nube o en un dispositivo de uso personal.",
                        "RECOMENDACIÓN",
                        JOptionPane.WARNING_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el PDF: " + e.getMessage());
            } finally {
                // Cerrar recursos
                try {
                    if (rsSintomas != null) rsSintomas.close();
                    if (psSintomas != null) psSintomas.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al verificar la cédula: " + e.getMessage());
        } finally {
            // Cerrar recursos de la verificación de cédula
            try {
                if (rsDP != null) rsDP.close();
                if (psDP != null) psDP.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    public void crearinformegeneral(){
        
        Document document = new Document(PageSize.A4.rotate());
        String dest = ".pdf";
        
        conexion_bd con = new conexion_bd();
        PreparedStatement psDP = null;
        ResultSet rsDP = null;
        PreparedStatement psCM = null;
        ResultSet rsCM = null;
        PreparedStatement psSintomas = null;
        ResultSet rsSintomas = null;
        PreparedStatement psCaM = null;
        ResultSet rsCaM = null;
        
        try {
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar respaldo en...");
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File Destino = fileChooser.getSelectedFile();
                PdfWriter.getInstance(document, new FileOutputStream(Destino + dest));
            }
            
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();
            
            Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
            Paragraph PTituloPrincipal = new Paragraph("- Informe general del historial -", fuenteNegrita);
            PTituloPrincipal.setSpacingAfter(10f);
            PTituloPrincipal.setAlignment(Element.ALIGN_CENTER);
            document.add(PTituloPrincipal);
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String FechaSalida = now.format(formatter);
            
            Font fuenteN = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
            Paragraph PFechaSalida = new Paragraph("Fecha de salida: " + FechaSalida, fuenteN);
            PFechaSalida.setSpacingAfter(10f);
            PFechaSalida.setAlignment(Element.ALIGN_CENTER);
            document.add(PFechaSalida);
            
            Font fuenteNegrita2 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
            Paragraph PDatosPersonales = new Paragraph("Datos Personales", fuenteNegrita2);
            PDatosPersonales.setSpacingAfter(10f);
            PDatosPersonales.setAlignment(Element.ALIGN_CENTER);
            document.add(PDatosPersonales);
            
            PdfPTable TblDatosPersonales = new PdfPTable(8);
            
            TblDatosPersonales.setWidthPercentage(100); 
            
            TblDatosPersonales.addCell("Cédula");
            TblDatosPersonales.addCell("Nacionalidad");
            TblDatosPersonales.addCell("Nombre");
            TblDatosPersonales.addCell("F. Nacimiento");
            TblDatosPersonales.addCell("Correo");
            TblDatosPersonales.addCell("Peso");
            TblDatosPersonales.addCell("Altura");
            TblDatosPersonales.addCell("Registro");
            
            String consultaDP = "SELECT * FROM estudiantef;";
            psDP = con.establecerConexion().prepareStatement(consultaDP);
            rsDP = psDP.executeQuery();
            
            while (rsDP.next()) { 
                TblDatosPersonales.addCell(rsDP.getString("cedula"));
                TblDatosPersonales.addCell(rsDP.getString("nacionalidad"));
                TblDatosPersonales.addCell(rsDP.getString("nombre"));
                TblDatosPersonales.addCell(rsDP.getString("fechanace"));
                TblDatosPersonales.addCell(rsDP.getString("correo"));
                TblDatosPersonales.addCell(rsDP.getString("peso"));
                TblDatosPersonales.addCell(rsDP.getString("altura"));
                TblDatosPersonales.addCell(rsDP.getString("fecharegistro"));
            }
            document.add(TblDatosPersonales);
            
            Paragraph PCicloMenstrual = new Paragraph("Ciclo Menstrual", fuenteNegrita2);
            PCicloMenstrual.setSpacingAfter(10f);
            PCicloMenstrual.setAlignment(Element.ALIGN_CENTER);
            document.add(PCicloMenstrual);
            
            PdfPTable TblCicloMenstrual = new PdfPTable(11);
            
            TblCicloMenstrual.setWidthPercentage(100);
            
            TblCicloMenstrual.addCell("Cédula");
            TblCicloMenstrual.addCell("Fecha Inicio-U");
            TblCicloMenstrual.addCell("Fecha Inicio-A");
            TblCicloMenstrual.addCell("Intensidad del flujo");
            TblCicloMenstrual.addCell("Duración");
            TblCicloMenstrual.addCell("Estado");
            TblCicloMenstrual.addCell("Días fértiles");
            TblCicloMenstrual.addCell("Días de seguridad");
            TblCicloMenstrual.addCell("Próximo ciclo");
            TblCicloMenstrual.addCell("Ovulación");
            TblCicloMenstrual.addCell("Registro");
            
            String consultaCM = "SELECT * FROM ciclomenstrual;";
            psCM = con.establecerConexion().prepareStatement(consultaCM);
            rsCM = psCM.executeQuery();
            
            while (rsCM.next()) { 
                TblCicloMenstrual.addCell(rsCM.getString("cedula"));
                TblCicloMenstrual.addCell(rsCM.getString("fechainiciou"));
                TblCicloMenstrual.addCell(rsCM.getString("fechainicioa"));
                TblCicloMenstrual.addCell(rsCM.getString("intensidadflujo"));
                TblCicloMenstrual.addCell(rsCM.getString("duracion"));
                TblCicloMenstrual.addCell(rsCM.getString("estado"));
                String DFA = rsCM.getString("diasfertilesantes");
                String DFD = rsCM.getString("diasfertilesdespues");
                TblCicloMenstrual.addCell(DFA + " al " + DFD);
                String DSA = rsCM.getString("diasseguridadantes");
                String DSD = rsCM.getString("diasseguridaddespues");
                TblCicloMenstrual.addCell(DSA + " al " + DSD);
                TblCicloMenstrual.addCell(rsCM.getString("proximociclo"));
                TblCicloMenstrual.addCell(rsCM.getString("ovulacion"));
                TblCicloMenstrual.addCell(rsCM.getString("fecharegistro"));
            }
            document.add(TblCicloMenstrual);
            
            Paragraph PSintomas = new Paragraph("Síntomas", fuenteNegrita2);
            PSintomas.setSpacingAfter(10f);
            PSintomas.setAlignment(Element.ALIGN_CENTER);
            document.add(PSintomas);
            
            PdfPTable TblSintomas = new PdfPTable(5);
            
            TblSintomas.setWidthPercentage(100); 
            
            TblSintomas.addCell("Cédula");
            TblSintomas.addCell("Tipo");
            TblSintomas.addCell("Intensidad");
            TblSintomas.addCell("Durabilidad");
            TblSintomas.addCell("Registro");
            
            String consultaSin = "SELECT * FROM sintomas;";
            psSintomas = con.establecerConexion().prepareStatement(consultaSin);
            rsSintomas = psSintomas.executeQuery();
            
            while (rsSintomas.next()) { 
                TblSintomas.addCell(rsSintomas.getString("cedula"));
                TblSintomas.addCell(rsSintomas.getString("tipo"));
                TblSintomas.addCell(rsSintomas.getString("intensidad"));
                TblSintomas.addCell(rsSintomas.getString("durabilidad"));
                TblSintomas.addCell(rsSintomas.getString("fecharegistro"));
            }
            document.add(TblSintomas);
            
            Paragraph PCambios = new Paragraph("Cambios", fuenteNegrita2);
            PCambios.setSpacingAfter(10f);
            PCambios.setAlignment(Element.ALIGN_CENTER);
            document.add(PCambios);
            
            PdfPTable TblCambios = new PdfPTable(5);
            
            TblSintomas.setWidthPercentage(100); 
            
            TblCambios.addCell("Cédula");
            TblCambios.addCell("Humor");
            TblCambios.addCell("Tipo de dolor");
            TblCambios.addCell("Sensibilidad emocional");
            TblCambios.addCell("Registro");
            
            String consultaCam = "SELECT * FROM cambiomenstruacion;";
            psCaM = con.establecerConexion().prepareStatement(consultaCam);
            rsCaM = psCaM.executeQuery();
            
            while (rsCaM.next()) { 
                TblCambios.addCell(rsCaM.getString("cedula"));
                TblCambios.addCell(rsCaM.getString("humor"));
                TblCambios.addCell(rsCaM.getString("tipodolor"));
                TblCambios.addCell(rsCaM.getString("sensiemocional"));
                TblCambios.addCell(rsCaM.getString("fecharegistro"));
            }
            document.add(TblCambios);
            
            document.close();
            
            JOptionPane.showMessageDialog(null, "El informe general se ha guardado con éxito.");
            
            JOptionPane.showMessageDialog(null,
                    "Se sugiere guardar el pdf en un lugar seguro,\nya sea subirlo a la nube o en un dispositivo de uso personal.",
                    "RECOMENDACIÓN",
                    JOptionPane.WARNING_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el PDF: " + e.getMessage());
        }
        
    }
    
}
