package controlador;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.*;
import vista.*;

public class validaciones {
    
    public void ReglaN1(JTextField TextNombre, java.awt.event.KeyEvent evt) {
        
        int rn1 = evt.getKeyChar();

        if (TextNombre.getText().length() >= 30) {
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "ERROR",
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
            "ERROR",
            JOptionPane.WARNING_MESSAGE);  
        }
    }
    
    public void ReglaN2(JTextField TextPeso, java.awt.event.KeyEvent evt){
        
        int rn2 = evt.getKeyChar();
        
        boolean numeros = rn2 >= 48 && rn2 <= 57;
        boolean borrar = rn2 == 8;
        boolean coma = rn2 == 44;
        
        if (!(coma || numeros || borrar)){
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "Solo se permite ingresar una coma o números.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }

        if (coma && TextPeso.getText().contains(",")) {
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "El caracter ingresado ya existe.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        
        if (coma && TextPeso.getText().isEmpty()) {
        evt.consume();
        }
        
        if (coma && (TextPeso.getText().length() > 3 || TextPeso.getText().length() < 2)) {
        evt.consume();
        }

        if (TextPeso.getText().length() == 6){
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void ReglaN3(JTextField TextEstatura, java.awt.event.KeyEvent evt){
        
        int rn3 = evt.getKeyChar();
        
        boolean numeros = rn3 >= 48 && rn3 <= 57;
        boolean borrar = rn3 == 8;
        
        if (!(numeros || borrar)){
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "Solo se permite ingresar números.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        if (TextEstatura.getText().length() == 3){
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        } 
    }
    
    public void ReglaN5(JPasswordField TextContrasena, java.awt.event.KeyEvent evt){
        
        int rn5 = evt.getKeyChar();
        
        boolean mayusculas = rn5 >= 65 && rn5 <= 90;
        boolean minusculas = rn5 >= 97 && rn5 <= 122;
        boolean numeros = rn5 >= 48 && rn5 <= 57;
        boolean coma = rn5 == 44;
        boolean punto = rn5 == 46;
        boolean borrar = rn5 == 8;
        
        if (!(mayusculas || minusculas || numeros || coma || punto || borrar)){
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "Solo se pueden ingresar '.' y ',' como carácteres especiales.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        
        if (TextContrasena.getText().length() >= 12){
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void ReglaN6(JTextField TextCedula, java.awt.event.KeyEvent evt){
        
        int rn6 = evt.getKeyChar();
        
        boolean numeros = rn6 >= 48 && rn6 <= 57;
        boolean borrar = rn6 == 8;
        
        if (!(numeros || borrar)){
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "Solo se permite ingresar números.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        if (TextCedula.getText().length() == 8){
            evt.consume();
            JOptionPane.showMessageDialog(null,
                    "Has alcanzado el límite de caracteres.",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Vista - LoginP
    
    public void VerContraseña(JPasswordField TextContrasena, JCheckBox CheckVerContra){
         
         if(CheckVerContra.isSelected()){
             TextContrasena.setEchoChar((char)0);
         } else{
             TextContrasena.setEchoChar('•');
         }
     }
    
    public void BtnValidacionLoginP(JButton BtnEntrar, JTextField TextUsuaria, JPasswordField TextContra, LoginP lp){
        
        if(TextUsuaria.getText().length() >= 2 && TextContra.getText().length() >= 8){
            MenuInicio mi = new MenuInicio();
            mi.setLocationRelativeTo(null);
            mi.setVisible(true);
            lp.setVisible(false);
        }
        else if(TextUsuaria.getText().length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 2 letras para continuar.",
                    "¡ERROR EN USUARIA!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if(TextContra.getText().length() < 8){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 7 letras para continuar.",
                    "¡ERROR EN CONTRASEÑA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - EditarDatosAcceso
    public void BtnValidacionEDA(JButton BtnEDA, JTextField TextUsuariaAnterior, JPasswordField TextContraAnterior, JTextField TextUsuariaNuevo, JPasswordField TextContraNuevo){
        
        if(TextUsuariaAnterior.getText().length() >= 2 && TextContraAnterior.getText().length() >= 8 && TextUsuariaNuevo.getText().length() >= 2 && TextContraNuevo.getText().length() >= 8){
            JOptionPane.showMessageDialog(null,
                    "Guardado con éxito.",
                    "¡LISTO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (TextUsuariaAnterior.getText().length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 2 letras para continuar.",
                    "¡ERROR EN USUARIA -ANTERIOR-!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (TextUsuariaNuevo.getText().length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 2 letras para continuar.",
                    "¡ERROR EN USUARIA -NUEVO-!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if(TextContraAnterior.getText().length() < 8){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 7 letras para continuar.",
                    "¡ERROR EN CONTRASEÑA!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if(TextContraNuevo.getText().length() < 8){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 7 letras para continuar.",
                    "¡ERROR EN CONTRASEÑA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - DatosPersonales
    public void BtnValidacionDP(JButton BtnSiguiente, JTextField TextNombre, JTextField TextCedula, JDateChooser DateFechaNacimiento, JTextField TextPeso, JTextField TextEstatura, DatosPersonales dp){

        if(TextNombre.getText().length() >= 2 && CedulaVal(TextCedula.getText()) && DateFechaNacimiento.getDate() != null && TextPeso.getText().length() >= 4 && TextPeso.getText().contains(",") && EstaturaVal(TextEstatura.getText())){
            JOptionPane.showMessageDialog(null,
                    "Se ha registrado correctamente.",
                    "¡TODO LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuUsuaria mu = new MenuUsuaria();
            mu.setLocationRelativeTo(null);
            mu.setVisible(true);
            dp.setVisible(false);
        }
        else if (TextNombre.getText().length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 2 letras para continuar.",
                    "¡ERROR EN NOMBRE!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!CedulaVal(TextCedula.getText())){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar la cédula de identidad correcta.",
                    "¡ERROR EN CÉDULA!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (DateFechaNacimiento.getDate() == null){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una fecha.",
                    "¡ERROR EN FECHA DE NACIMIENTO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (TextPeso.getText().length() < 4){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 4 números.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!TextPeso.getText().contains(",")){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar la coma correspondiente.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!EstaturaVal(TextEstatura.getText())){
            JOptionPane.showMessageDialog(null,
                    "La estatura debe estar entre 100 y 200 cm.",
                    "¡ERROR EN ESTATURA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private boolean CedulaVal(String CedulaText) {
        try {
            double cedula = Double.parseDouble(CedulaText);
            return cedula > 2000000 && cedula <= 50000000;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean EstaturaVal(String EstaturaText) {
        try {
            double estatura = Double.parseDouble(EstaturaText);
            return estatura > 100 && estatura <= 200;
        } catch (NumberFormatException e) {
            return false;
        }
    }
 
    // Vista - GestionarPerfil
    public void BtnValidacionGP(JButton BtnIniciarSesion, JTextField TextNombre, JTextField TextCedula, JDateChooser DateFechaNacimiento, GestionarPerfil gp){
        
        if(TextNombre.getText().length() >= 2 && CedulaVal(TextCedula.getText()) && DateFechaNacimiento.getDate() != null){
            MenuUsuaria mu = new MenuUsuaria();
            mu.setLocationRelativeTo(null);
            mu.setVisible(true);
            gp.setVisible(false);
        }
        else if (TextNombre.getText().length() < 2) {
            JOptionPane.showMessageDialog(null,
                    "Necesita un minímo de 2 letras para continuar.",
                    "¡ERROR EN NOMBRE!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!CedulaVal(TextCedula.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar la cédula de identidad correcta.",
                    "¡ERROR EN CÉDULA!",
                    JOptionPane.WARNING_MESSAGE);
        } 
        else if (DateFechaNacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una fecha.",
                    "¡ERROR EN FECHA DE NACIMIENTO!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - CicloMenstrual
    public void BtnGuardarCicloMenstrual(JButton BtnGuardar, JDateChooser FechaInicio, JDateChooser FechaFinal, JComboBox IntensidadFlujo, CicloMenstrual cm){
        
        Date FI = FechaInicio.getDate();
        Date FF = FechaFinal.getDate();
        int IntensidadFlujoN = IntensidadFlujo.getSelectedIndex();
        
        if(FechaInicio.getDate() != null && FechaFinal.getDate() != null && IntensidadFlujoN != 0){
            if(FF.after(FI) || FF.equals(FI)){
               JOptionPane.showMessageDialog(null,
                    "Guardado con éxito.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
            Resultados res = new Resultados();
            res.setLocationRelativeTo(null);
            res.setVisible(true);
            cm.setVisible(false);
            }
            else {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar las opciones correctas.",
                    "¡ERROR EN FECHAS!",
                    JOptionPane.WARNING_MESSAGE);
            }
        }
        else if (FechaInicio.getDate() == null) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una fecha.",
                    "¡ERROR EN FECHA DE INICIO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (FechaFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una fecha.",
                    "¡ERROR EN FECHA FINAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (IntensidadFlujoN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN INTENSIDAD DE FLUJO!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void BtnGuardarSintomasyCambios(JButton BtnGuardar, JComboBox Tipo, JComboBox Intensidad, JComboBox Durabilidad, JComboBox Humor, JComboBox TipoDolor, JComboBox SensibilidadEmocional, SintomasyCambios syc){
        
        int TipoN = Tipo.getSelectedIndex();
        int IntensidadN = Intensidad.getSelectedIndex();
        int DurabilidadN = Durabilidad.getSelectedIndex();
        int HumorN = Humor.getSelectedIndex();
        int TipoDolorN = TipoDolor.getSelectedIndex();
        int SensibilidadEmocionalN = SensibilidadEmocional.getSelectedIndex();
        
        if(TipoN != 0 && IntensidadN != 0 && DurabilidadN != 0 && HumorN != 0 && TipoDolorN != 0 && SensibilidadEmocionalN != 0)
        {
            JOptionPane.showMessageDialog(null,
                    "Guardado con éxito.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuUsuaria mu = new MenuUsuaria();
            mu.setLocationRelativeTo(null);
            mu.setVisible(true);
            syc.setVisible(false);
        }
        else if (TipoN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN TIPO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (IntensidadN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN INTENSIDAD!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (DurabilidadN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN DURABILIDAD!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (HumorN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN HUMOR!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (TipoDolorN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN TIPO DE DOLOR!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (SensibilidadEmocionalN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN SENSIBILIDAD EMOCIONAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void BtnGuardarEditarPerfil(JButton BtnGuardar, JTextField TextPeso, JTextField TextEstatura){
        
        if(TextPeso.getText().length() >= 5 && TextEstatura.getText().length() >= 5){
            JOptionPane.showMessageDialog(null,
                    "Guardado con éxito los cambios.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (TextPeso.getText().length() < 5) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 5 números.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
            }
        else if (TextEstatura.getText().length() < 5) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 5 números.",
                    "¡ERROR EN ESTATURA!",
                    JOptionPane.WARNING_MESSAGE);
            }
        }
}
