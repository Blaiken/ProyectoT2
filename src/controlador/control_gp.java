package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vista.GestionarPerfil;
import vista.MenuSalud;

public class control_gp {
    
    conexion_bd con = new conexion_bd();
    
    public void VerificarPersona(JComboBox CboxNacionalidad, JTextField TextCedula, GestionarPerfil gp){
        
        try {
            
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            con.establecerConexion();
            
            String consulta = "SELECT * FROM estudiantef WHERE estudiantef.nacionalidad = (?) AND estudiantef.cedula = (?);";
            
            ps = con.establecerConexion().prepareStatement(consulta);
            
            ps.setString(1, CboxNacionalidad.getSelectedItem().toString());
            ps.setString(2, TextCedula.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                
//                JOptionPane.showMessageDialog(null,
//                    "Se ha iniciado con éxito.",
//                    "¡INICIADO!",
//                    JOptionPane.INFORMATION_MESSAGE);
            
                MenuSalud mu = new MenuSalud();
                mu.setLocationRelativeTo(null);
                mu.setVisible(true);
                gp.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,
                    "Se ha encontrado un problema. Verifique.",
                    "¡UN PROBLEMA!",
                    JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    }
    
}
