/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

import javax.swing.JOptionPane;

/**
 *
 * @author PerezPSN
 */
public class OpcionesModificarP extends javax.swing.JFrame {

    BaseDeProductos productos = new BaseDeProductos();
    BaseDeUsuarios usuarios = new BaseDeUsuarios();
    private int codigoP;
    
    public OpcionesModificarP(BaseDeUsuarios u, BaseDeProductos p, int c) {
        initComponents();
        setLocationRelativeTo(null);
        usuarios = u;
        productos = p;
        this.codigoP = c;
    }
    
    public void Limpiar()
    {
        this.codigo.setText("");
        this.nombre.setText("");
        this.precio.setText("");
        this.stock.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        label1 = new java.awt.Label();
        salir = new javax.swing.JButton();
        modNombre = new javax.swing.JButton();
        modCodigo = new javax.swing.JButton();
        modStock = new javax.swing.JButton();
        modPrecio = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Opciones");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        modNombre.setText("Modificar");
        modNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modNombreActionPerformed(evt);
            }
        });

        modCodigo.setText("Modificar");
        modCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCodigoActionPerformed(evt);
            }
        });

        modStock.setText("Modificar");
        modStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modStockActionPerformed(evt);
            }
        });

        modPrecio.setText("Modificar");
        modPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPrecioActionPerformed(evt);
            }
        });

        label2.setText("Inserte nuevo nombre");

        label3.setText("Inserte nuevo codigo");

        label4.setText("Inserte nuevo stock");

        label5.setText("Inserte nuevo precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(modNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(modCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modStock)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(modPrecio)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modNombre)
                            .addComponent(modCodigo)
                            .addComponent(modStock)
                            .addComponent(modPrecio)))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(salir)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        ModificarProducto modProducto = new ModificarProducto(usuarios, productos);
        modProducto.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void modNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modNombreActionPerformed
        productos.ModificarNombre(nombre.getText(), codigoP);
        JOptionPane.showMessageDialog(null, "Se a modificado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_modNombreActionPerformed

    private void modCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCodigoActionPerformed
        productos.ModificarCodigo(Integer.parseInt(codigo.getText()), codigoP);
        this.codigoP = Integer.parseInt(codigo.getText());
        JOptionPane.showMessageDialog(null, "Se a modificado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_modCodigoActionPerformed

    private void modStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modStockActionPerformed
        productos.ModificarStock(Integer.parseInt(stock.getText()), codigoP);
        JOptionPane.showMessageDialog(null, "Se a modificado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_modStockActionPerformed

    private void modPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPrecioActionPerformed
        productos.ModificarPrecio(Integer.parseInt(precio.getText()), codigoP);
        JOptionPane.showMessageDialog(null, "Se a modificado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_modPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JButton modCodigo;
    private javax.swing.JButton modNombre;
    private javax.swing.JButton modPrecio;
    private javax.swing.JButton modStock;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JButton salir;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
