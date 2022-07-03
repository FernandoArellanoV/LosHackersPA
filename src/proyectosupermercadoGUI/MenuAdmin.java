/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercadoGUI;

import javax.swing.JOptionPane;
import proyectosupermercado.*;

/**
 *
 * @author PerezPSN
 */
public class MenuAdmin extends javax.swing.JFrame implements LimpiarGUI{

    BaseDeProductos productos = new BaseDeProductos();
    BaseDeUsuarios usuarios = new BaseDeUsuarios();
    
    public MenuAdmin(BaseDeUsuarios u, BaseDeProductos p){
        initComponents();
        setLocationRelativeTo(null);
        usuarios = u;
        productos = p;
    }

    public void Limpiar()
    {
        this.nombreP.setText("");
        this.codigoP.setText("");
        this.correoUsuario.setText("");
        this.correoEliminar.setText("");
        this.codigoEliminar.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        eliminarUsuario = new javax.swing.JButton();
        correoEliminar = new javax.swing.JTextField();
        eliminarProducto = new javax.swing.JButton();
        codigoEliminar = new javax.swing.JTextField();
        modificarU = new javax.swing.JButton();
        modificarP = new javax.swing.JButton();
        buscarPNombre = new javax.swing.JButton();
        buscarPCodigo = new javax.swing.JButton();
        nombreP = new javax.swing.JTextField();
        codigoP = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        buscarUsuario = new javax.swing.JButton();
        correoUsuario = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        mostrarU = new javax.swing.JButton();
        mostrarP = new javax.swing.JButton();
        agregarP = new javax.swing.JButton();
        label6 = new java.awt.Label();
        Reporte = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salir.setText("Cerrar Sesión");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        eliminarUsuario.setText("Eliminar Usuario");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });

        correoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoEliminarActionPerformed(evt);
            }
        });

        eliminarProducto.setText("Eliminar Producto");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        modificarU.setText("Modificar Usuario");
        modificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUActionPerformed(evt);
            }
        });

        modificarP.setText("Modificar Producto");
        modificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPActionPerformed(evt);
            }
        });

        buscarPNombre.setText("Buscar");
        buscarPNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPNombreActionPerformed(evt);
            }
        });

        buscarPCodigo.setText("Buscar");
        buscarPCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPCodigoActionPerformed(evt);
            }
        });

        label1.setText("Ingrese nombre del producto");

        label2.setText("Ingrese el codigo del producto");

        label3.setText("Ingrese el codigo de producto");

        label4.setText("Ingrese el correo de usuario");

        buscarUsuario.setText("Buscar");
        buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioActionPerformed(evt);
            }
        });

        label5.setText("Ingrese el correo de usuario");

        mostrarU.setText("Usuarios");
        mostrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarUActionPerformed(evt);
            }
        });

        mostrarP.setText("Productos");
        mostrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPActionPerformed(evt);
            }
        });

        agregarP.setText("Agregar Producto");
        agregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        label6.setText("Bienvenido Administrador");

        Reporte.setText("Reporte");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarPCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(correoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(Reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mostrarP, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(buscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(correoUsuario)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(mostrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(agregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(modificarU, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(codigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarU)
                    .addComponent(mostrarP)
                    .addComponent(agregarP))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPNombre)
                    .addComponent(buscarPCodigo)
                    .addComponent(buscarUsuario))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarP))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modificarU)
                                .addComponent(eliminarProducto))
                            .addComponent(eliminarUsuario)))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(Reporte))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        if(usuarios.ExisteCorreo(correoEliminar.getText())==true)
        {
            usuarios.EliminarUsuario(correoEliminar.getText());
            JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(null, "No existe el usuario buscado","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
        Limpiar();
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void correoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoEliminarActionPerformed

    private void buscarPCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPCodigoActionPerformed
        if(codigoP.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Rellene el espacio","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            if (productos.BuscarProducto(Integer.parseInt(codigoP.getText()))==null)
            {
                JOptionPane.showMessageDialog(null, "No existe el producto buscado","ERROR",JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                ProductosPorCodigo buscaPCodigo = new ProductosPorCodigo(usuarios, productos,Integer.parseInt(codigoP.getText()) );
                buscaPCodigo.setVisible(true);
            }
            
        }
        Limpiar();
    }//GEN-LAST:event_buscarPCodigoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        proyectoGui login = new proyectoGui(usuarios,productos);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void buscarPNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPNombreActionPerformed
        if(nombreP.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Rellene el espacio","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            ProductosPorNombre buscaPNombre = new ProductosPorNombre(usuarios, productos, nombreP.getText());
            buscaPNombre.setVisible(true);
        }
        Limpiar();
    }//GEN-LAST:event_buscarPNombreActionPerformed

    private void mostrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPActionPerformed
        ListaProductos listaP = new ListaProductos(productos);
        listaP.setVisible(true);
    }//GEN-LAST:event_mostrarPActionPerformed

    private void mostrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarUActionPerformed
        ListaUsuarios listaU = new ListaUsuarios(usuarios);
        listaU.setVisible(true);
    }//GEN-LAST:event_mostrarUActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        if(codigoEliminar.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Rellene el espacio","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            if (productos.BuscarProducto(Integer.parseInt(codigoEliminar.getText()))==null) 
            {
                JOptionPane.showMessageDialog(null, "No existe el producto a eliminar","ERROR",JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                productos.EliminarProducto(Integer.parseInt(codigoEliminar.getText()));
                JOptionPane.showMessageDialog(null, "El producto se elimino con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        Limpiar();
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void agregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPActionPerformed
        AgregarProducto agregar = new AgregarProducto(productos);
        agregar.setVisible(true);
    }//GEN-LAST:event_agregarPActionPerformed

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
        if(usuarios.ExisteCorreo(correoUsuario.getText())==false)
        {
            JOptionPane.showMessageDialog(null, "El usuario no existe","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }else{
            UsuarioPorCorreo buscarPCorreo = new UsuarioPorCorreo(usuarios, correoUsuario.getText());
            buscarPCorreo.setVisible(true);
        }
        Limpiar();
    }//GEN-LAST:event_buscarUsuarioActionPerformed

    private void modificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUActionPerformed
        ModificarUsuario modUsuario = new ModificarUsuario(usuarios, productos);
        modUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_modificarUActionPerformed

    private void modificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPActionPerformed
        ModificarProducto modProducto = new ModificarProducto(usuarios, productos);
        modProducto.setVisible(true);
        dispose();
    }//GEN-LAST:event_modificarPActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        ExportarTxt.ExportarReporte(usuarios, productos);
        JOptionPane.showMessageDialog(null, "Se genero un reporte de los usuarios y productos","Reporte generado",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ReporteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reporte;
    private javax.swing.JButton agregarP;
    private javax.swing.JButton buscarPCodigo;
    private javax.swing.JButton buscarPNombre;
    private javax.swing.JButton buscarUsuario;
    private javax.swing.JTextField codigoEliminar;
    private javax.swing.JTextField codigoP;
    private javax.swing.JTextField correoEliminar;
    private javax.swing.JTextField correoUsuario;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JButton jButton1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JButton modificarP;
    private javax.swing.JButton modificarU;
    private javax.swing.JButton mostrarP;
    private javax.swing.JButton mostrarU;
    private javax.swing.JTextField nombreP;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
