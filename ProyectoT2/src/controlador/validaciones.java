package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class validaciones {
    
    // Vista - DatosPersonales
    
    public void Vnombre(JTextField TextNombre, java.awt.event.KeyEvent evt){
        
        int key = evt.getKeyChar();
        
        if(TextNombre.getText().length() >= 10)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el limite de caracteres.",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
            
        if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "No puedes usar nùmeros ni caracteres especiales.",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }          
}
