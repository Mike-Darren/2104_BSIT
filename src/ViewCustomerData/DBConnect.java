package ViewCustomerData;

import Admin_Login.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    // Make 'con' static to match the static method 'getConnection'
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            // Ensure the MySQL JDBC driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to MySQL
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2104_wrs", "root", "");

            System.out.println("Connection established in getConnection method");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return con;
    }
}