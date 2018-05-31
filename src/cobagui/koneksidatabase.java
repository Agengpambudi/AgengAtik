
package cobagui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Yana
 */
public class koneksidatabase {
String SQL;
Connection connection;
Statement statement;
     private static Connection koneksi;
  
    public static Connection getKoneksi() {
      
      if (koneksi==null){
          
          try {
              String url = "jdbc:postgresql://localhost:5432/postgres";
              String user = "postgres";
              String password = "chawoksz28";
              DriverManager.registerDriver(new org.postgresql.Driver());
              koneksi =DriverManager.getConnection(url, user, password);
         
          } 
          catch (SQLException t){
          
              System.out.println("Error Membuat Koneksi");
      }
      }
      return koneksi;
  }


   
}
