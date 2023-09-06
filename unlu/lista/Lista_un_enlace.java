package unlu.lista;

public class Lista_un_enlace {
    private Nodo primer = null;

    public void agregar(Object Dato){
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
    }

    public String toString(){
        String acumulador = "";
        Integer i = 1;
        Nodo nodoAux = primer;
        if(primer == null){
         acumulador = "Lista vacia";
        }else {
            while(nodoAux != null){
                acumulador += "Nodo " + i +" " + nodoAux.getDato() + " \n";
                i++;
                nodoAux = nodoAux.getSiguiente();
            }
        }
        return acumulador;
    }

    public Boolean Esvacia(){
        boolean vacia = true;
        if(primer != null){vacia = false;}
        return vacia;
    }

    public Integer longitud(){
        //pregunta la longitud de la lista
        Integer i = 0;
        if (primer == null){
            return 0; //si no tiene un primer dato corta de una y sale
        } else{
            Nodo nodoAux = primer; //recorre la lista y cuanta 1 + 1
            while(nodoAux.getSiguiente() != null){
                nodoAux = nodoAux.getSiguiente();
                i++;
            };
        }
        return i;
    }

    public boolean eliminar(Integer posicion){ //la posicion de la lista que quiere eliminar
        boolean eliminacion;
        Integer i = 1;
        if (primer == null){
            return eliminacion = false;
        } else{
            Nodo nodoAux = primer;
            if (i == posicion){
                primer = nodoAux.getSiguiente(); // seteo al segundo como el primero y dejo el primero perdido en memoria a espera de la eliminacion
                return eliminacion = true;
            }
            else {
                while (nodoAux.getSiguiente() != null) {
                    i++;
                    if (i == posicion){
                        Nodo nodoAux2;
                        nodoAux2 = nodoAux;
                        nodoAux2 = nodoAux2.getSiguiente();
                        nodoAux.setSiguiente(nodoAux2.getSiguiente());
                        return eliminacion = true;
                    }
                    nodoAux = nodoAux.getSiguiente();
                }
            }
        }
    return eliminacion = false;
    }
    public Object recuperar(Integer posicion){
        Integer i = 1;
        if (primer == null){
            return "la lista esta vacia";
        } else{
            Nodo nodoAux = primer;
            if (i == posicion){
                return primer.getDato();
            }
            else {
                while (nodoAux.getSiguiente() != null) {
                    i++;
                    nodoAux = nodoAux.getSiguiente();
                    if (i == posicion){
                        return nodoAux.getDato();
                    }
                }
            }
        }
        return "no existe la posicion " + posicion.toString();
    }

    public Object insertar(Integer posicion, Object Dato){
        Integer i = 1;
        Nodo nuevo_Nodo = new Nodo();
        nuevo_Nodo.setDato(Dato);
        Nodo nodoAux = primer;
        if (i == posicion){
            nuevo_Nodo.setSiguiente(primer); //seteamos la siguiente posicion con el que antes era la primera
            primer = nuevo_Nodo; //seteamos el nuevo dato en la primer posicion
            return "Insertado corectamente.";
        }
        if (primer == null){;
            return "la lista esta vacia.";
        } else{
                while (nodoAux.getSiguiente() != null) {
                    i++;
                    if (i == posicion) {
                        nuevo_Nodo.setSiguiente(nodoAux.getSiguiente());
                        nodoAux.setSiguiente(nuevo_Nodo);
                        return "La insercion se hiso corectamente";
                    }
                    nodoAux = nodoAux.getSiguiente();
                }
        }
        nodoAux.setSiguiente(nuevo_Nodo);
        return "no existe la posicion " + posicion.toString() + " se inserto en la ultima posicion";
    }
}


