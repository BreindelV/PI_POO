package vista;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import modelo.TablaVentas;
import java.awt.Color;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FRMVentas extends javax.swing.JFrame {

    public TablaVentas ModeloVentas = new TablaVentas();

    public FRMVentas() {
        initComponents();
        IniciarTablaVentas();
        setTitle("Ventas");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/medicine.png")).getImage());

    }

    public void IniciarTablaVentas() {
        ModeloVentas.inicializarTV(TablaVentas);

        for (int i = 0; i < controlador.Principal.Ventas.size(); i++) {
            if (controlador.Principal.Ventas.isEmpty()) {
                break;
            }

            int altura = controlador.Principal.Ventas.get(i).getNombreVenta().size();

            if (altura > 1) {
                altura = altura * 15;
            } else {
                altura = 15;
            }
            TablaVentas.setRowHeight(i, altura);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        LBTotalEntradas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtnGenerarPDF = new javax.swing.JButton();
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

        BtnGenerarPDF.setText("Generar PDF");
        BtnGenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGenerarPDFMouseClicked(evt);
            }
        });
        BtnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarPDFActionPerformed(evt);
            }
        });

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
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBTotalEntradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBTotalEntradas)
                    .addComponent(BtnGenerarPDF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEliminarActionPerformed
        this.dispose();
        new FRMEliminarVenta().setVisible(true);
    }//GEN-LAST:event_MenuItemEliminarActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed

    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonRegresarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_BotonRegresarMenuSelected

    }//GEN-LAST:event_BotonRegresarMenuSelected

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        this.dispose();
        new FRMInicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BtnGenerarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGenerarPDFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGenerarPDFMouseClicked

    private void BtnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarPDFActionPerformed
        generarPDF();
    }//GEN-LAST:event_BtnGenerarPDFActionPerformed

    private void generarPDF() {
    String nombreArchivo = JOptionPane.showInputDialog(null, "Ingrese el nombre del archivo PDF:");

    if (nombreArchivo == null || nombreArchivo.trim().isEmpty()) {
        return;
    }
    if (!nombreArchivo.toLowerCase().endsWith(".pdf")) {
        nombreArchivo += ".pdf";
    }

    Document documento = new Document(PageSize.A4);

    try {
        PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
        documento.open();
        
        double totalVentas = calcularTotalVentas();
        
        documento.add(new Paragraph("Reporte de Ventas"));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("Suma de Ventas Totales: " + DecimalFormat.getCurrencyInstance().format(totalVentas)));
        documento.add(new Paragraph(" "));
        PdfPTable tabla = new PdfPTable(TablaVentas.getColumnCount());

        for (int i = 0; i < TablaVentas.getColumnCount(); i++) {
            PdfPCell celda = new PdfPCell(new Phrase(TablaVentas.getColumnName(i)));
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
            celda.setBackgroundColor(new java.awt.Color(192, 192, 192)); // Color de fondo
            celda.setPadding(8); // Espaciado
            celda.setExtraParagraphSpace(2); // Espaciado adicional
            celda.setPhrase(new Phrase(TablaVentas.getColumnName(i), new com.lowagie.text.Font(com.lowagie.text.Font.HELVETICA, 10, com.lowagie.text.Font.BOLD)));
            tabla.addCell(celda);
        }

        for (int i = 0; i < TablaVentas.getRowCount(); i++) {
            for (int j = 0; j < TablaVentas.getColumnCount(); j++) {
                Object valorCelda = TablaVentas.getValueAt(i, j);
                if (j == 2) {
                    String productosHTML = valorCelda == null ? "" : valorCelda.toString();
                    String productosSinHTML = productosHTML.replaceAll("<[^>]*>", "");
                    tabla.addCell(new Phrase(productosSinHTML));
                } else {
                    tabla.addCell(new Phrase(valorCelda == null ? "" : valorCelda.toString()));
                }
            }
        }

        documento.add(tabla);
        JOptionPane.showMessageDialog(null, "Archivo PDF generado exitosamente como " + nombreArchivo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al generar el archivo PDF: " + e.getMessage());
    } finally {
        documento.close();
    }
}

    private double calcularTotalVentas() {
        double totalVentas = 0.0;

        for (int i = 0; i < TablaVentas.getRowCount(); i++) {
            Object valorCelda = TablaVentas.getValueAt(i, TablaVentas.getColumn("Precio de Venta").getModelIndex());

            if (valorCelda instanceof Double) {
                totalVentas += (Double) valorCelda;
            } else if (valorCelda instanceof String) {
                try {
                    totalVentas += Double.parseDouble((String) valorCelda);
                } catch (NumberFormatException e) {
                }
            }
        }

        return totalVentas;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BotonRegresar;
    private javax.swing.JButton BtnGenerarPDF;
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
