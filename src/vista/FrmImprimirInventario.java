package vista;
import java.awt.*;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import modelo.dao.InventarioDAO;
import modelo.entidad.Inventario;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

import util.ConexionBD;

public class FrmImprimirInventario extends javax.swing.JFrame implements Printable{
    InventarioDAO daoi;
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;

    public FrmImprimirInventario() {
        initComponents();
    }
    public FrmImprimirInventario(ResultSet rs) throws SQLException{
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Imprimir inventario");
        btn_volver.setToolTipText("Regresa a la ventana anterior");
        btn_imprimir.setToolTipText("Imprimir inventario");
        daoi= new InventarioDAO();
        this.rs=rs;
        iniciotxt.setText("Inventario de "+rs.getString("usuario"));
        
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

        panel_impresion = new javax.swing.JPanel();
        iniciotxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSalida = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_impresion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        iniciotxt.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        iniciotxt.setText("jLabel1");

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

        javax.swing.GroupLayout panel_impresionLayout = new javax.swing.GroupLayout(panel_impresion);
        panel_impresion.setLayout(panel_impresionLayout);
        panel_impresionLayout.setHorizontalGroup(
            panel_impresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_impresionLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panel_impresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_impresionLayout.createSequentialGroup()
                        .addComponent(iniciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_impresionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        panel_impresionLayout.setVerticalGroup(
            panel_impresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_impresionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(panel_impresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 710, 380));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MyStock+");

        btn_volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_volver.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(btn_volver)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_imprimir.setBackground(new java.awt.Color(255, 255, 102));
        btn_imprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        try {
            FrmProductos frame = new FrmProductos(rs);
            frame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FrmMiUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        Document documento= new Document();
        try {
            String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Downloads/Reporte.pdf"));
            documento.open();
            PdfPTable tabla= new PdfPTable(5);
            tabla.addCell("Nombre del producto");
            tabla.addCell("Descripción del producto");
            tabla.addCell("Categoria");
            tabla.addCell("Stock");
            tabla.addCell("Tienda");
            cn=ConexionBD.getConexion();
            String sql= "Select * from inventario where id_usu="+rs.getInt("id_usu");
            ps=cn.prepareStatement(sql);
            ResultSet rs_prod=ps.executeQuery();
            if(rs_prod.next()){
                do{
                    tabla.addCell(rs_prod.getString("nom_prod"));
                    tabla.addCell(rs_prod.getString("descripcion"));
                    tabla.addCell(rs_prod.getString("categoria"));
                    tabla.addCell(rs_prod.getString("stock"));
                    tabla.addCell(rs_prod.getString("tienda"));
                }while(rs_prod.next());{
                    documento.add(tabla);
                }
            }
            documento.close();
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmImprimirInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmImprimirInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmImprimirInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmImprimirInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmImprimirInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel iniciotxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_impresion;
    private javax.swing.JTable tbSalida;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if(index>0){
            return NO_SUCH_PAGE;
        }
        
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX()+30, pagfor.getImageableY()+30);
        hub.scale(0.7, 0.7);
        
        panel_impresion.printAll(graf);
        return PAGE_EXISTS;
    }
}
