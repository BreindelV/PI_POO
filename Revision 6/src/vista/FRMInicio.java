package vista;

import java.awt.Color;
import javax.swing.ImageIcon;

public class FRMInicio extends javax.swing.JFrame {

    public FRMInicio() {
        initComponents();
        setTitle("Inicio");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/medicine.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNVentas = new javax.swing.JButton();
        BTNInventario = new javax.swing.JButton();
        BTNCrearVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        BTNVentas.setText("Ventas");
        BTNVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVentasActionPerformed(evt);
            }
        });

        BTNInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        BTNInventario.setText("Inventario");
        BTNInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInventarioActionPerformed(evt);
            }
        });

        BTNCrearVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearVenta.png"))); // NOI18N
        BTNCrearVenta.setText("Crear venta");
        BTNCrearVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCrearVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNCrearVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BTNVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNInventario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCrearVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNInventario))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCrearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearVentaActionPerformed
        this.dispose();
        new FRMCrearVenta().setVisible(true);
    }//GEN-LAST:event_BTNCrearVentaActionPerformed

    private void BTNVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVentasActionPerformed
        this.dispose();
        new FRMVentas().setVisible(true);
    }//GEN-LAST:event_BTNVentasActionPerformed

    private void BTNInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInventarioActionPerformed
        this.dispose();
        new FRMInventario().setVisible(true);
    }//GEN-LAST:event_BTNInventarioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCrearVenta;
    private javax.swing.JButton BTNInventario;
    private javax.swing.JButton BTNVentas;
    // End of variables declaration//GEN-END:variables
}
