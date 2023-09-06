package unlu.Tareas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Lista_De_Tareas {
    ArrayList<Tarea> lista = new ArrayList<>();
    ArrayList<String> colaboradores = new ArrayList();
    public void agregar_colaborador(String colaborador){
        colaboradores.add(colaborador);
    }
    public void agregar_tarea(String Actividad, boolean Estado, String Fecha,String recordatorio,Integer prioridad){
        Tarea nuevaT = new Tarea();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechas = null;
        fechas = LocalDate.parse(Fecha, formatter1);
        nuevaT.setActividad(Actividad);
        nuevaT.setEstado(Estado);
        nuevaT.setFecha(fechas);
        fechas = LocalDate.parse(recordatorio, formatter1);
        nuevaT.setrecordatorio(fechas);
        nuevaT.setPrioridad(prioridad);
        lista.add(nuevaT);
    }
    public String Cambiar_prioridad(Integer lugar, Integer prioridad){
        Tarea TareaAux = new Tarea();
        if(lugar >= lista.size()) {
            TareaAux= lista.get(lugar);
            lista.remove(lugar);
            TareaAux.setPrioridad(prioridad);
            lista.add(TareaAux);
            return "Prioridades cambiadas exitosamente";
    }
    return "Fuera de rango";
    }
    public String Cambiar_lugares(Integer menor, Integer mayor){
    Tarea TareaAux = new Tarea();
    if(menor < mayor) {
        if (mayor >= lista.size()) {
            return "Error: La posicion mayor esta fuera de rango de la lista";
        } else {
            if (menor == mayor){
                return "mismo nivel de prioridad";
            }
            else {
            lista.add(menor, lista.get(mayor));
            lista.add(mayor+ 1, lista.get(menor+1));
            lista.remove(menor+1);
            lista.remove(mayor+1);
            return "Prioridades cambiadas exitosamente";
            }
        }
    }
    else{return "Error: El menor es mas grande que el mayor";}
    }
    public String Termino(int numero) {
        Tarea TareaAux = new Tarea();
        if (numero > lista.size()) {return "Esta tarea no existe";}
        TareaAux = lista.get(numero);
        if (TareaAux.getEstado()){
            return "Tarea Completa";
        }
        else {
            if (TareaAux.vencimiento()){return "La tarea esta vencidad";}
            else {return "Tarea incompleta";}
        }
    }
    public void completarTarea(int numero,String fecha,String colaborador){
        boolean encontrado_colaborador = false;
        Tarea TareaAux = new Tarea();
        if (numero > lista.size()){return;}
        TareaAux = lista.get(numero);
        TareaAux.setEstado(true);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(TareaAux.getFecha_de_finalizacion() == null){
            LocalDate fechas = null;
            fechas = LocalDate.parse(fecha, formatter1);
            TareaAux.setFecha_de_finalizacion(fechas);
        }
        TareaAux.setColaboradores(colaborador);
        for(int i=0; i < colaboradores.size(); i++){
            if(colaboradores.get(i).equals(colaborador)){
                encontrado_colaborador = true;
            }
        }
        if (!encontrado_colaborador){colaboradores.add(colaborador);}
        lista.remove(numero);
        lista.add(TareaAux);
    }
    public void Prioridad(){
        Tarea TareaAux = new Tarea();
        for (int i=0 ;i < lista.size();i++){
            TareaAux = lista.get(i);
            if (TareaAux.getRecordatorio().equals(TareaAux.getFecha()) ||(TareaAux.getRecordatorio().isAfter(TareaAux.getFecha()))){
                lista.remove(TareaAux);
                lista.add(0,TareaAux);
            }
        }
    }
    public String toString(){
        Tarea TareaAux = new Tarea();
        String acumulador = "";
        if(lista.size() == 0){
            acumulador = "Lista de tareas vacia";
        }else {
            Prioridad();
            for (int i=0 ;i < lista.size();i++){
                TareaAux = lista.get(i);
                if (TareaAux.getRecordatorio().equals(TareaAux.getFecha()) ||(TareaAux.getRecordatorio().isAfter(TareaAux.getFecha()))){
                    acumulador += "Tarea " + i +" por vencer: " + TareaAux.getActividad() +" "+TareaAux.getFecha().toString() +" \n";
                }
                else {acumulador += "Tarea " + i +" " + TareaAux.getActividad() +" "+TareaAux.getFecha().toString() +" \n";}
            }}
        return acumulador;
    }
    public String colaborador_finalizo(String colaborador){
        boolean encontrado_colaborador = false;
        Tarea TareaAux = new Tarea();
        String mensaje = "";
        ArrayList colaboradores_temporal = new ArrayList();
        for(int i=0; i < colaboradores.size(); i++){
            if(colaboradores.get(i).equals(colaborador)){
                encontrado_colaborador = true;
            }
        }
        if (encontrado_colaborador) {
            for (int i = 0; i < lista.size(); i++) {
                TareaAux = lista.get(i);
                if (TareaAux.getEstado()) {
                    colaboradores_temporal = TareaAux.getColaboradores();
                    for (int j = 0; j < colaboradores_temporal.size(); j++) {
                        if (colaboradores_temporal.get(j).equals(colaborador)) {
                           mensaje += TareaAux.getActividad()+" \n";
                        }
                    }
                }
            }
        }
        else {mensaje = "Ese colaborador no existe";}
        return mensaje;
    }
    public int tamano(){return lista.size();}
    public Tarea retornar(int index){return lista.get(index);}
}