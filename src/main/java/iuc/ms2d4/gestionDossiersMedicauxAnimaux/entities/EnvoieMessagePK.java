/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuc.ms2d4.gestionDossiersMedicauxAnimaux.entities;

import java.io.Serializable;
import jakarta.persistence.*;
/**
 *
 *
 * @author IMPACT TECH
 */
@Embeddable
public class EnvoieMessagePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_PROPRIETAIRE", nullable = false)
    private int idProprietaire;
    @Basic(optional = false)
    @Column(name = "ID_VETERINAIRE", nullable = false)
    private int idVeterinaire;

    public EnvoieMessagePK() {
    }

    public EnvoieMessagePK(int idProprietaire, int idVeterinaire) {
        this.idProprietaire = idProprietaire;
        this.idVeterinaire = idVeterinaire;
    }

    public int getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(int idProprietaire) {
        this.idProprietaire = idProprietaire;
    }

    public int getIdVeterinaire() {
        return idVeterinaire;
    }

    public void setIdVeterinaire(int idVeterinaire) {
        this.idVeterinaire = idVeterinaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProprietaire;
        hash += (int) idVeterinaire;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnvoieMessagePK)) {
            return false;
        }
        EnvoieMessagePK other = (EnvoieMessagePK) object;
        if (this.idProprietaire != other.idProprietaire) {
            return false;
        }
        if (this.idVeterinaire != other.idVeterinaire) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.EnvoieMessagePK[ idProprietaire=" + idProprietaire + ", idVeterinaire=" + idVeterinaire + " ]";
    }
    
}
