/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Eduardo
 */
public class ConfTorneo {
    private int idConfigTorneo;
    private String nombreTorneo;
    private String descripcionTorneo;

    public ConfTorneo() {
    }

    public ConfTorneo(String nombreTorneo, String descripcionTorneo) {
        
        this.nombreTorneo = nombreTorneo;
        this.descripcionTorneo = descripcionTorneo;
    }

    public int getIdConfigTorneo() {
        return idConfigTorneo;
    }

    public void setIdConfigTorneo(int idConfigTorneo) {
        this.idConfigTorneo = idConfigTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getDescripcionTorneo() {
        return descripcionTorneo;
    }

    public void setDescripcionTorneo(String descripcionTorneo) {
        this.descripcionTorneo = descripcionTorneo;
    }
    
    
}
