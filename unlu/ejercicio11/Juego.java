package unlu.ejercicio11;
import unlu.Tareas.Administrador_de_lista;
import unlu.ejercicio11.Jugador;
import unlu.ejercicio11.Diccionario;

import java.util.ArrayList;

public class Juego {
    Diccionario diccionario = new Diccionario();
    private String[] letrasEspecificas = {"k", "z", "x","y","w","q"};
    Jugador primer = new Jugador();
    Jugador segundo = new Jugador();

    private Integer contar_puntos(String palabra){
        Integer puntos;
        puntos = palabra.length();
        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i, i + 1);
            for (String letraEspecifica : letrasEspecificas) {
                if (letra.equals(letraEspecifica)) {
                   puntos++;
                }
            }
        }
        return puntos;
    }
    public void inicializar_diccionario(){
        diccionario.CargarDiccionario();
    }
    public String imprimir_diccionario(){
        return  diccionario.toString();
    };

    public void IntroduccirPalabra(Integer jugador, String palabra){
        Integer puntos = 0;
        for(int i = 0; i < diccionario.cantidad_palabras() ; i++){
            if(palabra.equals(diccionario.conseguirpalabra(i))){
                puntos = contar_puntos(palabra);
            }
        }
        if (jugador == 1){primer.sumarpuntos(puntos);}
        else {segundo.sumarpuntos(puntos);}
    }

    public String ganador(){
        if(primer.getPuntos() > segundo.getPuntos()){
            return "El primer jugador gano";
        }
        if (segundo.getPuntos() > primer.getPuntos()){return "El segundo jugador gano";}
        return "Empataron";
    }
}
