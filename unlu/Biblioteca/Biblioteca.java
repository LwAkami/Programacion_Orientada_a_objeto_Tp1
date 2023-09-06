package unlu.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> Bibliote = new ArrayList<>();
   public void CrearLibros(){
       Libro libro1 = new Libro();
       Libro libro2 = new Libro();
       libro1.setCantidad_Prestados(0);
       libro2.setCantidad_Prestados(0);
       libro1.setPaginas(100);
       libro2.setPaginas(200);
       libro1.setCantidad_Disponible(10);
       libro2.setCantidad_Disponible(1);
       libro1.setEjemplares(10);
       libro2.setEjemplares(1);
       libro1.setTitulo("Las aventuras de Muvi");
       libro2.setTitulo("Las aventuras de Ricardo");
       libro1.setAutor("Jose Hernandez");
       libro2.setAutor("Ricardo Ricardo");
       Bibliote.add(libro1);
       Bibliote.add(libro2);
   }
    public String toString(){
        String Mensaje = "";
        if (Bibliote.get(0).getPaginas() < Bibliote.get(1).getPaginas()){Mensaje = "El primer libro contiene mas paginas que el segundo libro\n";}
        else {Mensaje = "El segundo libro contiene mas paginas que el primer libro\n";}
        Mensaje += Bibliote.get(0).getTitulo() + "\n" + Bibliote.get(1).getTitulo();
        return Mensaje;
    }

    public String Descripcion(Integer libro){
       if(libro <= Bibliote.size()){return Bibliote.get(libro).toString();}
       return "Ese libro no existe";
    }

    public Integer Cantidad_prestamos_realizados(){
       Integer cantidad;
       cantidad = Bibliote.get(0).getCantidad_Prestados() + Bibliote.get(1).getCantidad_Prestados();
       return cantidad;
    }

    public String prestar(Integer libro){
        if(libro <= Bibliote.size()){return Bibliote.get(libro).toString();}
        return "Ese libro no existe";
   }
}
