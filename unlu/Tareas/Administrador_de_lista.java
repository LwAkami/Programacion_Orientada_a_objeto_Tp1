package unlu.Tareas;

import java.time.LocalDate;

public class Administrador_de_lista {
    Lista_De_Tareas lista = new Lista_De_Tareas();

    public void agregar_tarea(String Actividad, boolean Estado, String Fecha,String recordatorio,Integer prioridad){
        lista.agregar_tarea(Actividad,Estado,Fecha,recordatorio,prioridad);
    }

    public void completarTarea(int numero, String fecha, String colaborador){
        lista.completarTarea(numero,fecha,colaborador);
    }

    public void Ordenamiento() {
        int i = 1;
        while (i < lista.tamano()) {
            Tarea tareaActual = lista.retornar(i);
            int j = i - 1;
            while (j >= 0) {
                Tarea tareaAnterior = lista.retornar(j);
                if (tareaActual.getPrioridad() < tareaAnterior.getPrioridad()) {
                    lista.Cambiar_lugares(j, j + 1);
                }
                else if (tareaActual.getPrioridad() == tareaAnterior.getPrioridad() &&
                        tareaActual.getFecha().isBefore(tareaAnterior.getFecha())) {
                    lista.Cambiar_lugares(j, j + 1);
                } else {
                    break;
                }
                j--;
            }
            i++;
        }
    }

    public String toString(){
        Tarea TareaAux = new Tarea();
        String acumulador = "";
        Ordenamiento();
        if(lista.tamano() == 0){
            acumulador = "Lista de tareas vacia";
        }else {
            for (int i=0 ;i < lista.tamano();i++){
                TareaAux = lista.retornar(i);
                if (TareaAux.getRecordatorio().equals(TareaAux.getFecha()) ||(TareaAux.getRecordatorio().isAfter(TareaAux.getFecha()))){}
                else {acumulador += "Tarea " + TareaAux.getPrioridad().toString() +" " + TareaAux.getActividad() +" "+TareaAux.getFecha().toString() +" \n";}
            }
        }
        return acumulador;
    }

    public String colaborador_finalizo(String colaborador){
       String mensaje = lista.colaborador_finalizo(colaborador) ;
        return mensaje;
    }

}
