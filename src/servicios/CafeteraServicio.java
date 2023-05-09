/*
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
b) Método servirTaza(int): 
        i) Se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
            simula la acción de servir la taza con la capacidad indicada. 
        ii) Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
        iii) El método le informará al usuario si se llenó o no la taza, y de no haberse llenado
        en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
        el método lo recibe y se añade a la cafetera la cantidad de café
        indicada.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

//=========================================================================================
public class CafeteraServicio {

    Scanner lector = new Scanner(System.in);

    //---------------------------------------------------------------------------------------------------------------------------
    public Cafetera crearCafetera() {

        System.out.println("Definir capacidad maxima:");
        double capacidadMaxima = lector.nextDouble();
        //cafetera.setCapacidadMaxima(capacidadMaxima);

        System.out.println("La capacidad de su cafetera es: " + capacidadMaxima + " CC");

        return new Cafetera(capacidadMaxima);
    }
    //---------------------------------------------------------------------------------------------------------------------------

    public void llenarCafetera(Cafetera cafetera) {

        System.out.println("Has llenado la cafetera");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());

        System.out.println("Su cantidad de cafe es: " + cafetera.getCantidadActual() + " CC.");

    }

    //---------------------------------------------------------------------------------------------------------------------------
    public void servirTaza(Cafetera cafetera) {

        System.out.println("Cual es la capacidad de su taza en CC?");
        double capacidadTaza = lector.nextDouble();

        if (cafetera.getCantidadActual() > capacidadTaza) {

            //capacidadActual = capacidadActual - capacidadTaza;
            cafetera.setCantidadActual(cafetera.getCantidadActual() - capacidadTaza);

            System.out.println("Su taza ha sido cargada.");
            System.out.println("En la cafetera queda " + cafetera.getCantidadActual() + " CC de cafe disponible");

        } else {
            System.out.println("No hay suficiente café para llenar la taza. Se servirá lo que queda.");
            System.out.println("La taza se llenó hasta " + cafetera.getCantidadActual() + " CC.");
            cafetera.setCantidadActual(0);
            System.out.println("La cafetera está vacía, por favor recargar.");
        }

    }

    //---------------------------------------------------------------------------------------------------------------------------
    //c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera se ha vaciado. Su contenido es: " + cafetera.getCantidadActual() + " CC.");
    }

    //---------------------------------------------------------------------------------------------------------------------------
    //d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
    //el método lo recibe y se añade a la cafetera la cantidad de café
    //indicada.
    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Indique la cantidad de cafe que va a ingresar:");
        double ingresoCafe = lector.nextDouble();

        if (cafetera.getCantidadActual() + ingresoCafe > cafetera.getCapacidadMaxima()) {
            System.out.println("El cafe que intentas agregar excede la capacidad de la cafetera!");
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se ha llenado la cafetera hasta su maxima capacidad: " + cafetera.getCapacidadMaxima() + " CC");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + ingresoCafe);
            System.out.println("Se ha agregado cafe. La cantidad actual de cafe es: " + cafetera.getCantidadActual() + " CC");
        }
    }

}
//=========================================================================================
