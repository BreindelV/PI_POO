/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author shari
 */
public class ProductoInventario extends Producto {
    //atributos
    private double cantidad;
    
    //metodos
    public ProductoInventario(double cantidad, String nombre, double costo) {
        super(nombre, costo);
        this.cantidad = cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "ProductoInventario{" + "cantidad=" + cantidad + '}';
    }
    
    
    
}
