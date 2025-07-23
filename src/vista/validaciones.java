package vista;

import com.toedter.calendar.JDateChooser;
import controlador.control_cm;
import controlador.control_dp;
import controlador.control_ep;
import controlador.control_gp;
import controlador.control_historial;
import controlador.control_syc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.*;

public class validaciones {
    
    control_dp cdp = new control_dp();
    control_gp cgp = new control_gp();
    control_cm ccm = new control_cm();
    control_syc csyc = new control_syc();
    control_ep cep = new control_ep();
    control_historial ch = new control_historial();
    
    String linea2 = "";
    String linea4 = "";
    
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
        boolean punto = rn2 == 46;
        
        if (!(punto || numeros || borrar)){
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "Solo se permite ingresar un punto o números.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }

        if (punto && TextPeso.getText().contains(".")) {
        evt.consume();
        JOptionPane.showMessageDialog(null,
                "El caracter ingresado ya existe.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        
        if (punto && TextPeso.getText().isEmpty()) {
        evt.consume();
        }
        
        if (punto && (TextPeso.getText().length() > 3 || TextPeso.getText().length() < 2)) {
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
    
    public void ReglaN7(JTextField TextCorreo, java.awt.event.KeyEvent evt) {
        
        int rn7 = evt.getKeyChar();
        
        boolean mayusculas = rn7 >= 65 && rn7 <= 90;
        boolean minusculas = rn7 >= 97 && rn7 <= 122;
        boolean numeros = rn7 >= 48 && rn7 <= 57;
        boolean punto = rn7 == 46;
        boolean arroba = rn7 == 64;
        boolean guion = rn7 == 45 || rn7 == 95;
        boolean borrar = rn7 == 8;
        
        if (!(mayusculas || minusculas || numeros || punto || arroba || guion || borrar)){
            evt.consume();
            JOptionPane.showMessageDialog(null,
                "Solo se permite ingresar caracteres válidos para correos electrónicos.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        
        if (TextCorreo.getText().length() >= 254) {
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
        int[] lineasALeer = {2, 4};
        
        try (BufferedReader br = new BufferedReader(new FileReader("Login.txt"))) {
            String linea;
            int contador = 0;
            
            while ((linea = br.readLine()) != null) {
                contador++;
                if (contador == lineasALeer[0]) {
                    linea2 = linea;
                } else if (contador == lineasALeer[1]) {
                    linea4 = linea;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(TextUsuaria.getText().length() >= 2 && TextContra.getText().length() >= 8 && 
           TextUsuaria.getText().equals(linea2) && TextContra.getText().equals(linea4)){
            
            // Inicia sesión con éxito
            
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
                    "Necesita un mínimo de 7 caracteres para continuar.",
                    "¡ERROR EN CONTRASEÑA!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if(TextUsuaria.getText() != linea2 && TextContra.getText() != linea4){
            JOptionPane.showMessageDialog(null,
                    "Los datos ingresados no coinciden.",
                    "¡NO COINCIDE!",
                    JOptionPane.WARNING_MESSAGE);
            
            TextUsuaria.setText("");
            TextContra.setText("");
        }
    }
    
    // Vista - RecupAcceso
    
    public void BtnBuscarContra(JTextField TextUsuariaRecup, JLabel TextContraRecup, RecupAcceso ra){
        
        int[] lineasALeer = {2, 4};
        
        String lineaNombre = null;
        String lineaContra = null;
        
        try (BufferedReader br = new BufferedReader(new FileReader("Login.txt"))) {
                String linea;
                int contador = 0;

                while ((linea = br.readLine()) != null) {
                    contador++;
                    if (contador == lineasALeer[0]) {
                        lineaNombre = linea;
                    } else if (contador == lineasALeer[1]) {
                        lineaContra = linea;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        if(TextUsuariaRecup.getText().length() >= 2 && TextUsuariaRecup.getText().equals(lineaNombre)){
            JOptionPane.showMessageDialog(null,
                    "Se ha recuperado la contraseña.",
                    "¡RECUPERADA!",
                    JOptionPane.WARNING_MESSAGE);

            if (lineaContra != null) {
                    ra.TextContraRecup.setText(lineaContra);
                }
        }
        else if(TextUsuariaRecup.getText().length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 2 letras para continuar.",
                    "¡ERROR EN USUARIA!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if(TextUsuariaRecup.getText() != lineaNombre){
            JOptionPane.showMessageDialog(null,
                    "El usuario no coincide.",
                    "¡ERROR EN USUARIA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - EditarDatosAcceso
    public void BtnValidacionEDA(JButton BtnEDA, JTextField TextUsuariaAnterior, JPasswordField TextContraAnterior, JTextField TextUsuariaNuevo, JPasswordField TextContraNuevo, EditarDatosAcceso eda) {
        
        String AntiguoNombre = null;
        String AntiguaContra = null;
        int[] lineasALeer = {2, 4};

        try (BufferedReader br = new BufferedReader(new FileReader("Login.txt"))) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                contador++;
                if (contador == lineasALeer[0]) {
                    AntiguoNombre = linea;
                } else if (contador == lineasALeer[1]) {
                    AntiguaContra = linea;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        if (TextUsuariaAnterior.getText().length() >= 2 && TextContraAnterior.getText().length() >= 8 && TextUsuariaNuevo.getText().length() >= 2 && TextContraNuevo.getText().length() >= 8) {
            
            if(TextUsuariaAnterior.getText().equals(AntiguoNombre) && TextContraAnterior.getText().trim().equals(AntiguaContra.trim())){
                JOptionPane.showMessageDialog(null,
                    "Guardado con éxito.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);

                try (FileWriter escritorDeFichero = new FileWriter("Login.txt")) {
                    escritorDeFichero.write("Usuario:\n" + TextUsuariaNuevo.getText() + "\nContraseña:\n" + TextContraNuevo.getText());
                } catch (IOException error) {
                    System.out.println("Error al escribir en el archivo: " + error.getMessage());
                    error.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null,
                    "Escribe los datos de la cuenta correctamente.",
                    "¡ERROR!",
                    JOptionPane.INFORMATION_MESSAGE);
            }
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
    
    // Vista - vDatosPersonales
    public void BtnValidacionDP(JTextField TextNombre, JComboBox CboxNacionalidad, JTextField TextCedula, JDateChooser DateFechaNacimiento, JTextField TextCorreo, JTextField TextPeso, JTextField TextEstatura, vDatosPersonales dp){

        if(TextNombre.getText().length() >= 2 && CboxNacionalidad.getSelectedIndex() != 0 && CedulaVal(TextCedula.getText()) && DateFechaNacimiento.getDate() != null && TextCorreo.getText().length() >= 1 && TextPeso.getText().length() >= 4 && TextPeso.getText().contains(".") && EstaturaVal(TextEstatura.getText())){
            
            int respuesta = JOptionPane.showConfirmDialog(null,
                    "¿Está seguro que la información colocada es la correcta?",
                    "CONFIRMACIÓN",
                    JOptionPane.YES_NO_OPTION);
                
                if(respuesta == JOptionPane.YES_OPTION){
            
                    cdp.InsertarDP(TextNombre, CboxNacionalidad, TextCedula, DateFechaNacimiento, TextCorreo, TextPeso, TextEstatura);
                
                    MenuSalud mu = new MenuSalud();
                    mu.setLocationRelativeTo(null);
                    mu.setVisible(true);
                    dp.setVisible(false);
                    
                    }else { 
                        JOptionPane.showMessageDialog(null,
                                "No se realizó el registro.",
                                "CANCELADO",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        
        else if (TextNombre.getText().length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Necesita un mínimo de 2 letras para continuar.",
                    "¡ERROR EN NOMBRE!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (CboxNacionalidad.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar la nacionalidad perteneciente.",
                    "¡ERROR EN CÉDULA!",
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
        else if (TextCorreo.getText().length() < 1){
            JOptionPane.showMessageDialog(null,
                    "Necesita ingresar correctamente el correo.",
                    "¡ERROR EN CORREO ELECTRÓNICO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!TextCorreo.getText().endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(null,
                "El correo debe terminar en @gmail.com.",
                "ERROR",
                JOptionPane.WARNING_MESSAGE);
        }
        else if (TextPeso.getText().length() < 4){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 4 números.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!TextPeso.getText().contains(".")){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar el punto correspondiente.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!EstaturaVal(TextEstatura.getText())){
            JOptionPane.showMessageDialog(null,
                    "La estatura debe estar entre 100 y 250 cm.",
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
            return estatura > 100 && estatura <= 250;
        } catch (NumberFormatException e) {
            return false;
        }
    }
 
    // Vista - GestionarPerfil
    public void BtnValidacionGP(JButton BtnIniciarSesion, JComboBox CboxNacionalidad, JTextField TextCedula, GestionarPerfil gp){
        
        if(CboxNacionalidad.getSelectedIndex() != 0 && CedulaVal(TextCedula.getText())){
            cgp.VerificarPersona(CboxNacionalidad, TextCedula, gp);
        }
        else if (CboxNacionalidad.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar la nacionalidad perteneciente.",
                    "¡ERROR EN CÉDULA!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!CedulaVal(TextCedula.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar la cédula de identidad correcta.",
                    "¡ERROR EN CÉDULA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - vCicloMenstrual
    public void BtnGuardarCicloMenstrual(JButton BtnGuardar, JLabel LblCedula, JDateChooser FechaInicio, JDateChooser FechaFinal, JComboBox IntensidadFlujo, JLabel LblEstado, vCicloMenstrual cm){
        
        Date FI = FechaInicio.getDate();
        Date FF = FechaFinal.getDate();
        int IntensidadFlujoN = IntensidadFlujo.getSelectedIndex();
        
        if(FechaInicio.getDate() != null && FechaFinal.getDate() != null && IntensidadFlujoN != 0){
            if(FF.after(FI) || FF.equals(FI)){
                
                int respuesta = JOptionPane.showConfirmDialog(null,
                       "¿Está seguro que desea guardar esta información?",
                       "CONFIRMACIÓN",
                       JOptionPane.YES_NO_OPTION);
                
                if(respuesta == JOptionPane.YES_OPTION){
                    
                    ccm.InsertarCM(LblCedula, FechaInicio, FechaFinal, IntensidadFlujo, LblEstado);
             
                }else { 
                    JOptionPane.showMessageDialog(null,
                            "No se guardaron los datos.",
                            "CANCELADO",
                            JOptionPane.INFORMATION_MESSAGE);
                }  
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
    
    // Vista - vSintomasyCambios
    public void BtnGuardarSintomasyCambios(JButton BtnGuardar, JLabel LblCedula, JTable sintomas, JComboBox Humor, JComboBox TipoDolor, JComboBox SensibilidadEmocional, vSintomasyCambios syc){
        
        int HumorN = Humor.getSelectedIndex();
        int TipoDolorN = TipoDolor.getSelectedIndex();
        int SensibilidadEmocionalN = SensibilidadEmocional.getSelectedIndex();
        
        if(HumorN != 0 && TipoDolorN != 0 && SensibilidadEmocionalN != 0) {
            
            int respuesta = JOptionPane.showConfirmDialog(null,
                    "¿Está seguro que desea guardar esta información?",
                    "CONFIRMACIÓN",
                    JOptionPane.YES_NO_OPTION);
                
                if(respuesta == JOptionPane.YES_OPTION){
                    
                    csyc.InsertarSyC(LblCedula, sintomas, Humor, TipoDolor, SensibilidadEmocional);
                    
                    JOptionPane.showMessageDialog(null,
                    "Guardado con éxito.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    MenuSalud mu = new MenuSalud();
                    mu.setLocationRelativeTo(null);
                    mu.setVisible(true);
                    syc.setVisible(false);
                
                }else { 
                    JOptionPane.showMessageDialog(null,"No se guardaron los datos.",
                            "CANCELADO",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            
        }else if (HumorN == 0) {
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
    
    // Vista - EditarPerfil
    
    public void BtnGuardarEditarPerfil(JLabel LabelCedula, JTextField TextCorreo, JTextField TextPeso, JTextField TextEstatura){
        
        if(TextCorreo.getText().length() >= 1 && TextPeso.getText().length() >= 4 && TextEstatura.getText().length() >= 3){
            
            if (!TextCorreo.getText().toLowerCase().trim().endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null,
                "El correo debe terminar en @gmail.com.",
                "¡ERROR EN CORREO ELECTRÓNICO!",
                JOptionPane.WARNING_MESSAGE);
            return;
            }

            int respuesta = JOptionPane.showConfirmDialog(null,
                   "¿Está seguro que desea guardar esta información?",
                   "CONFIRMACIÓN",
                   JOptionPane.YES_NO_OPTION);

            if(respuesta == JOptionPane.YES_OPTION){

                cep.GuardarEditarPerfil(LabelCedula, TextCorreo, TextPeso, TextEstatura);
            
            }else { 
                JOptionPane.showMessageDialog(null,"No se guardaron los datos",
                        "CANCELADO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else if (TextCorreo.getText().length() < 1){
            JOptionPane.showMessageDialog(null,
                    "Necesita ingresar correctamente el correo.",
                    "¡ERROR EN CORREO ELECTRÓNICO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!TextCorreo.getText().endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(null,
                "El correo debe terminar en @gmail.com.",
                "¡ERROR EN CORREO ELECTRÓNICO!",
                JOptionPane.WARNING_MESSAGE);
        }
        else if (TextPeso.getText().length() < 4) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 5 números.",
                    "¡ERROR EN PESO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (TextEstatura.getText().length() < 3) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 3 números.",
                    "¡ERROR EN ESTATURA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - vHistorialCiclo
    
    public void BtnBuscarHC(JButton BuscarPorCedula, JTable TblDP, JTable TblSintomas, JTable TblCicloMenstrual, JTable TblCambio, JTextField TextCedula){
        
        if(TextCedula.getText().length() >= 8){
            ch.BuscarPorCedula(TblDP, TblSintomas, TblCicloMenstrual, TblCambio, TextCedula);
        }
        else if (TextCedula.getText().length() < 7) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar al menos 7 números.\nVerifique la cédula.",
                    "¡ERROR EN LA CÉDULA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
