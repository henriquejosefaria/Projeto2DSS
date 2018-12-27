package Funcionalidade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryzon
 */
public class AConnection {
    public static Connection createConnection() throws SQLException {
    
        String url = "jdbc:mysql://localhost:3307/stand?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "Jafar Strogonof";
        String password = "Jafar";
        Connection con = null;
    
    try {
        con = DriverManager.getConnection(url, username, password);
        System.out.println("MySQL Database connected!");
        return con;
        
    }catch (SQLException e) {
        throw new IllegalStateException("Cannot connect to the MySQL database!", e);
    }
}
 public static void closeConection(Connection connection) {
        try {
            connection.close();
        } 
        catch (Exception e) {
        }
    }    
}
