/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuc.ms2d4.gestionDossiersMedicauxAnimaux.entities;

import java.io.Serializable;
import jakarta.persistence.*;
/**
 *
/**
 *
 * @author IMPACT TECH
 */
@Entity
@Table(name = "envoie_message", catalog = "gestanimaux", schema = "")

@NamedQueries({
    @NamedQuery(name = "EnvoieMessage.findAll", query = "SELECT e FROM EnvoieMessage e"),
    @NamedQuery(name = "EnvoieMessage.findByIdProprietaire", query = "SELECT e FROM EnvoieMessage e WHERE e.envoieMessagePK.idProprietaire = :idProprietaire"),
    @NamedQuery(name = "EnvoieMessage.findByIdVeterinaire", query = "SELECT e FROM EnvoieMessage e WHERE e.envoieMessagePK.idVeterinaire = :idVeterinaire"),
    @NamedQuery(name = "EnvoieMessage.findByMessage", query = "SELECT e FROM EnvoieMessage e WHERE e.message = :message")})
public class EnvoieMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnvoieMessagePK envoieMessagePK;
    @Basic(optional = false)
    @Column(name = "message", nullable = false, length = 255)
    private String message;

    public EnvoieMessage() {
    }

    public EnvoieMessage(EnvoieMessagePK envoieMessagePK) {
        this.envoieMessagePK = envoieMessagePK;
    }

    public EnvoieMessage(EnvoieMessagePK envoieMessagePK, String message) {
        this.envoieMessagePK = envoieMessagePK;
        this.message = message;
    }

    public EnvoieMessage(int idProprietaire, int idVeterinaire) {
        this.envoieMessagePK = new EnvoieMessagePK(idProprietaire, idVeterinaire);
    }

    public EnvoieMessagePK getEnvoieMessagePK() {
        return envoieMessagePK;
    }

    public void setEnvoieMessagePK(EnvoieMessagePK envoieMessagePK) {
        this.envoieMessagePK = envoieMessagePK;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (envoieMessagePK != null ? envoieMessagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnvoieMessage)) {
            return false;
        }
        EnvoieMessage other = (EnvoieMessage) object;
        if ((this.envoieMessagePK == null && other.envoieMessagePK != null) || (this.envoieMessagePK != null && !this.envoieMessagePK.equals(other.envoieMessagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.EnvoieMessage[ envoieMessagePK=" + envoieMessagePK + " ]";
    }
    
}
