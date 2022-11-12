
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.entidad.Inventario;
import modelo.dao.InventarioDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import util.ConexionBD;

public class FrmProductos extends javax.swing.JFrame {
    ResultSet rs;
    String nom, descripcion, categoria, tienda;
    int codigo,stock;
    InventarioDAO daoi;
    Connection cn;
    PreparedStatement ps;
    
    public FrmProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public FrmProductos(ResultSet rs) throws SQLException{
        initComponents();
        this.setTitle("Inventario de Productos");
        daoi= new InventarioDAO();
        iniciotxt.setText("Bienvenido "+rs.getString("usuario"));
        this.rs=rs;
        this.setLocationRelativeTo(null);
        btnPerfil.setToolTipText("Ver Mi Perfil");
        btnRegistrar.setToolTipText("Registrar producto");
        btnModificar.setToolTipText("Modificar datos del producto");
        btnBuscar.setToolTipText("Buscar producto");
        btnListar.setToolTipText("Listar todos los productos");
        btnEliminar.setToolTipText("Eliminar producto");
        
        for (int i = 0; i < 5; i++) {
            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
            cellRenderer.setHorizontalAlignment(JLabel.CENTER);
            tbSalida.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        iniciotxt = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSalida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtst = new javax.swing.JTextField();
        txtTien = new javax.swing.JTextField();
        jlabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnomi = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtcate = new javax.swing.JTextField();
        jCbx_Categoria = new javax.swing.JComboBox<>();
        btnListar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtcate1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MyStock+");

        btnPerfil.setBackground(new java.awt.Color(0, 102, 0));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_MiPerfil.png"))); // NOI18N
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 682, Short.MAX_VALUE)
                .addComponent(btnPerfil)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        iniciotxt.setFont(new java.awt.Font(".SF NS Text", 3, 18)); // NOI18N
        iniciotxt.setForeground(new java.awt.Color(204, 0, 255));
        iniciotxt.setText("jLabel1");
        jPanel1.add(iniciotxt);
        iniciotxt.setBounds(30, 30, 287, 33);

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_registrar.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(710, 70, 66, 66);

        tbSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Categoría", "Tienda", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSalida);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 290, 880, 180);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Tienda:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 200, 70, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Stock:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 240, 56, 22);
        jPanel1.add(txtst);
        txtst.setBounds(220, 240, 120, 30);

        txtTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienActionPerformed(evt);
            }
        });
        jPanel1.add(txtTien);
        txtTien.setBounds(220, 200, 180, 30);

        jlabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(204, 255, 255));
        jlabel3.setText("Nombre:");
        jPanel1.add(jlabel3);
        jlabel3.setBounds(130, 80, 77, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 120, 111, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Categoría:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 160, 91, 22);
        jPanel1.add(txtnomi);
        txtnomi.setBounds(220, 80, 190, 30);
        jPanel1.add(txtdesc);
        txtdesc.setBounds(220, 120, 324, 30);

        txtcate.setEnabled(false);
        jPanel1.add(txtcate);
        txtcate.setBounds(220, 160, 210, 30);

        jCbx_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abarrotes", "Licores", "Golosinas", "Gaseosas", "Verduras", "Frutas", "Enlatados", "Embutidos", "Farmaceúticos", "Utiles escolares", "Panes" }));
        jPanel1.add(jCbx_Categoria);
        jCbx_Categoria.setBounds(440, 160, 170, 30);

        btnListar.setBackground(new java.awt.Color(51, 51, 51));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_listar.png"))); // NOI18N
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar);
        btnListar.setBounds(810, 70, 70, 70);

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(670, 180, 66, 66);

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_modificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(760, 180, 66, 66);

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(850, 180, 66, 66);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 960, 490));
        getContentPane().add(txtcate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 217, 155, -1));

        jMenu1.setText("Menú");

        jMenuItem1.setText("Inventario de productos");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Filtrar producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Imprimir inventario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void capturarDatos(){
        nom=txtnomi.getText();
        descripcion=txtdesc.getText();
        categoria=jCbx_Categoria.getSelectedItem().toString();
        tienda=txtTien.getText();
        stock=Integer.parseInt(txtst.getText());
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        capturarDatos();
        try {
            daoi.registrarInventario(new Inventario(nom, descripcion, categoria, tienda, stock,rs.getInt("id_usu")));
            JOptionPane.showMessageDialog(null, "Producto registrado correctamente.\nListar para actualizar inventario.");
        } catch (SQLException ex) {
            System.err.println("Error en el acceso: "+ex.getMessage());
        }
        limpiar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            capturarDatos();
            daoi.modificarProducto(new Inventario(nom,descripcion,categoria, tienda, stock,rs.getInt("id_usu")),rs.getInt("id_usu"),rs.getString("nom_prod"));
            JOptionPane.showMessageDialog(null, "Producto modificado correctamente.\nListar para actualizar inventario.");
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarActionPerformed
    public void mostrar() throws SQLException{
        ArrayList<Inventario> listai=daoi.getProductos(rs.getInt("id_usu"));
        int x=0;
        for(Inventario i:listai){
            tbSalida.getModel().setValueAt(i.getNom(),x,0);
            tbSalida.getModel().setValueAt(i.getDescripcion(),x,1);
            tbSalida.getModel().setValueAt(i.getCategoria(),x,2);
            tbSalida.getModel().setValueAt(i.getTienda(),x,3);
            tbSalida.getModel().setValueAt(i.getStock(),x,4);
            x=x+1;
        }
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            String nombre=txtnomi.getText();
            cn=ConexionBD.getConexion();
            String sql ="delete from inventario where id_usu="+rs.getInt("id_usu")+" and nom_prod='"+nombre+"'";
            ps=cn.prepareStatement(sql);
            ps.execute();
            ps.close();
            limpiar();
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.\nListar para actualizar inventario.");
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        try {
            FrmMiUsuario frame=new FrmMiUsuario(rs);
            frame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String nombre = txtnomi.getText();
            cn=ConexionBD.getConexion();
            String sql ="select * from inventario where nom_prod='"+nombre+"' and id_usu= "+rs.getInt("id_usu");
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            if(rs.next()){
                txtnomi.setText(rs.getString("nom_prod"));
                txtdesc.setText(rs.getString("descripcion"));
                txtcate.setText(rs.getString("categoria"));
                txtst.setText(rs.getString("stock"));
                txtTien.setText(rs.getString("tienda"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Producto inválido!!!\nInténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.err.println(e);
        } 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            FrmFiltrarProducto frame=new FrmFiltrarProducto(rs);
            frame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            FrmImprimirInventario frame=new FrmImprimirInventario(rs);
            frame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void limpiar(){
        txtnomi.setText("");
        txtdesc.setText("");
        txtTien.setText("");
        txtcate.setText("");
        txtst.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    
                new FrmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel iniciotxt;
    private javax.swing.JComboBox<String> jCbx_Categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTable tbSalida;
    private javax.swing.JTextField txtTien;
    private javax.swing.JTextField txtcate;
    private javax.swing.JTextField txtcate1;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtnomi;
    private javax.swing.JTextField txtst;
    // End of variables declaration//GEN-END:variables
}
