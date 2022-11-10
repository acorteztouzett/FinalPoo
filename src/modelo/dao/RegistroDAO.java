package modelo.dao;
import modelo.entidad.Registro;
import util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class RegistroDAO {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    public void registrarUsuario(Registro u){
        try {
            cn=ConexionBD.getConexion();
            
            Random r = new Random();
            int result = r.nextInt(1000-1) + 1;
            String sql ="insert into usuario values(?,?,?,?,?,?)";
            ps=cn.prepareStatement(sql);
            ps.setInt(1, result);
            ps.setString(2, u.getNom_usu());
            ps.setString(3, u.getApe_usu());
            ps.setString(4, u.getContra_usu());
            ps.setInt(5, u.getTelef_usu());
            ps.setString(6, u.getUsuario());
            ps.execute();
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    
    public void modificarUsuario(Registro u,int id_usu){
        try {
            cn=ConexionBD.getConexion();
            String sql ="Update usuario set nom_usu=?,ape_usu=?,contra_usu=?,telef_usu=?,usuario=? where id_usu="+id_usu;
            ps=cn.prepareStatement(sql);
            ps.setString(1, u.getNom_usu());
            ps.setString(2, u.getApe_usu() );
            ps.setString(3, u.getContra_usu());
            ps.setInt(4, u.getTelef_usu());
            ps.setString(5, u.getUsuario());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
