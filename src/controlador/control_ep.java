package controlador;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class control_ep {
    
    conexion_bd con = new conexion_bd();
    
    public void MostrarEditarPerfil(JLabel LabelCedula, JTextField TextNombre, JTextField TextCedula, JTextField TextFechaNacimiento, JTextField TextCorreo, JTextField TextPeso, JTextField TextEstatura){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            
            String consultaDP = "SELECT nombre,nacionalidad,cedula,fechanace,correo,peso,altura FROM estudiantef WHERE cedula = ?;";
            ps = con.establecerConexion().prepareStatement(consultaDP);
            ps.setString(1, LabelCedula.getText());
            rs = ps.executeQuery();
            
            if (rs.next()){
                TextNombre.setText(rs.getString("nombre"));
                String Nacionalidad = rs.getString("nacionalidad");
                String Cedula = rs.getString("cedula");
                TextCedula.setText(Nacionalidad + "-" + Cedula);
                TextFechaNacimiento.setText(rs.getString("fechanace"));
                TextCorreo.setText(rs.getString("correo"));
                TextPeso.setText(rs.getString("peso"));
                TextEstatura.setText(rs.getString("altura"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void GuardarEditarPerfil(JLabel LabelCedula, JTextField TextCorreo, JTextField TextPeso, JTextField TextEstatura){
        
        String consulta = "UPDATE estudiantef SET correo = ?, peso = ?, altura = ? WHERE cedula = ?;";
        
        try {
            
                CallableStatement cs = con.establecerConexion().prepareCall(consulta);
                
                cs.setString(1, TextCorreo.getText());
                cs.setFloat(2, Float.parseFloat(TextPeso.getText()));
                cs.setInt(3, Integer.parseInt(TextEstatura.getText()));
                cs.setInt(4, Integer.parseInt(LabelCedula.getText()));

                cs.execute();

                JOptionPane.showMessageDialog(null,
                    "Guardado con éxito los cambios.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } 
    }
}
