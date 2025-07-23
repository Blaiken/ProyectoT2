package controlador;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.EstudianteF;

public class control_dp {
    
    conexion_bd con = new conexion_bd();
    
    public void InsertarDP(JTextField TextNombre, JComboBox CboxNacionalidad, JTextField TextCedula, JDateChooser DateFechaNacimiento, JTextField TextCorreo, JTextField TextPeso, JTextField TextEstatura){
        
        EstudianteF estuF = new EstudianteF();
        
        estuF.setCedula(Integer.parseInt(TextCedula.getText().trim()));
        estuF.setNombre(TextNombre.getText());
        estuF.setFecha_nacimiento(DateFechaNacimiento.getDate());
        estuF.setNacionalidad(CboxNacionalidad.getSelectedItem().toString());
        estuF.setCorreo(TextCorreo.getText().toLowerCase().trim());
        estuF.setPeso(Double.parseDouble(TextPeso.getText()));
        estuF.setAltura(Integer.parseInt(TextEstatura.getText()));

        String consulta = "INSERT INTO estudiantef (cedula,nacionalidad,nombre,fechanace,correo,peso,altura,fecharegistro) VALUES (?,?,?,?,?,?,?,?);";

        try {
            java.sql.Date sqlDatoFN = new java.sql.Date(estuF.getFecha_nacimiento().getTime());
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fechaFormateada = now.format(formatter);
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);

            cs.setInt(1, estuF.getCedula());
            cs.setString(2, estuF.getNacionalidad());
            cs.setString(3, estuF.getNombre());
            cs.setDate(4, sqlDatoFN);
            cs.setString(5, estuF.getCorreo());
            cs.setDouble(6, estuF.getPeso());
            cs.setInt(7, estuF.getAltura());
            cs.setString(8, fechaFormateada);

            cs.execute();

            JOptionPane.showMessageDialog(null,
                    "Se ha registrado correctamente.",
                    "¡TODO LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se inserto la estudiante.\nError: " +e.toString());
            }
    }
    
    
    
}
