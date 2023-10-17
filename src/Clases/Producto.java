/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author shari
 */
public abstract class Producto {
    //atributos
    private String nombre;
    private double costo;
    
    //métodos
    public Producto(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", costo=" + costo + '}';
    }
}
