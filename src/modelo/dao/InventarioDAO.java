
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import modelo.entidad.Inventario;
import util.ConexionBD;

public class InventarioDAO {
     Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
     public void registrarInventario(Inventario i){
        try {
            cn=ConexionBD.getConexion();
            Random r = new Random();
            int result = r.nextInt(1000000-100) + 100;
            String sql ="insert into inventario values(?,?,?,?,?,?)";
            ps=cn.prepareStatement(sql);
            ps.setInt(1, result);
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
    
    public ArrayList<Inventario> getProductos(int id_usu){
        ArrayList<Inventario> listaInv = new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("select * from inventario where id_usu="+id_usu);
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
    public void modificarUsuario(Inventario u,int id_usu){
        try {
            cn=ConexionBD.getConexion();
            String sql ="Update inventario set nom_prod=?,descripcion=?,categoria=?,stock=? where id_usu="+id_usu;
            ps=cn.prepareStatement(sql);
            ps.setString(1, u.getNom());
            ps.setString(2, u.getDescripcion());
            ps.setString(3, u.getCategoria());
            ps.setInt(4, u.getStock());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
}
