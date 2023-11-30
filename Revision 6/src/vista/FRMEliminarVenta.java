package vista;

import static controlador.Principal.Venta;
import static controlador.Principal.Ventas;
import modelo.TablaInventario;
import modelo.Venta;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FRMEliminarVenta extends javax.swing.JFrame {

    public FRMEliminarVenta() {
        initComponents();
        setTitle("Eliminar Venta");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/medicine.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxVenta = new javax.swing.JComboBox<>();
        LBVenta = new javax.swing.JLabel();
        LBTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVenta = new javax.swing.JTable();
        BTNEliminar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ComboBoxVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxVentaActionPerformed(evt);
            }
        });

        LBVenta.setText("Venta:");

        LBTotal.setText("Total:");

        TablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Precio de venta"
            }
        ));
        jScrollPane1.setViewportView(TablaVenta);
        if (TablaVenta.getColumnModel().getColumnCount() > 0) {
            TablaVenta.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            TablaVenta.getColumnModel().getColumn(1).setHeaderValue("Cantidad");
            TablaVenta.getColumnModel().getColumn(2).setHeaderValue("Precio");
            TablaVenta.getColumnModel().getColumn(3).setHeaderValue("Precio de venta");
        }

        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basurero.png"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBTotal))
                            .addComponent(LBVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonRegresar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBVenta)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBTotal)
                    .addComponent(BTNEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        Ventas.remove(ComboBoxVenta.getSelectedIndex());

        this.dispose();
        new FRMVentas().setVisible(true);
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.dispose();
        new FRMVentas().setVisible(true);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        IniciarCombo();
    }//GEN-LAST:event_formWindowOpened

    private void ComboBoxVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxVentaActionPerformed

    public void IniciarCombo() {
        for (Venta Ventas : Ventas) {
            ComboBoxVenta.addItem(String.valueOf(Ventas.getIdentificador()));
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMEliminarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> ComboBoxVenta;
    private javax.swing.JLabel LBTotal;
    private javax.swing.JLabel LBVenta;
    private javax.swing.JTable TablaVenta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
