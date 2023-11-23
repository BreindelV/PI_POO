/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author shari
 */
public class ProductoVenta extends Producto {
    //atributos
    private double cantidadVenta;

    //metodos
    public ProductoVenta(double totalProductos, String nombre, double costo) {
        super(nombre, costo);
        this.cantidadVenta = totalProductos;
    }
    public void setCantidadVenta(double totalProductos) {
        this.cantidadVenta = totalProductos;
    }
    public double getTCantidadVenta() {
        return cantidadVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "cantidadVenta=" + cantidadVenta + '}';
    }

   
}
