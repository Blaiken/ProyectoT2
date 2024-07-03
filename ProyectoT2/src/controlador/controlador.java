package controlador;

import javax.swing.JButton;
import vista.CicloMenstrual;
import vista.MenuInicio;
import vista.DatosPersonales;
import vista.Ginecologa;
import vista.HistorialCiclo;
import vista.MenuUsuaria;
import vista.SintomasyCambios;

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
    
    // Vista - MenuUsuaria
    public void btnmenuusuaria_a_ciclomenstrual(JButton BtnCicloMenstrual, MenuUsuaria mu){
        CicloMenstrual cm = new CicloMenstrual();
        cm.setLocationRelativeTo(null);
        cm.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_sintomasycambios(JButton BtnSintomasyCambios, MenuUsuaria mu){
        SintomasyCambios syc = new SintomasyCambios();
        syc.setLocationRelativeTo(null);
        syc.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_ginecologa(JButton BtnGinecologa, MenuUsuaria mu){
        Ginecologa gi = new Ginecologa();
        gi.setLocationRelativeTo(null);
        gi.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_historial(JButton BtnHistorial, MenuUsuaria mu){
        HistorialCiclo hc = new HistorialCiclo();
        hc.setLocationRelativeTo(null);
        hc.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_menuinicio(JButton BtnMenuInicio, MenuUsuaria mu){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        mu.setVisible(false);
    }
    
    // Vista - CicloMenstrual
    public void btnciclomenstrual_a_menuusuaria(JButton BtnVolver, CicloMenstrual cm){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        cm.setVisible(false);
    }
    
    // Vista - SintomasyCambios
    public void btnsintomasycambios_a_menuusuaria(JButton BtnVolver, SintomasyCambios syc){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        syc.setVisible(false);
    }
    
    // Vista - HistorialCiclo
    public void btnhistorialciclos_a_menuusuaria(JButton BtnVolver, HistorialCiclo hc){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        hc.setVisible(false);
    }
}
