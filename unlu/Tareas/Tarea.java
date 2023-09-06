package unlu.Tareas;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Tarea {
    private String actividad;
    private Integer prioridad;
    private boolean Estado = false;
    private LocalDate fecha;
    private LocalDate recordatorio;
    private LocalDate fecha_de_finalizacion = null;
    ArrayList<String> colaboradores = new ArrayList();
    public void setActividad(String actividad) {this.actividad = actividad;}
    public void setEstado(boolean estado) {Estado = estado;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setrecordatorio(LocalDate recordatorio){this.recordatorio = recordatorio;}
    public void setPrioridad(Integer prioridad){this.prioridad = prioridad;}
    public void setColaboradores(String colaboradores) {this.colaboradores.add(colaboradores);}
    public void setRecordatorio(LocalDate recordatorio) {this.recordatorio = recordatorio;}
    public void setFecha_de_finalizacion(LocalDate fecha_de_finalizacion) {this.fecha_de_finalizacion = fecha_de_finalizacion;}
    public LocalDate getFecha_de_finalizacion() {return fecha_de_finalizacion;}
    public ArrayList<String> getColaboradores() {return colaboradores;}
    public String getActividad() {return actividad;}
    public boolean getEstado() {return Estado;}
    public LocalDate getFecha() {return fecha;}
    public LocalDate getRecordatorio() {return recordatorio;}
    public Integer getPrioridad() {return prioridad;}
    public boolean vencimiento(){
        boolean vencida = false;
        LocalDate hoy = LocalDate.now();
        if (this.fecha.isAfter(hoy)){vencida = true;}
        return vencida;
    }
}