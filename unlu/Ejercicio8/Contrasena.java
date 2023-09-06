package unlu.Ejercicio8;
import java.util.Random;

public class Contrasena {
    private String Contrasena;
    private Integer Longitud = 8;

    private String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";


    private boolean Fuerza(String contrasena){
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumero = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {contadorMayusculas++;}
            if (Character.isLowerCase(caracter)){contadorMinusculas++;}
            if (Character.isDigit(caracter)){contadorNumero++;}
        }
        if(contadorMayusculas >= 2 && contadorMinusculas >= 1 && contadorNumero >= 2){return true;}
        return false;
    }

    private String GenerarContrasena(Integer longitud){
        String contrasena = "";
        for (int x = 0; x < longitud; x++) {
            Random r = new Random();
            char c = banco.charAt(r.nextInt(banco.length()));
            contrasena += c;
        }
        return contrasena;
    }
    public String CrearContrasena(Integer longitud){
        String mensaje = "";
        boolean bucle = true;
        if(longitud >=  this.Longitud){this.Longitud= longitud;}
        else{return "Longitud muy corta";}
        while(bucle){
        this.Contrasena= GenerarContrasena(longitud);
        if(Fuerza(this.Contrasena)){
            mensaje += this.Contrasena + " - Fuerte\n";
            bucle = false;
            }
        else {
            mensaje+=this.Contrasena + "- Devil \n";
        }
        }
        return mensaje;
    }
}
