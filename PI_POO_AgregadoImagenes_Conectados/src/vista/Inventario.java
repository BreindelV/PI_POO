
package vista;

import modelo.TablaInventario;
import vista.Inicio;

public class Inventario extends javax.swing.JFrame {
    public TablaInventario modelo = new TablaInventario();

    public Inventario() {
        initComponents();
        iniciarTabla();
        this.setLocationRelativeTo(null);
    }
    
    public void iniciarTabla(){
        modelo.inicializar(TablaInventario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MenuBarInventario = new javax.swing.JMenuBar();
        MenuProductos = new javax.swing.JMenu();
        MenuItemCrear = new javax.swing.JMenuItem();
        MenuItemEliminar = new javax.swing.JMenuItem();
        MenuInventario = new javax.swing.JMenu();
        MenuItemActualizar = new javax.swing.JMenuItem();
        MenuItemActualizarVentana = new javax.swing.JMenuItem();
        BotonRegresar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(TablaInventario);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        MenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.png"))); // NOI18N
        MenuProductos.setText("Productos");

        MenuItemCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearProducto.png"))); // NOI18N
        MenuItemCrear.setText("Crear nuevo producto");
        MenuItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCrearActionPerformed(evt);
            }
        });
        MenuProductos.add(MenuItemCrear);

        MenuItemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basurero.png"))); // NOI18N
        MenuItemEliminar.setText("Eliminar producto");
        MenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEliminarActionPerformed(evt);
            }
        });
        MenuProductos.add(MenuItemEliminar);

        MenuBarInventario.add(MenuProductos);

        MenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        MenuInventario.setText("Inventario");
        MenuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInventarioActionPerformed(evt);
            }
        });

        MenuItemActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recargar.png"))); // NOI18N
        MenuItemActualizar.setText("Actualizar cantidad de producto");
        MenuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemActualizarActionPerformed(evt);
            }
        });
        MenuInventario.add(MenuItemActualizar);

        MenuItemActualizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recargar.png"))); // NOI18N
        MenuItemActualizarVentana.setText("Actualizar ventana");
        MenuItemActualizarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemActualizarVentanaActionPerformed(evt);
            }
        });
        MenuInventario.add(MenuItemActualizarVentana);

        MenuBarInventario.add(MenuInventario);

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        BotonRegresar.setText("Regresar");
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
        MenuBarInventario.add(BotonRegresar);

        setJMenuBar(MenuBarInventario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemActualizarActionPerformed
        this.dispose();:
        new ActualizarCantidad().setVisible(true);
    }//GEN-LAST:event_MenuItemActualizarActionPerformed

    private void MenuItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCrearActionPerformed
        this.dispose();
        new CrearProducto().setVisible(true);
    }//GEN-LAST:event_MenuItemCrearActionPerformed

    private void MenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEliminarActionPerformed
        this.dispose();
        new EliminarProducto().setVisible(true);
    }//GEN-LAST:event_MenuItemEliminarActionPerformed

    private void MenuItemActualizarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemActualizarVentanaActionPerformed
         this.dispose();
        Inventario nuevaVentana = new Inventario();
        nuevaVentana.setSize(800, 600);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_MenuItemActualizarVentanaActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void MenuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuInventarioActionPerformed

    private void BotonRegresarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_BotonRegresarMenuSelected
        this.dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarMenuSelected

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BotonRegresar;
    private javax.swing.JMenuBar MenuBarInventario;
    private javax.swing.JMenu MenuInventario;
    private javax.swing.JMenuItem MenuItemActualizar;
    private javax.swing.JMenuItem MenuItemActualizarVentana;
    private javax.swing.JMenuItem MenuItemCrear;
    private javax.swing.JMenuItem MenuItemEliminar;
    private javax.swing.JMenu MenuProductos;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
