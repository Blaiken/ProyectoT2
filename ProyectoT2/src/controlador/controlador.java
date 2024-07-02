package controlador;

import javax.swing.JButton;
import vista.MenuInicio;
import vista.DatosPersonales;
import vista.Ginecologa;
import vista.MenuUsuaria;

public class controlador {
    
    // Vista - MenuInicio
    public void btncrearcuenta(JButton BtnCrearCuenta, MenuInicio MI){
        DatosPersonales dp = new DatosPersonales();
        dp.setLocationRelativeTo(null);
        dp.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btnginecologa(JButton BtnGinecologa, MenuInicio MI){
        Ginecologa gi = new Ginecologa();
        gi.setLocationRelativeTo(null);
        gi.setVisible(true);
        MI.setVisible(false);
    }
    
    public void salir(){
        System.exit(0);
    }
    
    // Vista - DatosPersonales
    public void btndatospersonales_a_menuinicio(JButton BtnAtras, DatosPersonales dp){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        dp.setVisible(false);
    }
    
    public void btndatospersonales_a_menuusuaria(JButton BtnSiguiente, DatosPersonales dp){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        dp.setVisible(false);
    }
    
    // Vista - Ginecologa
    public void btnginecologa_a_menuinicio(JButton BtnAtras, Ginecologa gi){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        gi.setVisible(false);
    }
}
