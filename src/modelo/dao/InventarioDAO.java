
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.entidad.Inventario;
import util.ConexionBD;

public class InventarioDAO {
     Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
     public void registrarInventario(Inventario i){
        try {
            cn=ConexionBD.getConexion();
            String sql ="insert into inventario values(?,?,?,?,?,?)";
            ps=cn.prepareStatement(sql);
            ps.setInt(1, i.getCodigo());
            ps.setString(2, i.getNom());
            ps.setString(3, i.getDescripcion());
            ps.setString(4, i.getCategoria());
            ps.setInt(5, i.getStock());
            ps.setInt(6, i.getId_usuario());
            ps.execute();
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    
    public ArrayList<Inventario> getProductos(){
        ArrayList<Inventario> listaInv = new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("select * from inventario");
            rs=ps.executeQuery();
            while(rs.next()){
                Inventario i = new Inventario();
                i.setCodigo(rs.getInt(1));
                i.setNom(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setCategoria(rs.getString(4));
                i.setStock(rs.getInt(5));
                listaInv.add(i);
            }
        } catch (Exception e) {
        }
        return listaInv;
    }
}
