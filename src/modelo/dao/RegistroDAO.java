package modelo.dao;
import modelo.entidad.Registro;
import util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Random;

public class RegistroDAO {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    public void registrarUsuario(Registro u){
        try {
            Random r = new Random();
            int result = r.nextInt(1000-1) + 1;
            cn=ConexionBD.getConexion();
            String sql ="insert into usuario values(?,?,?,?,?,?)";
            ps=cn.prepareStatement(sql);
            ps.setInt(1, result);
            ps.setString(2, u.getNombre());
            ps.setString(3, u.getApellido());
            ps.setString(4, u.getContraseña());
            ps.setInt(5, u.getTelefono());
            ps.setString(6, u.getUsuario());
            ps.execute();
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    
    public ArrayList<Registro> getUsuarios(){
        ArrayList<Registro> listaUsu = new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("select * from usuario");
            rs=ps.executeQuery();
            while(rs.next()){
                Registro u = new Registro();
                u.setUsuario(rs.getString(1));
                u.setNombre(rs.getString(2));
                u.setApellido(rs.getString(3));
                u.setContraseña(rs.getString(4));
                u.setTelefono(rs.getInt(5));
                listaUsu.add(u);
            }
        } catch (Exception e) {
            
        }
        return listaUsu;
    }
    
    public void modificarUsuario(Registro u,int id_usu){
        try {
            cn=ConexionBD.getConexion();
            String sql ="Update usuario set nom_usu=?,ape_usu=?,contra_usu=?,telef_usu=?,usuario=? where id_usu="+id_usu;
            ps=cn.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getContraseña());
            ps.setInt(4, u.getTelefono());
            ps.setString(5, u.getUsuario());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
