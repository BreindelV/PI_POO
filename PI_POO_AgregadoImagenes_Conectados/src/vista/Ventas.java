
package vista;

public class Ventas extends javax.swing.JFrame {

    public Ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        LBTotalEntradas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MenuBarVentas = new javax.swing.JMenuBar();
        MenuEditar = new javax.swing.JMenu();
        MenuItemEliminar = new javax.swing.JMenuItem();
        BotonRegresar = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venta", "Precio ", "Precio de Venta"
            }
        ));
        jScrollPane1.setViewportView(TablaVentas);

        LBTotalEntradas.setText("Total de entradas: ");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        MenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EditarC.png"))); // NOI18N
        MenuEditar.setText("Editar");

        MenuItemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basurero.png"))); // NOI18N
        MenuItemEliminar.setText("Eliminar una venta");
        MenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEliminarActionPerformed(evt);
            }
        });
        MenuEditar.add(MenuItemEliminar);

        MenuBarVentas.add(MenuEditar);

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.setAlignmentX(3.0F);
        BotonRegresar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BotonRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonRegresar.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                BotonRegresarMenuSelected(evt);
            }
        });
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        BotonRegresar.add(jSeparator1);

        MenuBarVentas.add(BotonRegresar);

        setJMenuBar(MenuBarVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBTotalEntradas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LBTotalEntradas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEliminarActionPerformed
        this.dispose();
        new EliminarVenta().setVisible(true);
    }//GEN-LAST:event_MenuItemEliminarActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
       this.dispose();
       new Inicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonRegresarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_BotonRegresarMenuSelected
        this.dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarMenuSelected

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BotonRegresar;
    private javax.swing.JLabel LBTotalEntradas;
    private javax.swing.JMenuBar MenuBarVentas;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenuItem MenuItemEliminar;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
