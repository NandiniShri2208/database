import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_mySQL {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
          con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            System.out.println("connection established successfully");
        }
catch (Exception e){
    System.out.println("connection established successfully");
}
        finally{
            if(con != null){
                System.out.println("connection closed successfully");
            }
        }
    }
}
