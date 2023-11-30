/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Principal;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shari
 */
public class TablaCrearVenta {

    /*String unNombre = "";
    double unPrecio = 0.0;
    int unaCantidad = 0;
    double unImporte = 0.0;
    ProductoVenta modeloUnaVenta = new ProductoVenta(unaCantidad,unNombre,unPrecio,unImporte);*/
    public void Inicializar(JTable tabla) {
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        titulos.add("Nombre");
        titulos.add("Cantidad");
        titulos.add("Precio");
        titulos.add("Importe por producto");

        for (int i = 0; i < Principal.Venta.size(); i++) {
            Vector<Object> filas = new Vector<Object>();
            filas.add(Principal.Venta.get(i).getNombre());
            filas.add(Principal.Venta.get(i).getCantidad());
            filas.add(Principal.Venta.get(i).getPrecio());
            filas.add(Principal.Venta.get(i).getImporte());

            datos.add(filas);
        }
        DefaultTableModel modeloVenta = new DefaultTableModel(datos, titulos);
        tabla.setModel(modeloVenta);

    }
}
