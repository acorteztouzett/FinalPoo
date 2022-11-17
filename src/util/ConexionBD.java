package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static  Connection getConexion(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://remotemysql.com/kSWJ1SMJwX";
            cn=DriverManager.getConnection(url,"kSWJ1SMJwX","2HblF4zbnB");
            System.out.print("Conexión con exito!!!");
        }catch(Exception e){
            System.err.println("ERROR en la conexión : "+e.getMessage());
        }
        return cn;
    }
   public static void main(String args[]){
       getConexion();
   } 
}
