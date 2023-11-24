/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author shari
 */
public class ProductoVenta extends Producto{
    private int cantidad;
    public ProductoVenta(int cantidad, String Nombre, double Precio) {
        super(Nombre, Precio);
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double TotalUnProducto(double Precio, int Cantidad){
        double total = Precio*Cantidad;
        return total;
    }
}
