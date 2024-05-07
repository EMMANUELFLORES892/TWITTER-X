/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author user
 */
public class ProyectoX {

    public static void main(String[] args){
        try{
            //La direccion en la linea 22 es para las computadoras en la uni
            //String url = "jdbc:ucanaccess://C://Users//PC//Documentos//NetBeansProjects//TWITTER-X//X.accdb";
            String url = "jdbc:ucanaccess://C://Users//CCCU//Documents//NetBeansProjects//TWITTER-X//X.accdb";
            Connection conn = DriverManager.getConnection(url);
            /*String sql = "SELECT * FROM "
            PreparedStatement pat = conn.prepareStatement(sql);
            
            
            
            */
        } catch(Exception e){
            System.out.print(e);
        }
    }
}
//https://www.youtube.com/watch?v=qHQXUrrubcs -> Como hacer y subir cosas al repositotio
// https://www.youtube.com/watch?v=LdDVi6_HdVs -> solucion de error que me salio, algo de las branches

