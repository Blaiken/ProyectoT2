package controlador;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.CicloMenstrual;
import modelo.CalcularCiclo;

public class control_cm {
    
    conexion_bd con = new conexion_bd();
    
    public void InsertarCM(JLabel LblCedula, JDateChooser FechaInicio, JDateChooser FechaFin, JComboBox IntensidadFlujo, JLabel LblEstado){
        
        CicloMenstrual cm = new CicloMenstrual();
        CalcularCiclo cc = new CalcularCiclo();
        
        cm.setFecha_inicio_ultima_menstruacion(FechaInicio.getDate());
        cm.setFecha_inicio_menstruacion_actual(FechaFin.getDate());
        cm.setIntensidad_flujo(IntensidadFlujo.getSelectedItem().toString());
        
        Date FechaUM = cm.getFecha_inicio_ultima_menstruacion();
        Date FechaAM = cm.getFecha_inicio_menstruacion_actual();
        
        int duracion = cc.c_duracion(FechaAM, FechaUM);
        
        if(duracion >= 35){
            LblEstado.setText("Irregular");
        }
        else if(duracion < 21){
            LblEstado.setText("Irregular");
        }
        else{
            LblEstado.setText("Normal");
        }
        Date proximociclo = cc.c_proximo_ciclo(FechaAM, duracion);
        Date fechaovulacion = cc.c_ovulacion(proximociclo, duracion);
        int ovulacion = duracion / 2;
        int[] c_diasfertilesantes = cc.c_dias_fertiles(fechaovulacion);
        int diasfertilesantes = c_diasfertilesantes[0];
        int diasfertilesdespues = c_diasfertilesantes[1];
        int[] c_diasseguridad = cc.c_dias_seguridad(fechaovulacion);
        int diasseguridadantes = c_diasseguridad[0];
        int diasseguridaddespues = c_diasseguridad[1];
        
        String consulta = "INSERT INTO ciclomenstrual (cedula,fechainiciou,fechainicioa,intensidadflujo,duracion,estado,ovulacion,diasfertilesantes,diasfertilesdespues,diasseguridadantes,diasseguridaddespues,proximociclo,fecharegistro) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try {
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fechaFormateada = now.format(formatter);

            cs.setInt(1, Integer.parseInt(LblCedula.getText()));
            java.sql.Date sqlDatoFI = new java.sql.Date(cm.getFecha_inicio_ultima_menstruacion().getTime());
            cs.setDate(2, sqlDatoFI);
            java.sql.Date sqlDatoFN = new java.sql.Date(cm.getFecha_inicio_menstruacion_actual().getTime());
            cs.setDate(3, sqlDatoFN);
            cs.setString(4, cm.getIntensidad_flujo());
            cs.setInt(5, duracion);
            cs.setString(6, LblEstado.getText());
            java.sql.Date sqlDatoFO = new java.sql.Date(fechaovulacion.getTime());
            cs.setDate(7, sqlDatoFO);
            cs.setInt(8, diasfertilesantes);
            cs.setInt(9, diasfertilesdespues);
            cs.setInt(10, diasseguridadantes);
            cs.setInt(11, diasseguridaddespues);
            java.sql.Date sqlPC = new java.sql.Date(proximociclo.getTime());
            cs.setDate(12, sqlPC);
            cs.setString(13, fechaFormateada);

            cs.execute();

            JOptionPane.showMessageDialog(null,
                    "Se ha registrado correctamente.",
                    "¡TODO LISTO!",
                    JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se inserto el ciclo menstrual.\nError: " +e.toString());
            }   
    }
    
}
