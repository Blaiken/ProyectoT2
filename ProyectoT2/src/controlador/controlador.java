package controlador;

import javax.swing.JButton;
import vista.MenuInicio;
import vista.DatosPersonales;

public class controlador {
    
    // Vista - MenuInicio
    public void crearcuenta(JButton BtnCrearCuenta, MenuInicio MI){
        DatosPersonales dp = new DatosPersonales();
        dp.setLocationRelativeTo(null);
        dp.setVisible(true);
        MI.setVisible(false);
    }
    
    public void salir(){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        MenuInicio inicio = new MenuInicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    
    }    
}
