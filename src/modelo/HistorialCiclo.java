package modelo;

import java.time.LocalDate;

public class HistorialCiclo {
    
    private LocalDate fecha_registro;

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
