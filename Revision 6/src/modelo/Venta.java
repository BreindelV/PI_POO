/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author shari
 */
public class Venta {

    private ArrayList<String> NombreVenta;
    private double Precio;
    private double PrecioVenta;
    private int Identificador;
    private String NombreCliente;
    private ArrayList<String> Cantidad;
    private double porcentajeDescuento;

    // Constructor que incluye el descuento
    public Venta(ArrayList<String> listaVentas, double total, double totalImporte, int contadorVentas, ArrayList<String> listaCantidad, String nombreCliente, double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Venta(ArrayList<String> Venta, double Precio, double PrevioVenta, int Identificador, ArrayList<String> Cantidad, String NombreCliente) {
        this.NombreVenta = Venta;
        this.Precio = Precio;
        this.PrecioVenta = PrevioVenta;
        this.Identificador = Identificador;
        this.Cantidad = Cantidad;
        this.NombreCliente = NombreCliente;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public ArrayList<String> getNombreVenta() {
        return NombreVenta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getPrecio() {
        return Precio;
    }

    public ArrayList<String> getCantidad() {
        return Cantidad;
    }

    public void setCantidad(ArrayList<String> Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public void setNombreVenta(ArrayList<String> Venta) {
        this.NombreVenta = Venta;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setPrecioVenta(double PrevioVenta) {
        this.PrecioVenta = PrevioVenta;
    }
    
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Ventas{" + "Venta=" + getNombreVenta() + ", Precio=" + getPrecio() + ", PrevioVenta=" + getPrecioVenta() + '}';
    }

    public int getDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
