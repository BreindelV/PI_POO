/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aplicacion;
//importación de las clases
import modelo.Factura;
import modelo.PorPagar;
import modelo.Producto;
import modelo.ProductoInventario;
import modelo.ProductoVenta;
import modelo.Venta;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author shari
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<PorPagar> listaPagos = new ArrayList<PorPagar>();
        
        listaPagos.add(new Factura(1));
        
        System.out.println(listaPagos.get(1));
        // TODO code application logic here
        Scanner entradaDb = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        
        //programa
        
    }
    
}
