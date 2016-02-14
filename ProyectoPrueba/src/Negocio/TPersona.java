/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Datos.Conexion;
import java.sql.SQLException;
/**
 *
 * @author Eduardo
 */
public class TPersona {

    public void ingresarPersona(Persona persona){
        Conexion conexion= new Conexion();
        Connection con = conexion.getConnection();
        Statement st;
        String sql;
        try {
            st = con.createStatement();
            sql= "INSERT INTO PERSONA VALUES('"+ persona.getIdPersona() +"',"
                    + "'"+ persona.getRut() +"','"+ persona.getNombre() +"',"
                    + "'"+ persona.getApellidoPaterno() +"',"
                    + "'"+ persona.getApellidoMaterno() +"',"
                    + "'"+ persona.getTelefono() +"',"
                    + "'"+ persona.getDireccion() +"',"
                    + "'"+ persona.getCorreo() +"',"
                    + "'"+ persona.getSexo() +"',"
                    + "'"+ persona.getEdad() +"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
            System.out.println("Persona Agregada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al ingresar una persona al sistema.\nError: "+e.getMessage());
        }
    }
    
    public void eliminarPersona(String rut){
        
    }
    
    public void buscarPersona(String rut){
        
    }
    public void modificarPersona(Persona persona){
        
    }            
}
