/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection getConnection(){
        String conexionUrl = "jdbc:sqlserver://localhost:1433;trustServerCertificate=true;"
                + "database = bd_twetter;"
                + "user = Jerson;"
                + "password = root2;"
                + "loginTimeout = 30;";
        try{
        Connection con = DriverManager.getConnection(conexionUrl);
        return con;
        }
        catch(SQLException ex){
        System.out.println(ex.toString());
        return null;
        }
    }
}
