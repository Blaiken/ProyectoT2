package controlador;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemEvent;
import javax.swing.*;
import vista.*;

public class controlador {
    
    // Vista - MenuInicio
    public void btncrearcuenta(JButton BtnCrearCuenta, MenuInicio MI){
        DatosPersonales dp = new DatosPersonales();
        dp.setLocationRelativeTo(null);
        dp.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btniniciarsesion(JButton BtnIniciarSesion, MenuInicio MI){
        IniciarSesion is = new IniciarSesion();
        is.setLocationRelativeTo(null);
        is.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btnginecologa(JButton BtnGinecologa, MenuInicio MI){
        Ginecologa gi = new Ginecologa();
        gi.setLocationRelativeTo(null);
        gi.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btnhistorial(JButton BtnHistorial, MenuInicio MI){
        HistorialCiclo hc = new HistorialCiclo();
        hc.setLocationRelativeTo(null);
        hc.setVisible(true);
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
    
    public void btnlimpiardatospersonales(JTextField TextNombre, JDateChooser FechaNacimiento,JTextField TextPeso, JTextField TextEstatura){
        TextNombre.setText("");
        FechaNacimiento.setDate(null);
        TextPeso.setText("");
        TextEstatura.setText("");
    }
    
    // Vista - IniciarSesión
    public void btniniciarsesion_a_menuinicio(JButton BtnAtras, IniciarSesion is){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        is.setVisible(false);
    }
    
    public void btnlimpiariniciarsesion(JButton BtnLimpia, JTextField TextNombre, JDateChooser FechaNacimiento){
        TextNombre.setText("");
        FechaNacimiento.setDate(null);
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
    
    public void btnmenuusuaria_a_educacion(JButton BtnGinecologa, MenuUsuaria mu){
        Educacion ed = new Educacion();
        ed.setLocationRelativeTo(null);
        ed.setVisible(true);
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
    
    public void btnlimpiarciclomenstrual(JDateChooser FechaInicio, JDateChooser FechaFinal, JComboBox CboxIntensidadFlujo){
        FechaInicio.setDate(null);
        FechaFinal.setDate(null);
        CboxIntensidadFlujo.setSelectedItem("Ninguna");
    }
    
    // Vista - Resultados
    public void btnresultados_a_menuusuaria(JButton BtnAtras, Resultados res){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        res.setVisible(false);
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
    
    // Vista - Educacion
    public void btneducacion_a_menusuaria(JButton BtnVolver, Educacion edu){
        MenuUsuaria mu = new MenuUsuaria();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        edu.setVisible(false);
    }
    
    // Vista - HistorialCiclo
    public void btnhistorialciclo_a_menuinicio(JButton BtnVolver, HistorialCiclo hc){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
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