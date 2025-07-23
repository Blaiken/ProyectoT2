package modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalcularCiclo {

    public int c_duracion(Date FechaAM, Date FechaUM) {
        long diferencia = FechaAM.getTime() - FechaUM.getTime();
        long Rduracion = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
        return (int) Rduracion;
    }

    public Date c_proximo_ciclo(Date FechaAM, int duracion) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(FechaAM);
        calendar.add(Calendar.DAY_OF_YEAR, duracion);
        return calendar.getTime();
    }

    public Date c_ovulacion(Date FechaProximo, int duracion) {
        Date proximoCiclo = c_proximo_ciclo(FechaProximo, duracion);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(proximoCiclo);

        // Calcular el día de ovulación
        int ovulacion = (duracion - duracion) / 2 + 1; // Primero restar duracion y la duracion, luego dividir entre 2 y finalmente sumar 1
        calendar.add(Calendar.DAY_OF_YEAR, -ovulacion); // Restar para obtener el día de ovulación

        // Restar un mes sin modificar el año
        calendar.add(Calendar.MONTH, -1); 

        return calendar.getTime();
    }
    
    public int[] c_dias_fertiles(Date ovulacion) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ovulacion);
        int[] diasFertiles = new int[2];
        diasFertiles[0] = calendar.get(Calendar.DAY_OF_MONTH) - 1; // Un día antes
        diasFertiles[1] = calendar.get(Calendar.DAY_OF_MONTH) + 1; // Un día después
        return diasFertiles;
    }

    public int[] c_dias_seguridad(Date ovulacion) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ovulacion);
        int[] diasSeguridad = new int[2];
        diasSeguridad[0] = calendar.get(Calendar.DAY_OF_MONTH) - 2; // Dos días antes
        diasSeguridad[1] = calendar.get(Calendar.DAY_OF_MONTH) + 2; // Dos días después
        return diasSeguridad;
    }
}
