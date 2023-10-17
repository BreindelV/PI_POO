/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author shari
 */
public class Venta extends Producto {
    //atributos
    private double totalProductos;

    //metodos
    public Venta(double totalProductos, String nombre, double costo) {
        super(nombre, costo);
        this.totalProductos = totalProductos;
    }
    public void setTotalProductos(double totalProductos) {
        this.totalProductos = totalProductos;
    }
    public double getTotalProductos() {
        return totalProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("totalProductos=").append(totalProductos);
        sb.append('}');
        return sb.toString();
    }
}
