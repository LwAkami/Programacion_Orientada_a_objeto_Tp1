package unlu.ejercicio11;
public class Jugador {
    private String nombre;
    private Integer puntos = 0;
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPuntos(Integer puntos) {this.puntos = puntos;}
    public Integer getPuntos() {return puntos;}
    public String getNombre() {return nombre;}
    public void sumarpuntos(Integer puntos){this.puntos += puntos;}
}