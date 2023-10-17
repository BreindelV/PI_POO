/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author shari
 */
public class VentasTotales extends Venta {
    //atributos
    private double ventaDia;

    //metodos
    public VentasTotales(double ventaDia, double totalProductos, String nombre, double costo) {
        super(totalProductos, nombre, costo);
        this.ventaDia = ventaDia;
    }
    public void setVentaDia(double ventaDia) {
        this.ventaDia = ventaDia;
    }
    public double getVentaDia() {
        return ventaDia;
    }

    @Override
    public String toString() {
        return "VentasTotales{" + "ventaDia=" + ventaDia + '}';
    }
}
