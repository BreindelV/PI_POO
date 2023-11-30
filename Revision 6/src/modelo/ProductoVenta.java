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

    private int cantidad;
    private double importe;

    public ProductoVenta(int cantidad, String Nombre, double Precio, double importe) {
        super(Nombre, Precio);
        this.cantidad = cantidad;
        this.importe = (cantidad * Precio) * 1.5;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double CalculoImporteProducto(double Precio, int Cantidad) {
        double total = Precio * Cantidad;
        return total;
    }

    @Override
    public String toString() {
        return "ProductoVenta{" + "cantidad=" + cantidad + '}';
    }

}
