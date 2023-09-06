package unlu.doble_enlace;

public class Nodo {
    private Object dato;
    private Nodo siguiente = null;
    private Nodo anterior = null;

    public void setDato(Object dato){
        this.dato = dato;
    }
    public Object getDato(){
        return dato;
    }

    public void setSiguiente(Nodo nodo){
        this.siguiente = nodo;
    }

    public void setAnterior(Nodo nodo){this.anterior = nodo;}

    public Nodo getSiguiente(){
        return siguiente;
    }

    public Nodo getAnterior(){return anterior;}
}
