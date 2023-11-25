
package controlador;

import java.util.ArrayList;
import modelo.Producto;
import modelo.ProductoInventario;
import modelo.ProductoVenta;
import vista.Inicio;

/**
 *
 * @author shari
 */
public class Principal {
        public static ArrayList<Producto> Productos = new ArrayList<Producto>();
        public static ArrayList<ProductoInventario> Inventario = new ArrayList<ProductoInventario>();
        public static ArrayList<ProductoVenta> Venta = new ArrayList<ProductoVenta>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                new Inicio().setVisible(true);
        
    }
    
}
