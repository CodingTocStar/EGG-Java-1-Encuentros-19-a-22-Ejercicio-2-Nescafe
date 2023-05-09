/*
Desarrolle una clase Cafetera en el paquete
1) Entidades con los atributos 
    capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
    cantidadActual (la cantidad actual de café que hay en la cafetera).
2) Agregar constructor vacío y con
parámetros así como setters y getters. 
 */
package entidades;


public class Cafetera {
    //atributos
    private double capacidadMaxima;
    private double cantidadActual;
    
    //constructores
    public Cafetera() {
}
    
    public Cafetera (double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    
    public Cafetera(double capacidadMaxima,double cantidadActual) {
        
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    
    }

    
    
    //getter & setter

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
