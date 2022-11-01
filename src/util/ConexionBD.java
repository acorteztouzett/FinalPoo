package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static  Connection getConexion(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://containers-us-west-48.railway.app:6994/railway";
            cn=DriverManager.getConnection(url,"root","dZ3y4E0OKHK17KJlRZ7X");
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
