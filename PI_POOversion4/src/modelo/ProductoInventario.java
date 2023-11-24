/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author shari
 */
public class ProductoInventario extends Producto{
    private int existencia;
    public ProductoInventario(int existencia, String Nombre, double Precio) {
        super(Nombre, Precio);
        this.existencia = existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public int getExistencia() {
        return existencia;
    }
}
