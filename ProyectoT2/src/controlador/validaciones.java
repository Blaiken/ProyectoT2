package controlador;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vista.DatosPersonales;
import vista.MenuUsuaria;

public class validaciones {
    
    // Vista - DatosPersonales
    
    public void ReglaN1(JTextField TextNombre, java.awt.event.KeyEvent evt) {
        
        int rn1 = evt.getKeyChar();

        if (TextNombre.getText().length() >= 30) {
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }

        boolean mayusculas = rn1 >= 65 && rn1 <= 90;
        boolean minusculas = rn1 >= 97 && rn1 <= 122;
        boolean espacio = rn1 == 32;
        boolean borrar = rn1 == 8;

        if (!(minusculas || mayusculas || espacio || borrar)) {
            
            evt.consume();
            JOptionPane.showMessageDialog(null,
            "No puedes usar números ni caracteres especiales.",
            "Error",
            JOptionPane.WARNING_MESSAGE);  
        }
    }
    
    public void ReglaN3(JTextField TextPeso, java.awt.event.KeyEvent evt){
        
        int rn3 = evt.getKeyChar();
        
        boolean numeros = rn3 >= 48 && rn3 <= 57;
        boolean borrar = rn3 == 8;
        boolean coma = rn3 == 44;
        
        if (!(numeros || borrar || coma))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "El caracter ingresado no es un número.",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }

        if (TextPeso.getText().length() == 6) {
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public void BtnValidacion(JButton BtnSiguiente, JTextField TextNombre, JTextField TextPeso, JTextField TextEstatura, DatosPersonales dp){
        
        if(TextNombre.getText().length() >= 3 && TextPeso.getText().length() >= 5 && TextEstatura.getText().length() >= 5){
            MenuUsuaria mu = new MenuUsuaria();
            mu.setLocationRelativeTo(null);
            mu.setVisible(true);
            dp.setVisible(false);
        } else if (TextNombre.getText().length() < 3) {
            JOptionPane.showMessageDialog(null,
                    "Necesita un minímo de 3 letras para continuar.",
                    "¡ERROR EN NOMBRE!",
                    JOptionPane.WARNING_MESSAGE);
        } else if (TextPeso.getText().length() < 5) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 5 números.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
        } else if (TextEstatura.getText().length() < 5) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 5 números.",
                    "¡ERROR EN ESTATURA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
