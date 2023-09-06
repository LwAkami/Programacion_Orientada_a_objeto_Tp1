import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

import unlu.doble_enlace.Lista_doble_enlace;
import unlu.lista.Nodo;
import unlu.lista.Lista_un_enlace;
import unlu.pila.Pila;
import unlu.cola.Cola;
import unlu.Tareas.Lista_De_Tareas;
import unlu.Biblioteca.Biblioteca;
import unlu.Ejercicio7.Ecuacion_de_segundo_grado;
import unlu.Ejercicio8.Contrasena;
import unlu.Ejercicio9.Fechas;
import unlu.Tareas.Administrador_de_lista;
import unlu.ejercicio11.Juego;



public class Main {
    public static void ejercicio13(){
        Administrador_de_lista tarea = new Administrador_de_lista();
        tarea.agregar_tarea("Ir al supermercado mañana",false,"07/09/2023","07/09/2023",0);
        tarea.agregar_tarea("Consultar repuesto del auto",true,"04/09/2024","07/09/2023",1);
        tarea.agregar_tarea("Ir al cine a ver la nueva película de Marvel",false,"05/09/2023","07/09/2023",2);
        tarea.agregar_tarea("Crear el github del proyecto",true,"04/09/2024","07/09/2023",4);
        System.out.printf(tarea.toString());
        tarea.completarTarea(0,"07/09/2023","Esteban");
        tarea.completarTarea(3,"07/09/2023","jasmin");
        tarea.completarTarea(0,"07/09/2023","jasmin");
        tarea.completarTarea(3,"07/09/2023","juancho");
        System.out.println(tarea.colaborador_finalizo("jasmin"));

    }
    public static void ejercicio12(){
        Administrador_de_lista tarea = new Administrador_de_lista();
        tarea.agregar_tarea("Ir al supermercado mañana",false,"07/09/2023","07/09/2023",0);
        tarea.agregar_tarea("Consultar repuesto del auto",true,"04/09/2024","07/09/2023",1);
        tarea.agregar_tarea("Ir al cine a ver la nueva película de Marvel",false,"05/09/2023","07/09/2023",2);
        System.out.printf(tarea.toString());
    }
    public static void ejercicio11(){
        Juego juego = new Juego();
        juego.inicializar_diccionario();
        juego.IntroduccirPalabra(1,"Manzana");
        juego.IntroduccirPalabra(1,"Manzana");
        juego.IntroduccirPalabra(1,"Manzana");
        juego.IntroduccirPalabra(2,"Manzana");
        juego.IntroduccirPalabra(2,"Comedia");
        juego.IntroduccirPalabra(2,"Manzana");
        System.out.printf(juego.ganador());
    }
    public static void ejercicio10(){
        Lista_De_Tareas tarea = new Lista_De_Tareas();
        tarea.agregar_tarea("Ir al supermercado mañana",false,"07/09/2023","07/09/2023",0);
        tarea.agregar_tarea("Consultar repuesto del auto",true,"04/09/2024","07/09/2023",1);
        tarea.agregar_tarea("Ir al cine a ver la nueva película de Marvel",false,"05/09/2023","07/09/2023",2);
        System.out.printf(tarea.toString());
    }
    public static void ejercicio9(){
        Fechas fecha = new Fechas();
        System.out.printf(fecha.menor("20/01/2001","31/02/2003"));
        System.out.printf(fecha.mayor("20/01/2001","31/02/2003"));
        System.out.printf(fecha.Determinar_si_se_encuentra_entre_dos_fechas("20/01/2001","31/02/2003","14/01/2002"));
    }
    public static void ejercicio8(){
        Contrasena contrasena = new Contrasena();
        System.out.printf(contrasena.CrearContrasena(8));
    }
    public static void ejercicio7(){
        Ecuacion_de_segundo_grado ecuacion= new Ecuacion_de_segundo_grado();
        ecuacion.setEcuacion(1,2,-8);
        System.out.printf(ecuacion.toString());
    }
    public static void ejercicio6(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.CrearLibros();
        System.out.printf(biblioteca.Descripcion(0));
        System.out.printf(biblioteca.Descripcion(1));
        System.out.printf(biblioteca.toString());
        System.out.printf(biblioteca.prestar(0));
        System.out.printf(biblioteca.prestar(1));
        System.out.printf("La cantidad de libros prestados son " + (biblioteca.Cantidad_prestamos_realizados()).toString());
    }
    public static void ejercicio5(){
        Lista_De_Tareas tarea = new Lista_De_Tareas();
        tarea.agregar_tarea("Ir al supermercado mañana",false,"07/09/2023","07/09/2023",0);
        tarea.agregar_tarea("Consultar repuesto del auto",true,"04/09/2024","07/09/2023",1);
        tarea.agregar_tarea("Ir al cine a ver la nueva película de Marvel",false,"05/09/2023","07/09/2023",2);
        System.out.printf(tarea.toString());
    }
    public static void ejercicio4(){
        Cola cola = new Cola();
        cola.encolar("Mantecol\n");
        cola.encolar("Mantecol\n");
        cola.encolar("Papel\n");
        cola.desencolar();
        System.out.printf(cola.recuperar().toString());
    }
    public static void ejercicio3(){
        Pila pila = new Pila();
        pila.apilar("Hola mundo\n");
        pila.apilar("hernan\n");
        pila.desapilar();
        System.out.printf(pila.recuperar().toString());
    }
    public static void ejercicio2(){
        Lista_doble_enlace lista = new Lista_doble_enlace();
        lista.agregar("hola");
        lista.agregar("hola2");
        lista.agregar("hola3");
        lista.insertar(76,"hernan");
    }

    public static void ejercicio1(){
        Lista_un_enlace lista = new Lista_un_enlace();
        lista.agregar("hola");
        lista.agregar("hola2");
        lista.agregar("hola3");
        lista.insertar(76,"hernan");
        System.out.println(lista);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. ejercicio 1");
            System.out.println("2. ejercicio 2");
            System.out.println("3. ejercicio 3");
            System.out.println("4. ejercicio 4");
            System.out.println("5. ejercicio 5");
            System.out.println("6. ejercicio 6");
            System.out.println("7. ejercicio 7");
            System.out.println("8. ejercicio 8");
            System.out.println("9. ejercicio 9");
            System.out.println("10. ejercicio 10");
            System.out.println("11. ejercicio 11");
            System.out.println("12. ejercicio 12");
            System.out.println("13. ejercicio 13");
            System.out.println("14. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcion != 14);

        scanner.close();

        //Administrador_de_lista tarea = new Administrador_de_lista();
        //tarea.agregar_tarea("Ir al supermercado mañana",false,"07/09/2023","07/09/2023",0);
        //tarea.agregar_tarea("Consultar repuesto del auto",true,"04/09/2024","07/09/2023",1);
        //tarea.agregar_tarea("Ir al cine a ver la nueva película de Marvel",false,"05/09/2023","07/09/2023",2);
        //System.out.printf(tarea.toString());

    }
}