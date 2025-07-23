package modelo;

import java.util.Date;

public class CicloMenstrual {
    
    private Date fecha_inicio_ultima_menstruacion;
    private Date fecha_inicio_menstruacion_actual;
    private String intensidad_flujo;

    public Date getFecha_inicio_ultima_menstruacion() {
        return fecha_inicio_ultima_menstruacion;
    }

    public void setFecha_inicio_ultima_menstruacion(Date fecha_inicio_ultima_menstruacion) {
        this.fecha_inicio_ultima_menstruacion = fecha_inicio_ultima_menstruacion;
    }

    public Date getFecha_inicio_menstruacion_actual() {
        return fecha_inicio_menstruacion_actual;
    }

    public void setFecha_inicio_menstruacion_actual(Date fecha_inicio_menstruacion_actual) {
        this.fecha_inicio_menstruacion_actual = fecha_inicio_menstruacion_actual;
    }
    
    public String getIntensidad_flujo() {
        return intensidad_flujo;
    }

    public void setIntensidad_flujo(String intensidad_flujo) {
        this.intensidad_flujo = intensidad_flujo;
    }
}
