/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Negocio.Torneo;
import Negocio.ConfTorneo;
/**
 *
 * @author Eduardo
 */

public class TTorneo {
    Torneo torneo;
    ConfTorneo conft;
    Conexion conexion = new Conexion();
    Connection con = conexion.getConnection();
    Statement st;
    ResultSet rs;
    String sql="";

    public void ingresarTorneo(Torneo torneo){
        try {
           st = con.createStatement();
           sql = "INSERT INTO TORNEO VALUES('"+torneo.getIdTorneo()+"','"+torneo.getIdConfTorneo()+"','"+torneo.getIdPersona()+"')";
           st.executeUpdate(sql);
           st.close();
           con.close();
        } catch (Exception e) {
            System.out.println("Error al ingresar TORNEO: \n"+e.getMessage());
        }
    }
    
    public void cargarTorneos(){
        try {
            st = con.createStatement();
            sql ="SELECT MAX(idTorneo) FROM TORNEO";  
            st.executeQuery(sql);
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error al cargar los torneos: \n"+e.getMessage());
        }
    }
}
