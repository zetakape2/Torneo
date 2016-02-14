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
public class Torneo {
    private int idTorneo;
    private int idConfTorneo;
    private int idPersona;

    public Torneo() {
    }

    public Torneo(int idTorneo, int idConfTorneo, int idPersona) {
        this.idTorneo = idTorneo;
        this.idConfTorneo = idConfTorneo;
        this.idPersona = idPersona;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public int getIdConfTorneo() {
        return idConfTorneo;
    }

    public void setIdConfTorneo(int idConfTorneo) {
        this.idConfTorneo = idConfTorneo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
}
