package proyectosupermercadoGUI;

import javax.swing.JOptionPane;
import proyectosupermercado.*;


public class proyectoGui extends javax.swing.JFrame implements LimpiarGUI
{
    BaseDeUsuarios usuarios = new BaseDeUsuarios();
    BaseDeProductos productos = new BaseDeProductos();
    public proyectoGui(BaseDeUsuarios u, BaseDeProductos p)
    {
        initComponents();
        usuarios = u;
        productos = p;
    }
    
    public void Limpiar()
    {
        this.correoLogin.setText("");
        this.correoRegistro.setText("");
        this.claveLogin.setText("");
        this.contraseñaRegistro.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        correoLogin = new javax.swing.JTextField();
        correoRegistro = new javax.swing.JTextField();
        nombreRegistro = new javax.swing.JTextField();
        claveLogin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contraseñaRegistro = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Supermercado Andre S.A");
        jLabel1.setToolTipText("");

        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        correoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoLoginActionPerformed(evt);
            }
        });

        correoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoRegistroActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Correo:");

        jLabel4.setText("Contraseña:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(claveLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correoLogin))
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(contraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(claveLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_jButton1ActionPerformed
        char contraArray[] = claveLogin.getPassword();
        String contrasena = new String(contraArray);
        if (usuarios.confirmarUsuario(correoLogin.getText() ,contrasena)== 2) 
        {
           JOptionPane.showMessageDialog(null, "El correo o contraseña que usted ha ingresado no existe","ERROR",JOptionPane.INFORMATION_MESSAGE);
           Limpiar();
        }
        else
        {
            if (usuarios.confirmarUsuario(correoLogin.getText() ,contrasena)== 1) 
            {
                MenuAdmin menuA = new MenuAdmin(usuarios, productos);
                menuA.setLocationRelativeTo(null);
                menuA.setVisible(true);
                dispose();
            }
            else
            {
                MenuUsuario menuU = new MenuUsuario(usuarios, productos);
                menuU.setLocationRelativeTo(null);
                menuU.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_jButton2ActionPerformed
        char contraArray[] = contraseñaRegistro.getPassword();
        String[] datosUsuario = new String[4];
        datosUsuario[0] = nombreRegistro.getText();
        datosUsuario[1] = new String (contraArray);
        datosUsuario[2] = correoRegistro.getText();
        datosUsuario[3] = "0";
        try
        {
            if (correoRegistro.getText().contains("@") == false) 
            {
                JOptionPane.showMessageDialog(null, "formato incorrecto en el correo electronico","ERROR",JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                if (datosUsuario[0].equals("")  || datosUsuario[1].equals("") || datosUsuario[2].equals("")) 
                {
                    JOptionPane.showMessageDialog(null, "Debe llenar todas las casillas","ERROR",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    usuarios.CrearUsuario(datosUsuario);
                    JOptionPane.showMessageDialog(null, "Se ha creado el usuario con exito, inicie sesión","Registro",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_jButton3ActionPerformed
        productos.EliminarProducto(4324);
        usuarios.EliminarUsuario("fvt@gmail.com");
        ExportarTxt.ExportarUsuario(usuarios);
        ExportarTxt.ExportarProducto(productos);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void correoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoRegistroActionPerformed

    private void correoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField claveLogin;
    private javax.swing.JPasswordField contraseñaRegistro;
    private javax.swing.JTextField correoLogin;
    private javax.swing.JTextField correoRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreRegistro;
    // End of variables declaration//GEN-END:variables
}
