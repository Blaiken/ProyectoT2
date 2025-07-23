package controlador;

import com.itextpdf.text.BadElementException;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;

public class controlador {
    
    // Iniciar Programa
    public void crearusuariopordefecto(){
        
        File ficheroDatos = new File("Login.txt");
        
        if(ficheroDatos.exists()){
            //No crear nada
        }
        else{
            try {

                if (ficheroDatos.createNewFile()) {
                }            
                }catch(IOException error){
                    System.out.println("Error al crear el fichero.");
                    error.printStackTrace();
                }
            
            try{            
            FileWriter escritorDeFichero = new FileWriter("Login.txt");            
            escritorDeFichero.write("Usuario:\nAdministradora\nContraseña:\n123456789");
            escritorDeFichero.close();
            }catch (IOException error){
            System.out.println("Error escribir en el fichero.");
            error.printStackTrace();
            }
        }
    }
    
    // Vista - LoginP
    public void lbleditardatosacceso(JLabel LabelEditarDatos, LoginP lp){
        EditarDatosAcceso eda = new EditarDatosAcceso();
        eda.setLocationRelativeTo(null);
        eda.setVisible(true);
        lp.setVisible(false);
    }
    
    public void lblrecupacceso(JLabel LabelRecupAcceso, LoginP lp){
        RecupAcceso RA = new RecupAcceso();
        RA.setLocationRelativeTo(null);
        RA.setVisible(true);
        lp.setVisible(false);
    }
    
    public void btnlimpiarloginp(JTextField TextUsuaria, JPasswordField TextContrasena){
        TextUsuaria.setText("");
        TextContrasena.setText("");
    }
    
    public void btnsalir(){
        System.exit(0);
    }
    
    // Vista - EditarDatosAcceso
    public void btneditardatosacceso_a_loginp(JButton BtnVolver, EditarDatosAcceso eda){
        LoginP lp = new LoginP();
        lp.setLocationRelativeTo(null);
        lp.setVisible(true);
        eda.setVisible(false);
    }
    
    public void btnlimpiareditardatosacceso(JTextField TextUsuariaAnterior, JPasswordField TextContraAnterior, JTextField TextUsuariaNuevo, JPasswordField TextContraNuevo){
        TextUsuariaAnterior.setText("");
        TextContraAnterior.setText("");
        TextUsuariaNuevo.setText("");
        TextContraNuevo.setText("");
    }
    
    // Vista - RecupAcceso
    public void btnrecupacceso_a_loginp(JButton BtnVolver, RecupAcceso RA){
        LoginP lp = new LoginP();
        lp.setLocationRelativeTo(null);
        lp.setVisible(true);
        RA.setVisible(false);
    }
    
    // Vista - MenuInicio
    public void btncrearcuenta(JButton BtnCrearCuenta, MenuInicio MI){
        vDatosPersonales dp = new vDatosPersonales();
        dp.setLocationRelativeTo(null);
        dp.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btniniciarsesion(JButton BtnIniciarSesion, MenuInicio MI){
        GestionarPerfil is = new GestionarPerfil();
        is.setLocationRelativeTo(null);
        is.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btnhistorial(JButton BtnHistorial, MenuInicio MI){
        vHistorialCiclo hc = new vHistorialCiclo();
        hc.setLocationRelativeTo(null);
        hc.setVisible(true);
        MI.setVisible(false);
    }
    
    public void btnmenuinicio_a_loginp(JButton BtnCerrar, MenuInicio MI){
        LoginP lp = new LoginP();
        lp.setLocationRelativeTo(null);
        lp.setVisible(true);
        MI.setVisible(false);
    }
    
    // Vista - vDatosPersonales
    public void btndatospersonales_a_menuinicio(JButton BtnAtras, vDatosPersonales dp){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        dp.setVisible(false);
    }
    
    public void btndatospersonales_a_menuusuaria(JButton BtnSiguiente, vDatosPersonales dp){
        MenuSalud mu = new MenuSalud();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        dp.setVisible(false);
    }
    
    public void btnlimpiardatospersonales(JTextField TextNombre, JComboBox CboxNacionalidad, JTextField TextCedula, JDateChooser FechaNacimiento, JTextField TextCorreo, JTextField TextPeso, JTextField TextEstatura){
        TextNombre.setText("");
        CboxNacionalidad.setSelectedItem("---");
        TextCedula.setText("");
        FechaNacimiento.setDate(null);
        TextCorreo.setText("");
        TextPeso.setText("");
        TextEstatura.setText("");
    }
    
    public static String cedula;
    
    public void dpcedula_a_cmcedula(JTextField TextCedula){
        cedula = TextCedula.getText();
    }
    
    // Vista - GestionarPerfil
    public void btngestionarperfil_a_menuinicio(JButton BtnAtras, GestionarPerfil gp){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        gp.setVisible(false);
    }
    
    public void btnlimpiargestionaperfil(JButton BtnLimpia, JComboBox CboxNacionalidad, JTextField TextCedula){ 
        CboxNacionalidad.setSelectedItem("---");
        TextCedula.setText("");
    }
    
    // Vista - MenuSalud
    public void btnmenuusuaria_a_ciclomenstrual(JButton BtnCicloMenstrual, MenuSalud mu){
        vCicloMenstrual cm = new vCicloMenstrual();
        cm.setLocationRelativeTo(null);
        cm.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_pruebaembazaro(MenuSalud mu){
        FechaUP pe = new FechaUP();
        pe.setLocationRelativeTo(null);
        pe.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_sintomasycambios(JButton BtnSintomasyCambios, MenuSalud mu){
        vSintomasyCambios syc = new vSintomasyCambios();
        syc.setLocationRelativeTo(null);
        syc.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_menuinicio(JButton BtnMenuInicio, MenuSalud mu){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_diagnostico(JButton BtnDiagnostico, MenuSalud mu){
        vDiagnostico diag = new vDiagnostico();
        diag.setLocationRelativeTo(null);
        diag.setVisible(true);
        mu.setVisible(false);
    }
    
    public void btnmenuusuaria_a_editarperfil(JButton BtnEditarPerfil, MenuSalud mu){
        EditarPerfil ep = new EditarPerfil();
        ep.setLocationRelativeTo(null);
        ep.setVisible(true);
        mu.setVisible(false);
    }
    
    public void guiaginecologa(){
        Object seleccion = JOptionPane.showInputDialog(null,
        "Ingrese la opción que desea realizar", "SELECCIÓN",
        JOptionPane.QUESTION_MESSAGE, null, new Object[]
        {"Crear guìa ginecólogica","Enviar guía ya existente"}, "Crear guìa ginecólogica");

        if(seleccion == "Crear guìa ginecólogica"){
            generarguia();
        }
        if(seleccion == "Enviar guía ya existente"){
            enviarguia();
        }
    }
    
    public void generarguia(){
        guiapdf gpdf = new guiapdf();
        try {
            gpdf.crearPDF();
        } catch (BadElementException ex) {
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void enviarguia(){
        EnviarGuia eg = new EnviarGuia();
        eg.setLocationRelativeTo(null);
        eg.setVisible(true);
    }
    
    // Vista - CicloMenstrual
    public void btnciclomenstrual_a_menuusuaria(JButton BtnVolver, vCicloMenstrual cm){
        MenuSalud mu = new MenuSalud();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        cm.setVisible(false);
    }
    
    public void btnlimpiarciclomenstrual(JDateChooser FechaInicio, JDateChooser FechaFinal, JComboBox CboxIntensidadFlujo){
        FechaInicio.setDate(null);
        FechaFinal.setDate(null);
        CboxIntensidadFlujo.setSelectedItem("Ninguna");
    }
    
    // Vista - PruebaEmbarazo
    public void btnpruebaembarazo_a_menuusuaria(FechaUP pe){
        MenuSalud mu = new MenuSalud();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        pe.setVisible(false);
    }
    
    public static String duracion = "No hay datos.";
    
    public void fup_a_diag(JLabel LblDuracion){
        duracion = "Tienes un retraso de " + LblDuracion.getText() + " dìas.";
    }

    public void examinar(JDateChooser FIU, JLabel LblDias) {
        Date fechaSeleccionada = FIU.getDate();
        Date fechaActual = new Date();

        if (fechaSeleccionada != null) {
            long diferenciaEnMilisegundos = fechaActual.getTime() - fechaSeleccionada.getTime();
            long duracionEnDias = TimeUnit.DAYS.convert(diferenciaEnMilisegundos, TimeUnit.MILLISECONDS);
            
            if(duracionEnDias >= 61){
                JOptionPane.showMessageDialog(null, "Tienes un retraso de " + duracionEnDias + " dìas\nLo màs recomendable es que hagas una prueba de embarazo.");
                LblDias.setText(String.valueOf(duracionEnDias));
            }
            else{
                JOptionPane.showMessageDialog(null, "Aún estás en el rango en el que te puede venir el periodo\nEspera, si persiste es recomendable hacer una prueba de embarazo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha.");
        }
    }

    
    // Vista - vSintomasyCambios
    public void btnsintomasycambios_a_menuusuaria(JButton BtnVolver, vSintomasyCambios syc){
        MenuSalud mu = new MenuSalud();
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
    
    public void cboxingresarotrosintoma(JComboBox CboxTipo, JTextPane TextOS){
        String sintoma = CboxTipo.getSelectedItem().toString();
        
        if (sintoma.equalsIgnoreCase("Otro")) {
            TextOS.setEnabled(true);
        } else {
            TextOS.setEnabled(false);
        }
    }
    
    public void btnagregarsintoma(JTable TbSintomas, JComboBox CboxTipo, JTextPane TextOS, JComboBox CboxDurabilidad, JComboBox CboxIntensidad){
        
        DefaultTableModel modelo = (DefaultTableModel) TbSintomas.getModel();
        
        if (CboxTipo.getSelectedItem().toString().equalsIgnoreCase("otro") && TextOS.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar el sintoma en el campo 'Otro'.",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE);
            
        } else if (CboxTipo.getSelectedItem().toString().equalsIgnoreCase("ninguno")) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar un tipo de sintoma.",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE);
            
        } else if (CboxDurabilidad.getSelectedItem().toString().equalsIgnoreCase("ninguno")) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar una durabilidad.",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE);
            
        }  else if (CboxIntensidad.getSelectedItem().toString().equalsIgnoreCase("ninguno")) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar una intensidad.",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        String tipoSeleccionado = CboxTipo.getSelectedItem().toString();
        String tipo;
        
        if (tipoSeleccionado.equalsIgnoreCase("otro")) {
            tipo = TextOS.getText();
        } else {
            tipo = tipoSeleccionado;
        }
        
        modelo.addRow(new Object[]{tipo, CboxDurabilidad.getSelectedItem().toString(), CboxIntensidad.getSelectedItem().toString()});
        
        CboxTipo.setSelectedIndex(0);
        CboxDurabilidad.setSelectedIndex(0);
        CboxIntensidad.setSelectedIndex(0);
        TextOS.setText("");
        TextOS.setEnabled(false);
    }
    
    // Vista - Diagnostico
    public void btnvolver_a_menusalud(JButton BtnVolver, vDiagnostico diag){
        MenuSalud mu = new MenuSalud();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        diag.setVisible(false);
    }
    
    public void btninforme(JLabel TextNombre, JLabel TextCedula, JLabel LblFechaNacimiento, JLabel TextCorreo,
                JLabel TextPeso, JLabel TextEstatura, JLabel TextFechaInicioU, JLabel TextFechaInicioA, JLabel TextIntecidadFlujo, 
                JLabel TextDuracion, JLabel TextOvulacion, JLabel TextDiasFertiles, JLabel TextDiasSeguridad, JLabel TextProximoCiclo, JLabel TextPeriodo, JTable sintomas, vDiagnostico vdiag) {
        
        Object seleccion = JOptionPane.showInputDialog(null,
        "Ingrese la opción que desea realizar", "SELECCIÓN",
        JOptionPane.QUESTION_MESSAGE, null, new Object[]
        {"Crear informe","Enviar un informe ya existente"}, "Crear informe");

        if(seleccion == "Crear informe"){
            btncrearinforme(TextNombre, TextCedula, LblFechaNacimiento, TextCorreo, TextPeso, TextEstatura, TextFechaInicioU, TextFechaInicioA, TextIntecidadFlujo, TextDuracion, TextOvulacion, TextDiasFertiles, TextDiasSeguridad, TextProximoCiclo, TextPeriodo, sintomas, vdiag);
        }
        if(seleccion == "Enviar un informe ya existente"){
            Compartir();
        }
    }
    
    public void btncrearinforme(JLabel TextNombre, JLabel TextCedula, JLabel LblFechaNacimiento, JLabel TextCorreo,
                JLabel TextPeso, JLabel TextEstatura, JLabel TextFechaInicioU, JLabel TextFechaInicioA, JLabel TextIntecidadFlujo, 
                JLabel TextDuracion, JLabel TextOvulacion, JLabel TextDiasFertiles, JLabel TextDiasSeguridad, JLabel TextProximoCiclo, JLabel TextPeriodo, JTable sintomas, vDiagnostico vdiag){
        
        Diagnostico diag = new Diagnostico();
        
        try {
            diag.generar_reporte(TextNombre, TextCedula, LblFechaNacimiento, TextCorreo,
                    TextPeso, TextEstatura, TextFechaInicioU, TextFechaInicioA, TextIntecidadFlujo,
                    TextDuracion, TextOvulacion, TextDiasFertiles, TextDiasSeguridad, TextProximoCiclo, TextPeriodo, sintomas);
        } catch (BadElementException ex) {
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Compartir();
    }
    
    private void Compartir(){
        
        String[] op = {"Si","No"};
        
        int opcion = JOptionPane.showOptionDialog(null,
            "¿Desea compartir el diágnostico directamente?",
            "Selecciona una opción...", JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
        
        if(opcion == 0){
            EnviarCorreo ec = new EnviarCorreo();
            ec.setLocationRelativeTo(null);
            ec.setVisible(true);
        }
        else if(opcion == 1){
            JOptionPane.showMessageDialog(null,
                    "No se ha compartido.",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Vista - EnviarCorreo
    public void btnenviarcorreo_a_diagnostico(EnviarCorreo ec){
        ec.setVisible(false);
    }
    
    Diagnostico diag = new Diagnostico();
    
    public void btnmostrararchivo(JLabel LblArchivoSeleccionado, EnviarCorreo ec) {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (chooser.showOpenDialog(ec) != JFileChooser.CANCEL_OPTION) {
            File archivoSeleccionado = chooser.getSelectedFile();

            if (archivoSeleccionado != null) {
                diag.setArchivosAdjuntos(new File[]{archivoSeleccionado});
                diag.nombres_archivos = archivoSeleccionado.getName();
            }

            LblArchivoSeleccionado.setText("<html><p>" + diag.nombres_archivos + "</p></html>");
        }
    }
    
    public void btncompartir(JTextField LblCorreo, JLabel LblNombre){
        JOptionPane.showMessageDialog(null,
                "Puede durar unos segundos en enviarse...\nPor favor, espere.",
                "AVISO",
                JOptionPane.INFORMATION_MESSAGE);
        diag.Compartir(LblCorreo, LblNombre);
    }
    
    //V Vista - EnviarGuia
    public void btnenviarguia_a_menuinicio(EnviarGuia eg){
        eg.setVisible(false);
    }
    
    public void btnmostrararchivoEG(JLabel LblArchivoSeleccionado, EnviarGuia eg) {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (chooser.showOpenDialog(eg) != JFileChooser.CANCEL_OPTION) {
            File archivoSeleccionado = chooser.getSelectedFile();

            if (archivoSeleccionado != null) {
                diag.setArchivosAdjuntos(new File[]{archivoSeleccionado});
                diag.nombres_archivos = archivoSeleccionado.getName();
            }

            LblArchivoSeleccionado.setText("<html><p>" + diag.nombres_archivos + "</p></html>");
        }
    }
    
    // Vista - HistorialCiclo
    public void btnhistorialciclo_a_menuinicio(JButton BtnVolver, vHistorialCiclo hc){
        MenuInicio mi = new MenuInicio();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
        hc.setVisible(false);
    }
    
    // Vista - EditarPerfil
    public void btneditarperfil_a_menuusuaria(JButton BtnVolver, EditarPerfil ep){
        MenuSalud mu = new MenuSalud();
        mu.setLocationRelativeTo(null);
        mu.setVisible(true);
        ep.setVisible(false);
    }
}