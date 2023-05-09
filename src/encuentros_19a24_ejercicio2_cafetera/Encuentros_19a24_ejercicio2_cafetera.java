/*
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos 
    capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
    cantidadActual (la cantidad actual de café que hay en la cafetera).

Agregar constructor vacío y con
parámetros así como setters y getters. 
--------------------------------------------------------------------------------------------------
Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
    a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
        simula la acción de servir la
        taza con la capacidad indicada. Si la cantidad actual de café “no
        alcanza” para llenar la taza, se sirve lo que quede. El método le
        informará al usuario si se llenó o no la taza, y de no haberse llenado
        en cuanto quedó la taza.
    c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
    d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
        el método lo recibe y se añade a la cafetera la cantidad de café
        indicada.
 */
package encuentros_19a24_ejercicio2_cafetera;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

public class Encuentros_19a24_ejercicio2_cafetera {

    public static void main(String[] args) {

        CafeteraServicio servicioCafe = new CafeteraServicio();

        Cafetera cafetera = servicioCafe.crearCafetera();
//        //1)            ------------------------------------------------------------------------------------------------
//        System.out.println("------------------------------------------------------------------------------------------");
//
//        servicioCafe.llenarCafetera(cafetera);
//
//        //2)            ------------------------------------------------------------------------------------------------
//        System.out.println("------------------------------------------------------------------------------------------");
//
//        servicioCafe.servirTaza(cafetera);
//
//        //3)            ------------------------------------------------------------------------------------------------
//        System.out.println("------------------------------------------------------------------------------------------");
//
//        servicioCafe.vaciarCafetera(cafetera);
//
//        //4)            ------------------------------------------------------------------------------------------------
//        System.out.println("------------------------------------------------------------------------------------------");
//
//        servicioCafe.agregarCafe(cafetera);

        //-----------------------------------------------------------------------------------------------
        // Creacion del menu
        Scanner lector = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("Bienvenido a la Nescapelera! Ingrese sus opciones.");
            System.out.println("1 - Llenar cafetera.");
            System.out.println("2 - Servir cafe");
            System.out.println("3 - Vaciar cafetera");
            System.out.println("4 - Agregar cafe");
            System.out.println("5 - Salir del programa");

            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    servicioCafe.llenarCafetera(cafetera);
                    break;
                case 2:
                    servicioCafe.servirTaza(cafetera);
                    break;
                case 3:
                    servicioCafe.vaciarCafetera(cafetera);
                    break;
                case 4:
                    servicioCafe.agregarCafe(cafetera);
                    break;
                case 5:
                    System.out.println("Que siga su jornada con tranquilidad y energia!");
                default:
                    System.out.println("Toca una opcion valida.");
                    break;
            }

        } while (opcion != 5);

    }

}
