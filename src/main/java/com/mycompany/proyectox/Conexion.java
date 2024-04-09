
package com.mycompany.proyectox;
//Imports
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection conectar = null;
    
    String usuario = "Jerson" ;
    String contraseña = "root2";
    String bd = "bd_twetter";
    String ip = "localhost";
    String puerto = "1433";
    
     String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + "/" + bd;
    
    public Connection establecerConexion(){
        try{
            //String cadena = "jdbc:sqlserver://localhost:1433; trustServerCertificate = true;" + puerto + ";" + "databaseName = " + bd;
            String cadena = "jdbc:sqlserver://localhost:1433;trustServerCertificate=true;port=" + puerto + ";databaseName=" + bd;

            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos");
        } catch(Exception e){
            
        JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos, error: " + e.toString());
        }
        return conectar;
    
    }
}
