package unlu.pila;
import unlu.lista.Nodo;

public class Pila {
    private Nodo ultimo = null;

    public void apilar(Object Dato){
        Nodo nuevo_Nodo = new Nodo();
        nuevo_Nodo.setDato(Dato);
        if (ultimo == null){
            ultimo = nuevo_Nodo;
        } else{
            Nodo nodoAux = ultimo;//agarro el primer nodo
            nuevo_Nodo.setSiguiente(nodoAux); //seteo el ultimo
            ultimo = nuevo_Nodo;
        }
    };
    public Object desapilar(){
        Nodo nodoAux = ultimo;
        ultimo = nodoAux.getSiguiente();
        return nodoAux.getDato();
    };
    public Object recuperar(){
        return ultimo.getDato();
    };

    public boolean esvacio(){
        boolean vacia = false;
        if (ultimo == null) {vacia = true;}
        return vacia;
    }
}
