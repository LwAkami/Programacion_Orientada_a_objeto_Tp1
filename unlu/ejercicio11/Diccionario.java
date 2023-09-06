package unlu.ejercicio11;
import unlu.Tareas.Tarea;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class Diccionario {
    private ArrayList<String> diccionario = new ArrayList<>();

    public Integer cantidad_palabras(){return  diccionario.size();}
    public String conseguirpalabra(int i){return diccionario.get(i);}
    public void CargarDiccionario() {
        String nombreArchivo = "src/unlu/ejercicio11/Diccionario.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                diccionario.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString () {
        String salida = "";
        for (String palabra : diccionario) {salida += palabra + "\n";}
        return salida;
    }
}
