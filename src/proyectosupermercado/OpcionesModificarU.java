package proyectosupermercado;

import javax.swing.JOptionPane;

public class OpcionesModificarU extends javax.swing.JFrame
{
    BaseDeProductos productos = new BaseDeProductos();
    BaseDeUsuarios usuarios = new BaseDeUsuarios();
    private String correoU;
    
    public OpcionesModificarU(BaseDeUsuarios u, BaseDeProductos p, String c)
    {
        initComponents();
        setLocationRelativeTo(null);
        usuarios = u;
        productos = p;
        this.correoU = c;
    }
    
    public void Limpiar()
    {
        this.contrasena.setText("");
        this.correo.setText("");
        this.nombre.setText("");
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        label1 = new java.awt.Label();
        modificarNombre = new javax.swing.JButton();
        modificarCorreo = new javax.swing.JButton();
        modificarContra = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        contrasena = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Opciones");

        modificarNombre.setText("Modificar");
        modificarNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modificarNombreActionPerformed(evt);
            }
        });

        modificarCorreo.setText("Modificar");
        modificarCorreo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modificarCorreoActionPerformed(evt);
            }
        });

        modificarContra.setText("Modificar");
        modificarContra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modificarContraActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                salirActionPerformed(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nombreActionPerformed(evt);
            }
        });

        contrasena.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                contrasenaActionPerformed(evt);
            }
        });

        label2.setText("Modificar Nombre");

        label3.setText("Modificar Correo");

        label4.setText("Modificar Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(modificarNombre)
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(modificarContra)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarNombre)
                            .addComponent(modificarCorreo)
                            .addComponent(modificarContra)))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(salir)
                .addGap(40, 40, 40))
        );

        pack();
    }

    private void nombreActionPerformed(java.awt.event.ActionEvent evt)
    {
        
    }
    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt)
    {
        
    }
    private void salirActionPerformed(java.awt.event.ActionEvent evt)
    {
        ModificarUsuario modUsuario = new ModificarUsuario(usuarios,productos);
        modUsuario.setVisible(true);
        dispose();
    }
    private void modificarNombreActionPerformed(java.awt.event.ActionEvent evt)
    {
        usuarios.ModificarNombre(nombre.getText(), correoU);
        JOptionPane.showMessageDialog(null, "Nombre modificado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }

    private void modificarCorreoActionPerformed(java.awt.event.ActionEvent evt)
    {
        usuarios.ModificarCorreo(correo.getText(), correoU);
        this.correoU = correo.getText();
        JOptionPane.showMessageDialog(null, "Correo modificado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }

    private void modificarContraActionPerformed(java.awt.event.ActionEvent evt)
    {
        usuarios.ModificarContrasena(contrasena.getText(), correoU);
        JOptionPane.showMessageDialog(null, "Contraseña modificada con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }

    private javax.swing.JTextField contrasena;
    private javax.swing.JTextField correo;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JButton modificarContra;
    private javax.swing.JButton modificarCorreo;
    private javax.swing.JButton modificarNombre;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
}
