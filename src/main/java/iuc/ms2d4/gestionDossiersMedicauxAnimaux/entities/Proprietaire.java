/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuc.ms2d4.gestionDossiersMedicauxAnimaux.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
/**
 *
/**
 *
 * @author IMPACT TECH
 */
@Entity
@Table(name = "proprietaire", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Proprietaire.findAll", query = "SELECT p FROM Proprietaire p"),
    @NamedQuery(name = "Proprietaire.findByIdProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.idProprietaire = :idProprietaire"),
    @NamedQuery(name = "Proprietaire.findByNomProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.nomProprietaire = :nomProprietaire"),
    @NamedQuery(name = "Proprietaire.findByPrenomProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.prenomProprietaire = :prenomProprietaire"),
    @NamedQuery(name = "Proprietaire.findByAdresseProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.adresseProprietaire = :adresseProprietaire"),
    @NamedQuery(name = "Proprietaire.findByEmailProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.emailProprietaire = :emailProprietaire"),
    @NamedQuery(name = "Proprietaire.findByNumeroProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.numeroProprietaire = :numeroProprietaire"),
    @NamedQuery(name = "Proprietaire.findByMdpProprietaire", query = "SELECT p FROM Proprietaire p WHERE p.mdpProprietaire = :mdpProprietaire")})
public class Proprietaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROPRIETAIRE", nullable = false)
    private Integer idProprietaire;
    @Basic(optional = false)
    @Column(name = "NOM_PROPRIETAIRE", nullable = false, length = 128)
    private String nomProprietaire;
    @Basic(optional = false)
    @Column(name = "PRENOM_PROPRIETAIRE", nullable = false, length = 128)
    private String prenomProprietaire;
    @Basic(optional = false)
    @Column(name = "ADRESSE_PROPRIETAIRE", nullable = false, length = 128)
    private String adresseProprietaire;
    @Basic(optional = false)
    @Column(name = "EMAIL_PROPRIETAIRE", nullable = false, length = 128)
    private String emailProprietaire;
    @Basic(optional = false)
    @Column(name = "NUMERO_PROPRIETAIRE", nullable = false, length = 128)
    private String numeroProprietaire;
    @Basic(optional = false)
    @Column(name = "MDP_PROPRIETAIRE", nullable = false, length = 128)
    private String mdpProprietaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProprietaire")
    private List<Animal> animalList;

    public Proprietaire() {
    }

    public Proprietaire(Integer idProprietaire) {
        this.idProprietaire = idProprietaire;
    }

    public Proprietaire(Integer idProprietaire, String nomProprietaire, String prenomProprietaire, String adresseProprietaire, String emailProprietaire, String numeroProprietaire, String mdpProprietaire) {
        this.idProprietaire = idProprietaire;
        this.nomProprietaire = nomProprietaire;
        this.prenomProprietaire = prenomProprietaire;
        this.adresseProprietaire = adresseProprietaire;
        this.emailProprietaire = emailProprietaire;
        this.numeroProprietaire = numeroProprietaire;
        this.mdpProprietaire = mdpProprietaire;
    }

    public Integer getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(Integer idProprietaire) {
        this.idProprietaire = idProprietaire;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    public String getAdresseProprietaire() {
        return adresseProprietaire;
    }

    public void setAdresseProprietaire(String adresseProprietaire) {
        this.adresseProprietaire = adresseProprietaire;
    }

    public String getEmailProprietaire() {
        return emailProprietaire;
    }

    public void setEmailProprietaire(String emailProprietaire) {
        this.emailProprietaire = emailProprietaire;
    }

    public String getNumeroProprietaire() {
        return numeroProprietaire;
    }

    public void setNumeroProprietaire(String numeroProprietaire) {
        this.numeroProprietaire = numeroProprietaire;
    }

    public String getMdpProprietaire() {
        return mdpProprietaire;
    }

    public void setMdpProprietaire(String mdpProprietaire) {
        this.mdpProprietaire = mdpProprietaire;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProprietaire != null ? idProprietaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proprietaire)) {
            return false;
        }
        Proprietaire other = (Proprietaire) object;
        if ((this.idProprietaire == null && other.idProprietaire != null) || (this.idProprietaire != null && !this.idProprietaire.equals(other.idProprietaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Proprietaire[ idProprietaire=" + idProprietaire + " ]";
    }
    
}
