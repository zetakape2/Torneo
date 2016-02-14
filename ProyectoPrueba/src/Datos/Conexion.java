/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;

/**
 *
 * @author Eduardo
 */
public class Conexion {
    private static String servidor="jdbc:mysql://localhost/bdtorneo";
    private static String usuario="root";
    private static String password="";
    private static String driver="com.mysql.jdbc.Driver";
    private static Connection conexion;

    public Conexion() {
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(servidor,usuario,password);
            conexion.createStatement();
            System.out.println("Conexion: OK");
        } catch(Exception ex){
            System.out.println("Conexion: Error -> "+ex.getMessage());
        }
    }
    
    /*public void ejecutarTransaccion(String sql,Connection conex)
    {  Statement objSent=null;//Preparar orden
        try { objSent=conex.prepareStatement(sql);//Espacio Virtual
            try {//Generar COMMIT
                objSent.execute(sql);
            } catch (Exception e) {
              System.out.println("Problema de COMPROMISO 1 :"+e.getMessage());  }
        } catch (Exception ee) {
            System.out.println("Problema de SENTENCIA EN VIRTUAL SPACE :"+ee.getMessage());
        }    
    }*/
    
    public Connection getConnection(){
        return conexion;
    }
    
    
}
