/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuc.ms2d4.gestionDossiersMedicauxAnimaux.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
/**
 *
/**
 *
 * @author IMPACT TECH
 */
@Entity
@Table(name = "rendezvous", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Rendezvous.findAll", query = "SELECT r FROM Rendezvous r"),
    @NamedQuery(name = "Rendezvous.findByIdRendezvous", query = "SELECT r FROM Rendezvous r WHERE r.idRendezvous = :idRendezvous"),
    @NamedQuery(name = "Rendezvous.findByHeureRendezvous", query = "SELECT r FROM Rendezvous r WHERE r.heureRendezvous = :heureRendezvous"),
    @NamedQuery(name = "Rendezvous.findByDateRendezvous", query = "SELECT r FROM Rendezvous r WHERE r.dateRendezvous = :dateRendezvous"),
    @NamedQuery(name = "Rendezvous.findByObjet", query = "SELECT r FROM Rendezvous r WHERE r.objet = :objet")})
public class Rendezvous implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_RENDEZVOUS", nullable = false)
    private Integer idRendezvous;
    @Basic(optional = false)
    @Column(name = "HEURE_RENDEZVOUS", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date heureRendezvous;
    @Basic(optional = false)
    @Column(name = "DATE_RENDEZVOUS", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateRendezvous;
    @Basic(optional = false)
    @Column(name = "OBJET", nullable = false, length = 128)
    private String objet;
    @JoinColumn(name = "ID_ANIMAL", referencedColumnName = "ID_ANIMAL", nullable = false)
    @ManyToOne(optional = false)
    private Animal idAnimal;
    @JoinColumn(name = "ID_TYPERENDEZVOUS", referencedColumnName = "ID_TYPERENDEZVOUS", nullable = false)
    @ManyToOne(optional = false)
    private TypeRendezvous idTyperendezvous;
    @JoinColumn(name = "ID_VETERINAIRE", referencedColumnName = "ID_VETERINAIRE", nullable = false)
    @ManyToOne(optional = false)
    private Veterinaire idVeterinaire;

    public Rendezvous() {
    }

    public Rendezvous(Integer idRendezvous) {
        this.idRendezvous = idRendezvous;
    }

    public Rendezvous(Integer idRendezvous, Date heureRendezvous, Date dateRendezvous, String objet) {
        this.idRendezvous = idRendezvous;
        this.heureRendezvous = heureRendezvous;
        this.dateRendezvous = dateRendezvous;
        this.objet = objet;
    }

    public Integer getIdRendezvous() {
        return idRendezvous;
    }

    public void setIdRendezvous(Integer idRendezvous) {
        this.idRendezvous = idRendezvous;
    }

    public Date getHeureRendezvous() {
        return heureRendezvous;
    }

    public void setHeureRendezvous(Date heureRendezvous) {
        this.heureRendezvous = heureRendezvous;
    }

    public Date getDateRendezvous() {
        return dateRendezvous;
    }

    public void setDateRendezvous(Date dateRendezvous) {
        this.dateRendezvous = dateRendezvous;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Animal getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Animal idAnimal) {
        this.idAnimal = idAnimal;
    }

    public TypeRendezvous getIdTyperendezvous() {
        return idTyperendezvous;
    }

    public void setIdTyperendezvous(TypeRendezvous idTyperendezvous) {
        this.idTyperendezvous = idTyperendezvous;
    }

    public Veterinaire getIdVeterinaire() {
        return idVeterinaire;
    }

    public void setIdVeterinaire(Veterinaire idVeterinaire) {
        this.idVeterinaire = idVeterinaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRendezvous != null ? idRendezvous.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rendezvous)) {
            return false;
        }
        Rendezvous other = (Rendezvous) object;
        if ((this.idRendezvous == null && other.idRendezvous != null) || (this.idRendezvous != null && !this.idRendezvous.equals(other.idRendezvous))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Rendezvous[ idRendezvous=" + idRendezvous + " ]";
    }
    
}
