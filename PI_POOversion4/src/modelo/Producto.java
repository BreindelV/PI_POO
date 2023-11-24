/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author shari
 */
public abstract class Producto {
    private String Nombre;
    private double Precio;

    public Producto(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}
