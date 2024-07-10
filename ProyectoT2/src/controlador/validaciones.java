package controlador;

import javax.swing.*;
import vista.*;

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
    
    public void BtnValidacionDP(JButton BtnSiguiente, JTextField TextNombre, JComboBox Ano, JComboBox Mes, JComboBox Dia, JTextField TextPeso, JTextField TextEstatura, DatosPersonales dp){
        
        int AnoN = Ano.getSelectedIndex();
        int MesN = Mes.getSelectedIndex();
        int DiaN = Dia.getSelectedIndex();
        
        if(TextNombre.getText().length() >= 3 && AnoN != 0 && MesN != 0 && DiaN != 0 && TextPeso.getText().length() >= 5 && TextEstatura.getText().length() >= 5){
            MenuUsuaria mu = new MenuUsuaria();
            mu.setLocationRelativeTo(null);
            mu.setVisible(true);
            dp.setVisible(false);
        } 
        else if (TextNombre.getText().length() < 3) {
            JOptionPane.showMessageDialog(null,
                    "Necesita un minímo de 3 letras para continuar.",
                    "¡ERROR EN NOMBRE!",
                    JOptionPane.WARNING_MESSAGE);
        } 
        else if (AnoN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar un año.",
                    "¡ERROR EN AÑO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (MesN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar un mes.",
                    "¡ERROR EN MES!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (DiaN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar un día.",
                    "¡ERROR EN DÍA!",
                    JOptionPane.WARNING_MESSAGE);
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
    
    // Vista - IniciarSesion
    
    public void BtnValidacionIS(JButton BtnIniciarSesion, JTextField TextNombre, JComboBox Ano, JComboBox Mes, JComboBox Dia, IniciarSesion is){
        
        int AnoN = Ano.getSelectedIndex();
        int MesN = Mes.getSelectedIndex();
        int DiaN = Dia.getSelectedIndex();
        
        if(TextNombre.getText().length() >= 3 && AnoN != 0 && MesN != 0 && DiaN != 0){
            MenuUsuaria mu = new MenuUsuaria();
            mu.setLocationRelativeTo(null);
            mu.setVisible(true);
            is.setVisible(false);
        }
        else if (TextNombre.getText().length() < 3) {
            JOptionPane.showMessageDialog(null,
                    "Necesita un minímo de 3 letras para continuar.",
                    "¡ERROR EN NOMBRE!",
                    JOptionPane.WARNING_MESSAGE);
        } 
        else if (AnoN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar un año.",
                    "¡ERROR EN AÑO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (MesN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar un mes.",
                    "¡ERROR EN MES!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (DiaN == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar un día.",
                    "¡ERROR EN DÍA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Vista - CicloMenstrual
    
    public void BtnGuardarCicloMenstrual(JButton BtnGuardar, JComboBox AnoInicio, JComboBox MesInicio, JComboBox DiaInicio,
            JComboBox AnoFinal, JComboBox MesFinal, JComboBox DiaFinal, JComboBox IntensidadFlujo, CicloMenstrual cm){
        
        int AnoI = AnoInicio.getSelectedIndex();
        int MesI = MesInicio.getSelectedIndex();
        int DiaI = DiaInicio.getSelectedIndex();
        int AnoF = AnoFinal.getSelectedIndex();
        int MesF = MesFinal.getSelectedIndex();
        int DiaF = DiaFinal.getSelectedIndex();
        int IntensidadFlujoN = IntensidadFlujo.getSelectedIndex();
        
        if(AnoI != 0 && MesI != 0 && DiaI!= 0 && AnoF != 0 && MesF != 0 && DiaF != 0 && IntensidadFlujoN != 0){
            JOptionPane.showMessageDialog(null,
                    "Guardado con éxito.",
                    "¡LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);
            Resultados res = new Resultados();
            res.setLocationRelativeTo(null);
            res.setVisible(true);
            cm.setVisible(false);
        }
        else if (AnoI == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN FECHA DEL AÑO INICIAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (MesI == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN FECHA DEL MES INICIAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (DiaI == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN FECHA DEL DÍA INICIAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (AnoF == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN FECHA DEL AÑO FINAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (MesF == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN FECHA DEL MES FINAL!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (DiaF == 0) {
            JOptionPane.showMessageDialog(null,
                    "Necesitas ingresar una de las opciones.",
                    "¡ERROR EN FECHA DEL DÍA FINAL!",
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
