package unlu.Biblioteca;

import unlu.lista.Nodo;

public class Libro {
    private String Autor;
    private String Titulo;
    private Integer Ejemplares;
    private Integer Paginas;
    private Integer Cantidad_Prestados;
    private Integer Cantidad_Disponible;

    public void setAutor(String autor) {Autor = autor;}

    public void setCantidad_Disponible(Integer cantidad_Disponible) {Cantidad_Disponible = cantidad_Disponible;}

    public void setCantidad_Prestados(Integer cantidad_Prestados) {Cantidad_Prestados = cantidad_Prestados;}

    public void setEjemplares(Integer ejemplares) {Ejemplares = ejemplares;}

    public void setPaginas(Integer paginas) {Paginas = paginas;}

    public void setTitulo(String titulo) {Titulo = titulo;}

    public Integer getCantidad_Disponible() {return Cantidad_Disponible;}

    public Integer getCantidad_Prestados() {return Cantidad_Prestados;}

    public Integer getEjemplares() {return Ejemplares;}

    public Integer getPaginas() {return Paginas;}

    public String getAutor() {return Autor;}

    public String getTitulo() {return Titulo;}

    public String PrestarLibro(){
        if (getCantidad_Disponible() > 1){
            setCantidad_Prestados(this.Cantidad_Prestados+1);
            setCantidad_Disponible(this.Cantidad_Disponible-1);
            return "Prestado con Exito \n";}
        else {return "No hay disponibles para prestar \n";}
    }

    public String toString(){
        return "El libro " + this.getTitulo() +" creado por el autor "+ this.getAutor()+" tiene " + this.getPaginas().toString() + ", quedan " + getCantidad_Disponible() + " disponibles " +
                "y se prestaron "+ getCantidad_Prestados() + "\n";
    }
}
