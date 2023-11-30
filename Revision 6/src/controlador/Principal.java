
package controlador;

import java.util.ArrayList;
import modelo.Producto;
import modelo.ProductoInventario;
import modelo.ProductoVenta;
import modelo.Venta;
import vista.FRMInicio;

/**
 *
 * @author shari
 */
public class Principal {
        public static ArrayList<ProductoInventario> Inventario = new ArrayList<ProductoInventario>();
        public static ArrayList<ProductoVenta> Venta = new ArrayList<ProductoVenta>();
        public static ArrayList<Venta> Ventas = new ArrayList<Venta>();
        public static int contadorVentas = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                new FRMInicio().setVisible(true);
        
    }
    
}
