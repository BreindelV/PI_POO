/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author shari
 */
public class Venta extends ProductoVenta {
    //atributos
    private double entradaTotal;

    //metodos
    public Venta(double ventaDia, double totalProductos, String nombre, double costo) {
        super(totalProductos, nombre, costo);
        this.entradaTotal = ventaDia;
    }
    public void setVentaDia(double ventaDia) {
        this.entradaTotal = ventaDia;
    }
    public double getVentaDia() {
        return entradaTotal;
    }

    @Override
    public String toString() {
        return "VentasTotales{" + "ventaDia=" + entradaTotal + '}';
    }
}
