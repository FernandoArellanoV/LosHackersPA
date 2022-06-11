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
public class MenuUsuario extends javax.swing.JFrame
{
    BaseDeProductos productos = new BaseDeProductos();
    BaseDeUsuarios usuarios = new BaseDeUsuarios();
    
    public MenuUsuario(BaseDeUsuarios u, BaseDeProductos p)
    {
        initComponents();
        usuarios = u;
        productos = p;
    }

    public void Limpiar()
    {
        this.nombreP.setText("");
        this.codigoP.setText("");
        this.maximo.setText("");
        this.minimo.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        mostrarProductos = new javax.swing.JButton();
        buscarNombre = new javax.swing.JButton();
        buscarCodigo = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        masBarato = new javax.swing.JButton();
        buscarRango = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        nombreP = new javax.swing.JTextField();
        codigoP = new javax.swing.JTextField();
        minimo = new javax.swing.JTextField();
        maximo = new javax.swing.JTextField();
        asadasd = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();

        jScrollPane1.setViewportView(jTextPane1);

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        jLabel1.setInheritsPopupMenu(false);

        mostrarProductos.setText("Productos");
        mostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarProductosActionPerformed(evt);
            }
        });

        buscarNombre.setText("Buscar");
        buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreActionPerformed(evt);
            }
        });

        buscarCodigo.setText("Buscar");
        buscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCodigoActionPerformed(evt);
            }
        });

        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        masBarato.setText("Producto mas barato");
        masBarato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBaratoActionPerformed(evt);
            }
        });

        buscarRango.setText("Buscar");
        buscarRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRangoActionPerformed(evt);
            }
        });

        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        nombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePActionPerformed(evt);
            }
        });

        minimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimoActionPerformed(evt);
            }
        });

        asadasd.setText("Ingrese nombre del producto");

        label2.setText("Ingrese codigo del producto");

        label3.setText("Ingrese limites de precios");

        label4.setText("Minimo");

        label5.setText("Maximo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(197, 197, 197)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(buscarNombre)))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(codigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(buscarCodigo))))
                                    .addComponent(asadasd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(buscarRango))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masBarato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mostrarProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarProductos)
                        .addGap(43, 43, 43)
                        .addComponent(comprar)
                        .addGap(40, 40, 40)
                        .addComponent(masBarato)
                        .addGap(39, 39, 39)
                        .addComponent(CerrarSesion)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asadasd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(buscarNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(buscarCodigo))
                            .addComponent(codigoP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buscarRango)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        proyectoGui login = new proyectoGui(usuarios,productos);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void mostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarProductosActionPerformed
        ListaProductos lista = new ListaProductos(productos);
        lista.setVisible(true);
    }//GEN-LAST:event_mostrarProductosActionPerformed

    private void minimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimoActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        CompraProductos comprarP = new CompraProductos(usuarios, productos);
        comprarP.setLocationRelativeTo(null);
        comprarP.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarActionPerformed

    private void nombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePActionPerformed

    private void buscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCodigoActionPerformed
        if(productos.BuscarProducto(Integer.parseInt(codigoP.getText()))==null)
        {
            JOptionPane.showMessageDialog(null, "No existe el producto buscado","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            ProductosPorCodigo buscaPCodigo = new ProductosPorCodigo(usuarios, productos,Integer.parseInt(codigoP.getText()) );
            buscaPCodigo.setVisible(true);
        }
        Limpiar();
    }//GEN-LAST:event_buscarCodigoActionPerformed

    private void buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreActionPerformed
        ProductosPorNombre buscaPNombre = new ProductosPorNombre(usuarios, productos, nombreP.getText());
        buscaPNombre.setVisible(true);
        Limpiar();
    }//GEN-LAST:event_buscarNombreActionPerformed

    private void masBaratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBaratoActionPerformed
        ProductoMenor menor = new ProductoMenor(usuarios, productos);
        menor.setVisible(true);
    }//GEN-LAST:event_masBaratoActionPerformed

    private void buscarRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRangoActionPerformed
        if(maximo.getText().equals("")==true || minimo.getText().equals("")==true)
        {
            JOptionPane.showMessageDialog(null, "Rellene ambas casillas","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            RangoPrecios rangos = new RangoPrecios(usuarios, productos, Integer.parseInt(maximo.getText()), Integer.parseInt(minimo.getText()));
            rangos.setVisible(true);
        }
        Limpiar();
    }//GEN-LAST:event_buscarRangoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private java.awt.Label asadasd;
    private javax.swing.JButton buscarCodigo;
    private javax.swing.JButton buscarNombre;
    private javax.swing.JButton buscarRango;
    private javax.swing.JTextField codigoP;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JButton masBarato;
    private javax.swing.JTextField maximo;
    private javax.swing.JTextField minimo;
    private javax.swing.JButton mostrarProductos;
    private javax.swing.JTextField nombreP;
    // End of variables declaration//GEN-END:variables
}
