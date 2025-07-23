package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class control_ec {
    
    conexion_bd con = new conexion_bd();
    
    public void MostrarCorreo(JLabel LblCedula, JTextField TextCorreo){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            
            String consultaDP = "SELECT correo FROM estudiantef WHERE cedula = ?;";
            ps = con.establecerConexion().prepareStatement(consultaDP);
            ps.setString(1, LblCedula.getText());
            rs = ps.executeQuery();
            
            if (rs.next()){
                TextCorreo.setText(rs.getString("correo"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar el correo eletrónico.\nError: " + e.toString());
        }
        
    }
    
}
