/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Principal;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shari
 */
public class TablaVentas {

    public void inicializarTV(JTable TablaVentas) {
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

        titulos.add("Folio");
        titulos.add("Nombre del Cliente");
        titulos.add("Productos");
        titulos.add("Precio");
        titulos.add("Precio de Venta");

        for (int i = 0; i < Principal.Ventas.size(); i++) {
            Vector<Object> filas = new Vector<Object>();

            String listahtml = "";
            String listaUnida = "";
            for (int j = 0; j < Principal.Ventas.get(i).getNombreVenta().size(); j++) {
                String nombreCantidad = Principal.Ventas.get(i).getNombreVenta().get(j) + " x" + Principal.Ventas.get(i).getCantidad().get(j);
                listaUnida = listaUnida + nombreCantidad + "<br>";
                listahtml = ("<html>" + listaUnida + "</html>");
            }

            filas.add(Principal.Ventas.get(i).getIdentificador());
            filas.add(Principal.Ventas.get(i).getNombreCliente());
            filas.add(listahtml);
            filas.add(Principal.Ventas.get(i).getPrecio());
            filas.add(Principal.Ventas.get(i).getPrecioVenta());

            datos.add(filas);
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        TablaVentas.setModel(modelo);
    }
}
