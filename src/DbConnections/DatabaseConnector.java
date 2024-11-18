package DbConnections;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;

public class DatabaseConnector {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/2104_WRS"; 
        String user = "root"; 
        String password = "";
        
        try { Connection conn = DriverManager.getConnection(url, user, password); 
        System.out.println("Connected to the MySQL database!"); 
        } catch (SQLException e) { 
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
    
}