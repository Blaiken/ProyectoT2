package controlador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import vista.CicloMenstrual;
import vista.MenuInicio;
import vista.DatosPersonales;
import vista.EditarPerfil;
import vista.Ginecologa;
import vista.HistorialCiclo;
import vista.MenuUsuaria;
import vista.SintomasyCambios;
import vista.Confidencialidad;

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
    
    public void btnlimpiardatospersonales(JTextField TextNombre, JComboBox CboxAno, JComboBox CboxMes, JComboBox CboxDia,JTextField TextPeso, JTextField TextEstatura){
        TextNombre.setText("");
        CboxAno.setSelectedItem("Año");
        CboxMes.setSelectedItem("Mes");
        CboxDia.setSelectedItem("Día");
        TextPeso.setText("");
        TextEstatura.setText("");
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
    
    public void btnmenuusuaria_a_editarperfil(JButton BtnEditarPerfil, MenuUsuaria mu){
        EditarPerfil ep = new EditarPerfil();
        ep.setLocationRelativeTo(null);
        ep.setVisible(true);
        mu.setVisible(false);
    }
    
    // Vista - CicloMenstrual
    public void btnciclomenstrual_a_menuusuaria(JButton BtnVolver, CicloMenstrual cm){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        cm.setVisible(false);
    }
    
    public void btnlimpiarciclomenstrual(JComboBox CboxAnoInicio, JComboBox CboxMesInicio, JComboBox CboxDiaInicio, JComboBox CboxAnoFinal, JComboBox CboxMesFinal, JComboBox CboxDiaFinal, JComboBox CboxIntensidadFlujo){
        CboxAnoInicio.setSelectedItem("Año");
        CboxMesInicio.setSelectedItem("Mes");
        CboxDiaInicio.setSelectedItem("Día");
        CboxAnoFinal.setSelectedItem("Año");
        CboxMesFinal.setSelectedItem("Mes");
        CboxDiaFinal.setSelectedItem("Día");
        CboxIntensidadFlujo.setSelectedItem("Ninguna");
    }
    
    // Vista - SintomasyCambios
    public void btnsintomasycambios_a_menuusuaria(JButton BtnVolver, SintomasyCambios syc){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        syc.setVisible(false);
    }
    
    public void btnlimpiarsintomasycambios(JComboBox CboxTipo, JComboBox CboxIntensidad, JComboBox CboxDurabilidad, JComboBox CboxHumor, JComboBox CboxTipoDolor, JComboBox CboxSensibilidadEmocional){
        CboxTipo.setSelectedItem("Ninguno");
        CboxIntensidad.setSelectedItem("Ninguno");
        CboxDurabilidad.setSelectedItem("Ninguno");
        CboxHumor.setSelectedItem("Ninguno");
        CboxTipoDolor.setSelectedItem("Ninguno");
        CboxSensibilidadEmocional.setSelectedItem("Ninguna");
    }
    
    // Vista - HistorialCiclo
    public void btnhistorialciclos_a_menuusuaria(JButton BtnVolver, HistorialCiclo hc){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        hc.setVisible(false);
    }
    
    // Vista - EditarPerfil
    public void btneditarperfil_a_menuusuaria(JButton BtnVolver, EditarPerfil ep){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        ep.setVisible(false);
    }
    
    public void btnprivacidad_a_confidencialidad(JButton BtnConfidencialidad, EditarPerfil ep){
        Confidencialidad con = new Confidencialidad();
        con.setLocationRelativeTo(null);
        con.setVisible(true);
        ep.setVisible(false);
    }
    
    // Vista - Confidencialidad
    public void btnconfidencialidad_a_editarperfil(JButton BtnVolver, Confidencialidad con){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        con.setVisible(false);
    }
}
