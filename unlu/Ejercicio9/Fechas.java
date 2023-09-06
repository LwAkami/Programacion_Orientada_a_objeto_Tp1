package unlu.Ejercicio9;
import javax.print.DocFlavor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.logging.SimpleFormatter;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public LocalDate formato(String fecha){
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate fechas = null;
        try {
            fechas = LocalDate.parse(fecha, formatter1);
        } catch (Exception e1) {
            try {
                fechas = LocalDate.parse(fecha, formatter2);
            } catch (Exception e2) {
                // Ambos formatos de fecha fallaron
                e2.printStackTrace();
            }
        }
        return fechas;
    }

    public String Determinar_si_se_encuentra_entre_dos_fechas(String fecha_mayor, String fecha_menor, String fecha_entre){LocalDate f1, f2, f3;
    f1 = formato(fecha_mayor);
    f2 = formato(fecha_menor);
    f3 = formato(fecha_entre);

    if( f1.isAfter(f3) && f3.isBefore(f2)){return "La fecha"+f3.toString() + " se encuentra entre la fecha "+ f1.toString()+" y la fecha "+ f3.toString();}
    else {return "la fecha no se encuentra entre esas dos fechas";}
    }

    public String mayor(String menor, String mayor){
        LocalDate f1, f2;
        f1 = formato(mayor);
        f2 = formato(menor);
        if(f1.isAfter(f2)){return "La fecha " + f1.toString()+" es mayor a " + f2.toString();}
        else {return "La fecha "+ f2.toString() + "es mayor a "+ f1.toString();}
    };

    public String menor(String menor, String mayor){
        LocalDate f1, f2;
        f1 = formato(mayor);
        f2 = formato(menor);
        if(f1.isBefore(f2)){return "La fecha " + f1.toString()+" es menor a " + f2.toString();}
        else {return "La fecha "+ f2.toString() + " es menor a "+ f1.toString();}
    };
}
