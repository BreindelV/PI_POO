
package vista;

public class CrearVenta extends javax.swing.JFrame {

    public CrearVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LBProducto.setText("Producto");

        ComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LBCantidad.setText("Cantidad");

        LBPrecio.setText("Precio: ");

        LBPrecioVenta.setText("Precio de Venta: ");

        BTNAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignoMas.png"))); // NOI18N
        BTNAñadir.setText("Añadir");

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

        LBTotal.setText("Total: ");

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBPrecio)
                        .addGap(31, 31, 31)
                        .addComponent(LBPrecioVenta)
                        .addGap(39, 39, 39)
                        .addComponent(BTNAñadir)
                        .addGap(77, 77, 77)
                        .addComponent(BotonRegresar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNCrearVenta))
                            .addComponent(jScrollPane1))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBProducto)
                        .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBCantidad)
                        .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBPrecio)
                        .addComponent(LBPrecioVenta)
                        .addComponent(BTNAñadir)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCrearVenta)
                    .addComponent(LBTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCrearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearVentaActionPerformed
        // TODO add your handling code here:
        
        
        this.dispose();
    }//GEN-LAST:event_BTNCrearVentaActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAñadir;
    private javax.swing.JButton BTNCrearVenta;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> ComboBoxProducto;
    private javax.swing.JLabel LBCantidad;
    private javax.swing.JLabel LBPrecio;
    private javax.swing.JLabel LBPrecioVenta;
    private javax.swing.JLabel LBProducto;
    private javax.swing.JLabel LBTotal;
    private javax.swing.JSpinner SpinnerCantidad;
    private javax.swing.JTable TablaVenta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
