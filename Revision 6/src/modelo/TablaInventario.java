/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Principal;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shari
 */
public class TablaInventario {

    public void inicializar(JTable tabla) {
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

        titulos.add("Nombre");
        titulos.add("Precio");
        titulos.add("Cantidad");

        for (int i = 0; i < Principal.Inventario.size(); i++) {
            Vector<Object> filas = new Vector<Object>();
            filas.add(Principal.Inventario.get(i).getNombre());
            filas.add(Principal.Inventario.get(i).getPrecio());
            filas.add(Principal.Inventario.get(i).getExistencia());

            datos.add(filas);
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
    }

}
