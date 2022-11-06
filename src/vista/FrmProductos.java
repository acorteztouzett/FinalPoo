
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
import javax.swing.JOptionPane;
import util.ConexionBD;

public class FrmProductos extends javax.swing.JFrame {
    ResultSet rs;
    String nom, descripcion, categoria;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcate = new javax.swing.JTextField();
        txtst = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaRes = new javax.swing.JTextArea();
        jlabel3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnomi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        iniciotxt = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 182, 324, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Descripción:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 181, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MyStock+");

        btnModificar.setBackground(new java.awt.Color(0, 102, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_modificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(0, 102, 0));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_listar.png"))); // NOI18N
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 102, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_MiPerfil.png"))); // NOI18N
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 102, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(220, 220, 220)
                .addComponent(btnPerfil)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar)
                        .addComponent(btnListar)
                        .addComponent(btnBuscar)
                        .addComponent(btnEliminar)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Stock:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 257, -1, -1));
        getContentPane().add(txtcate, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 217, 155, -1));
        getContentPane().add(txtst, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 258, 88, -1));

        txaRes.setColumns(20);
        txaRes.setRows(5);
        jScrollPane2.setViewportView(txaRes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 298, 850, 254));

        jlabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(204, 255, 255));
        jlabel3.setText("Nombre:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Categoría:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 216, -1, -1));
        getContentPane().add(txtnomi, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 141, 136, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        iniciotxt.setFont(new java.awt.Font(".SF NS Text", 3, 18)); // NOI18N
        iniciotxt.setForeground(new java.awt.Color(204, 0, 255));
        iniciotxt.setText("jLabel1");

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_registrar.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(iniciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(620, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(iniciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 960, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void capturarDatos(){
        nom=txtnomi.getText();
        descripcion=txtdesc.getText();
        categoria=txtcate.getText();
        stock=Integer.parseInt(txtst.getText());
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        capturarDatos();
        try {
            daoi.registrarInventario(new Inventario(nom, descripcion, categoria, stock,rs.getInt("id_usu")));
        } catch (SQLException ex) {
            System.err.println("Error en el acceso: "+ex.getMessage());
        }
        limpiar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            capturarDatos();
            daoi.modificarUsuario(new Inventario(nom,descripcion,categoria,stock,rs.getInt("id_usu")),rs.getInt("id_usu"));
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
        txaRes.setText("Código: Nombre: Descripción: Categoria: Stock: \n");
        for(Inventario i:listai){
            txaRes.append(i.getCodigo() + "\t" + i.getNom()+ "\t" + i.getDescripcion() + "\t" + i.getCategoria() + "\t" + i.getStock() + "\n");
        }
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String nombre=txtnomi.getText();
            cn=ConexionBD.getConexion();
            String sql ="delete from inventario where id_usu="+rs.getInt("id_usu")+" and nom_prod='"+nombre+"'";
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            limpiar();
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
            }else{
                JOptionPane.showMessageDialog(null, "Producto inválido!!!\nInténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.err.println(e);
        } 
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void limpiar(){
        txtnomi.setText("");
        txtdesc.setText("");
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextArea txaRes;
    private javax.swing.JTextField txtcate;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtnomi;
    private javax.swing.JTextField txtst;
    // End of variables declaration//GEN-END:variables
}
