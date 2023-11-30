package vista;

import static controlador.Principal.Inventario;
import static controlador.Principal.Venta;
import static controlador.Principal.Ventas;
import modelo.ProductoInventario;
import modelo.ProductoVenta;
import modelo.TablaCrearVenta;
import modelo.Venta;
import java.awt.Color;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JOptionPane;

public class FRMCrearVenta extends javax.swing.JFrame {

    public TablaCrearVenta modeloTablaVenta = new TablaCrearVenta();
    String mensajeError = "";

    public FRMCrearVenta() {
        initComponents();
        iniciarTablaVenta();
        setTitle("Crear Venta");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/medicine.png")).getImage());

    }

    public void iniciarTablaVenta() {
        modeloTablaVenta.Inicializar(TablaVenta);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBProducto = new javax.swing.JLabel();
        ComboBoxProducto = new javax.swing.JComboBox<>();
        LBCantidad = new javax.swing.JLabel();
        SpinnerCantidad = new javax.swing.JSpinner();
        LBPrecio = new javax.swing.JLabel();
        LBPrecioVenta = new javax.swing.JLabel();
        BTNAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVenta = new javax.swing.JTable();
        BTNCrearVenta = new javax.swing.JButton();
        LBTotal = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        LBImporte = new javax.swing.JLabel();
        LBNumeroPrecio = new javax.swing.JLabel();
        LBNumeroPrecioVenta = new javax.swing.JLabel();
        LBNumeroImporte = new javax.swing.JLabel();
        LBImporteVenta = new javax.swing.JLabel();
        LBNumeroImporteVenta = new javax.swing.JLabel();
        BTNResetarTabla = new javax.swing.JButton();
        LBNumeroTotal = new javax.swing.JLabel();
        TXTnombrePersona = new javax.swing.JTextField();
        LBpersona = new javax.swing.JLabel();
        BtnImprimir = new javax.swing.JButton();
        Descuento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LBProducto.setBackground(new java.awt.Color(255, 255, 255));
        LBProducto.setForeground(new java.awt.Color(255, 255, 255));
        LBProducto.setText("Producto");

        ComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProductoActionPerformed(evt);
            }
        });

        LBCantidad.setBackground(new java.awt.Color(255, 255, 255));
        LBCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LBCantidad.setText("Cantidad");

        SpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        SpinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerCantidadStateChanged(evt);
            }
        });

        LBPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LBPrecio.setText("Precio: ");

        LBPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        LBPrecioVenta.setText("Precio de Venta: ");

        BTNAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignoMas.png"))); // NOI18N
        BTNAñadir.setText("Añadir");
        BTNAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNAñadirMouseClicked(evt);
            }
        });
        BTNAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAñadirActionPerformed(evt);
            }
        });

        TablaVenta.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Precio de venta"
            }
        ));
        jScrollPane1.setViewportView(TablaVenta);

        BTNCrearVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearVenta.png"))); // NOI18N
        BTNCrearVenta.setText("Crear Venta");
        BTNCrearVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCrearVentaActionPerformed(evt);
            }
        });

        LBTotal.setForeground(new java.awt.Color(255, 255, 255));
        LBTotal.setText("Total: ");

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        LBImporte.setForeground(new java.awt.Color(255, 255, 255));
        LBImporte.setText("Importe:");

        LBNumeroPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LBNumeroPrecio.setText("$0.00");

        LBNumeroPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        LBNumeroPrecioVenta.setText("$0.00");

        LBNumeroImporte.setForeground(new java.awt.Color(255, 255, 255));
        LBNumeroImporte.setText("$0.00");

        LBImporteVenta.setForeground(new java.awt.Color(255, 255, 255));
        LBImporteVenta.setText("Imp.Venta:");

        LBNumeroImporteVenta.setForeground(new java.awt.Color(255, 255, 255));
        LBNumeroImporteVenta.setText("$0.00");

        BTNResetarTabla.setText("Resetear Tabla");
        BTNResetarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNResetarTablaActionPerformed(evt);
            }
        });

        LBNumeroTotal.setForeground(new java.awt.Color(255, 255, 255));
        LBNumeroTotal.setText("$0.00");

        TXTnombrePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnombrePersonaActionPerformed(evt);
            }
        });

        LBpersona.setForeground(new java.awt.Color(255, 255, 255));
        LBpersona.setText("Nombre del cliente : ");

        BtnImprimir.setText("Imprimir");
        BtnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnImprimirMouseClicked(evt);
            }
        });

        Descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescuentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa Descuento(%): ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LBTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBNumeroTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNResetarTabla)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BTNCrearVenta)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBPrecio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBpersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTnombrePersona)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBNumeroPrecio)
                .addGap(31, 31, 31)
                .addComponent(LBPrecioVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBNumeroPrecioVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBImporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBNumeroImporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBImporteVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBNumeroImporteVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(BTNAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRegresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBProducto)
                    .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBCantidad)
                    .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBPrecio)
                    .addComponent(LBPrecioVenta)
                    .addComponent(BTNAñadir)
                    .addComponent(BotonRegresar)
                    .addComponent(LBImporte)
                    .addComponent(LBNumeroPrecio)
                    .addComponent(LBNumeroPrecioVenta)
                    .addComponent(LBNumeroImporte)
                    .addComponent(LBImporteVenta)
                    .addComponent(LBNumeroImporteVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBpersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXTnombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCrearVenta)
                    .addComponent(LBTotal)
                    .addComponent(BTNResetarTabla)
                    .addComponent(LBNumeroTotal)
                    .addComponent(BtnImprimir)
                    .addComponent(Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCrearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearVentaActionPerformed
        // TODO add your handling code here:
        try {

            double Total = 0;
            for (int i = 0; i < Venta.size(); i++) {
                Total += (Venta.get(i).getPrecio()) * (Venta.get(i).getCantidad());
            }
            LBNumeroTotal.setText("" + Total);
            double TotalImporte = 0;
            for (int i = 0; i < Venta.size(); i++) {
                TotalImporte += Venta.get(i).getImporte();
            }
            LBNumeroTotal.setText("" + Total);

            ArrayList<String> listaVentas = new ArrayList<String>();

            for (int i = 0; i < Venta.size(); i++) {
                listaVentas.add(Venta.get(i).getNombre());
            }

            ArrayList<String> listaCantidad = new ArrayList<String>();

            for (int i = 0; i < Venta.size(); i++) {
                listaCantidad.add(String.valueOf(Venta.get(i).getCantidad()));
            }

            String nombreCliente = TXTnombrePersona.getText();

            if (nombreCliente.matches("^(?:\\p{L}\\p{M}*|[\\- ])*$") == false || nombreCliente.isEmpty()) {
                mensajeError = "Introduzca un nombre de cliente valido";
                throw new IllegalArgumentException();
            }

            if (listaVentas.isEmpty() == true) {
                mensajeError = "La lista de ventas esta vacia, por favor agregue productos";
                throw new IllegalArgumentException();
            }

            controlador.Principal.contadorVentas++;

            Venta unaVenta = new Venta(listaVentas, Total, TotalImporte, controlador.Principal.contadorVentas, listaCantidad, nombreCliente);

            Ventas.add(unaVenta);
            Venta.clear();
            this.dispose();
            new FRMInicio().setVisible(true);
        } catch (IllegalArgumentException e1) {
            JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_BTNCrearVentaActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.dispose();
        new FRMInicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefinirTotal();
        llenarCombo();

    }//GEN-LAST:event_formWindowOpened

    private void ComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProductoActionPerformed
        // TODO add your handling code here:
        CalcularPrecio();
    }//GEN-LAST:event_ComboBoxProductoActionPerformed

    private void SpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerCantidadStateChanged
        try {
            CalcularPrecio();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el producto", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SpinnerCantidadStateChanged

    private void BTNAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAñadirActionPerformed
        // TODO add your handling code here:

        try {
            String unNombre = Inventario.get(ComboBoxProducto.getSelectedIndex()).getNombre();
            int unaCantidad = Integer.parseInt(SpinnerCantidad.getValue().toString());
            double unPrecioProducto = Inventario.get(ComboBoxProducto.getSelectedIndex()).getPrecio();
            double unPrecioCalculado = unPrecioProducto * unaCantidad;
            double unPrecioVentaCalculado = unPrecioCalculado * 1.5;

            ProductoVenta unProductoVenta = new ProductoVenta(unaCantidad, unNombre, unPrecioProducto, unPrecioVentaCalculado);
            Venta.add(unProductoVenta);
            DefinirTotal();

            modeloTablaVenta.Inicializar(TablaVenta);
        } catch (IndexOutOfBoundsException e1) {
            JOptionPane.showMessageDialog(null, "No se encontro el producto, añade un producto desde el inventario", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_BTNAñadirActionPerformed

    private void BTNResetarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNResetarTablaActionPerformed
        // TODO add your handling code here:
        Venta.clear();
        modeloTablaVenta.Inicializar(TablaVenta);

    }//GEN-LAST:event_BTNResetarTablaActionPerformed

    private void TXTnombrePersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnombrePersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnombrePersonaActionPerformed

    private void BTNAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAñadirMouseClicked

    }//GEN-LAST:event_BTNAñadirMouseClicked

    private void BtnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnImprimirMouseClicked
        try {
            String nombreCliente = TXTnombrePersona.getText();
            String numeroTotal = LBNumeroTotal.getText();

            if (nombreCliente.matches("^(?:\\p{L}\\p{M}*|[\\- ])*$") == false || nombreCliente.isEmpty()) {
                mensajeError = "Introduzca un nombre de cliente valido";
                throw new IllegalArgumentException();
            }

            if (TablaVenta.getRowCount() == 0) {
                mensajeError = "La lista de ventas esta vacia, por favor agregue productos";
                throw new IllegalArgumentException();
            }

            MessageFormat header = new MessageFormat("Nombre del Cliente: " + nombreCliente);
            MessageFormat footer = new MessageFormat("Este es el total de su compra: $" + numeroTotal);

            TablaVenta.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e1) {
            JOptionPane.showMessageDialog(null, "No se pudo imprimir la venta", "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e2) {
            JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_BtnImprimirMouseClicked

    private void DescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescuentoActionPerformed

    public void DefinirTotal() {
        double Total = 0;
        for (int i = 0; i < Venta.size(); i++) {
            Total += Venta.get(i).getImporte();
        }
        LBNumeroTotal.setText("" + Total);
    }

    public void llenarCombo() {
        for (ProductoInventario Inventario : Inventario) {
            ComboBoxProducto.addItem(Inventario.getNombre());
        }

    }

    private void CalcularPrecio() {
        double PrecioProducto = Inventario.get(ComboBoxProducto.getSelectedIndex()).getPrecio();
        double CantidadProducto = Double.parseDouble(SpinnerCantidad.getValue().toString());
        double PrecioCalculado = PrecioProducto * CantidadProducto;
        double PrecioVentaCalculado = PrecioCalculado * 1.5;
        LBNumeroPrecio.setText("$" + PrecioProducto);
        LBNumeroPrecioVenta.setText("$" + (PrecioProducto * 1.5));
        LBNumeroImporte.setText("$" + PrecioCalculado);
        LBNumeroImporteVenta.setText("$" + PrecioVentaCalculado);

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMCrearVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAñadir;
    private javax.swing.JButton BTNCrearVenta;
    private javax.swing.JButton BTNResetarTabla;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JComboBox<String> ComboBoxProducto;
    private javax.swing.JTextField Descuento;
    private javax.swing.JLabel LBCantidad;
    private javax.swing.JLabel LBImporte;
    private javax.swing.JLabel LBImporteVenta;
    private javax.swing.JLabel LBNumeroImporte;
    private javax.swing.JLabel LBNumeroImporteVenta;
    private javax.swing.JLabel LBNumeroPrecio;
    private javax.swing.JLabel LBNumeroPrecioVenta;
    private javax.swing.JLabel LBNumeroTotal;
    private javax.swing.JLabel LBPrecio;
    private javax.swing.JLabel LBPrecioVenta;
    private javax.swing.JLabel LBProducto;
    private javax.swing.JLabel LBTotal;
    private javax.swing.JLabel LBpersona;
    private javax.swing.JSpinner SpinnerCantidad;
    private javax.swing.JTextField TXTnombrePersona;
    private javax.swing.JTable TablaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
