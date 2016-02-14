/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Negocio.Usuario;
import Datos.Conexion;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author Eduardo
 */
public class TUsuario {
    public void ingresarUsuario(Usuario usuario){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        Statement st;
        String sql;
        try {
            st = con.createStatement();
            sql= "INSERT INTO USUARIO VALUES('"+usuario.getIdUsuario()+"',"
                    + "'"+usuario.getUsuario()+"',"
                    + "'"+usuario.getContrasena()+"',"
                    + "'"+usuario.getTipoUsuario()+"',"
                    + "'"+usuario.getIdUsuario()+"')";
            st.executeQuery(sql);
            con.close();
            st.close();
            System.out.println("Usuario ingresado Correctamente.");
        } catch (Exception e) {
        }
    }
}
