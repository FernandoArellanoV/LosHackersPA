package proyectosupermercado;

import javax.swing.JOptionPane;

public class ModificarProducto extends javax.swing.JFrame
{

    BaseDeProductos productos = new BaseDeProductos();
    BaseDeUsuarios usuarios = new BaseDeUsuarios();
    
    public ModificarProducto(BaseDeUsuarios u, BaseDeProductos p)
    {
        initComponents();
        setLocationRelativeTo(null);
        usuarios = u;
        productos = p;
        TablaProductos();
    }

    public void Limpiar()
    {
        this.codigoP.setText("");
    }

    public void TablaProductos()
    {
        String[][] mProductos = new String[productos.getListaDeProductos().size()][4];

        for (int i = 0 ; i < productos.getListaDeProductos().size() ; i++) {            
            mProductos[i][0] = productos.getListaDeProductos().get(i).getNombre();
            mProductos[i][1] = Integer.toString(productos.getListaDeProductos().get(i).getCodigo());
            mProductos[i][2] = Integer.toString(productos.getListaDeProductos().get(i).getStock());
            mProductos[i][3] = Integer.toString(productos.getListaDeProductos().get(i).getPrecio());
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(mProductos,new String [] {"Nombre", "Codigo", "Stock", "Precio"}));
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        label1 = new java.awt.Label();
        modificar = new javax.swing.JButton();
        codigoP = new javax.swing.JTextField();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                salirActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Modificar Producto");

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modificarActionPerformed(evt);
            }
        });

        codigoP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                codigoPActionPerformed(evt);
            }
        });

        label2.setText("Ingrese el codigo del producto a modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoP)
                            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(codigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(modificar)
                        .addGap(112, 112, 112)))
                .addComponent(salir)
                .addGap(40, 40, 40))
        );

        pack();
    }

    private void codigoPActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt)
    {
        MenuAdmin menuA = new MenuAdmin(usuarios, productos);
        menuA.setVisible(true);
        dispose();
    }

    private void modificarActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(productos.BuscarProducto(Integer.parseInt(codigoP.getText()))==null)
        {
            JOptionPane.showMessageDialog(null, "No existe el producto","ERROR",JOptionPane.INFORMATION_MESSAGE);
            Limpiar();
        }else
        {
            OpcionesModificarP modProducto = new OpcionesModificarP(usuarios, productos, Integer.parseInt(codigoP.getText()));
            modProducto.setVisible(true);
            dispose();
        }
    }

    private javax.swing.JTextField codigoP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton salir;
}
