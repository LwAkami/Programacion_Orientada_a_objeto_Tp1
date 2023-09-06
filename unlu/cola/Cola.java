package unlu.cola;
import unlu.lista.Nodo;
public class Cola {
    private Nodo primer = null;

    public void encolar(Object Dato){
        Nodo nuevo_Nodo = new Nodo();
        nuevo_Nodo.setDato(Dato);
        if (primer == null){
            primer = nuevo_Nodo;
        } else{
            Nodo nodoAux = primer;
            while(nodoAux.getSiguiente() != null){
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nuevo_Nodo);
        }
    };
    public Object desencolar(){
        Nodo nodoAux = primer;
        primer = nodoAux.getSiguiente();
        return nodoAux.getDato();
    };
    public Object recuperar(){
        return primer.getDato();
    };

    public boolean esvacio(){
        boolean vacia = false;
        if (primer == null) { vacia = true;}
        return vacia;
    }
}
