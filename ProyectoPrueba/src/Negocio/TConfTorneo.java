/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Conexion;
import Negocio.ConfTorneo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Eduardo
 */
public class TConfTorneo {
  Conexion conexion = new Conexion();  
  Connection con = conexion.getConnection();
  Statement st;
  ResultSet rs;
  String sql;
    public void ingresarConfTorneo(ConfTorneo conft){
        try {
            st = con.createStatement();
            sql = "INSERT INTO conftorneo values(0,'"+conft.getNombreTorneo()+"','"+conft.getDescripcionTorneo()+"')";
            st.executeUpdate(sql);
            st.close();
            con.close();
            System.out.println("Registro enviado correctamente");
        } catch (Exception e) {
            System.out.println("Error al intentar registrar. \n"+e.getMessage());  
        }  
    }
}
