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
@Table(name = "veterinaire", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Veterinaire.findAll", query = "SELECT v FROM Veterinaire v"),
    @NamedQuery(name = "Veterinaire.findByIdVeterinaire", query = "SELECT v FROM Veterinaire v WHERE v.idVeterinaire = :idVeterinaire"),
    @NamedQuery(name = "Veterinaire.findByNomVeterinaire", query = "SELECT v FROM Veterinaire v WHERE v.nomVeterinaire = :nomVeterinaire"),
    @NamedQuery(name = "Veterinaire.findByEmailVeterinaire", query = "SELECT v FROM Veterinaire v WHERE v.emailVeterinaire = :emailVeterinaire"),
    @NamedQuery(name = "Veterinaire.findByNumeroVeterinaire", query = "SELECT v FROM Veterinaire v WHERE v.numeroVeterinaire = :numeroVeterinaire"),
    @NamedQuery(name = "Veterinaire.findByMdpVeterinaire", query = "SELECT v FROM Veterinaire v WHERE v.mdpVeterinaire = :mdpVeterinaire")})
public class Veterinaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VETERINAIRE", nullable = false)
    private Integer idVeterinaire;
    @Basic(optional = false)
    @Column(name = "NOM_VETERINAIRE", nullable = false, length = 128)
    private String nomVeterinaire;
    @Basic(optional = false)
    @Column(name = "EMAIL_VETERINAIRE", nullable = false, length = 128)
    private String emailVeterinaire;
    @Basic(optional = false)
    @Column(name = "NUMERO_VETERINAIRE", nullable = false, length = 128)
    private String numeroVeterinaire;
    @Basic(optional = false)
    @Column(name = "MDP_VETERINAIRE", nullable = false, length = 128)
    private String mdpVeterinaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVeterinaire")
    private List<Rendezvous> rendezvousList;

    public Veterinaire() {
    }

    public Veterinaire(Integer idVeterinaire) {
        this.idVeterinaire = idVeterinaire;
    }

    public Veterinaire(Integer idVeterinaire, String nomVeterinaire, String emailVeterinaire, String numeroVeterinaire, String mdpVeterinaire) {
        this.idVeterinaire = idVeterinaire;
        this.nomVeterinaire = nomVeterinaire;
        this.emailVeterinaire = emailVeterinaire;
        this.numeroVeterinaire = numeroVeterinaire;
        this.mdpVeterinaire = mdpVeterinaire;
    }

    public Integer getIdVeterinaire() {
        return idVeterinaire;
    }

    public void setIdVeterinaire(Integer idVeterinaire) {
        this.idVeterinaire = idVeterinaire;
    }

    public String getNomVeterinaire() {
        return nomVeterinaire;
    }

    public void setNomVeterinaire(String nomVeterinaire) {
        this.nomVeterinaire = nomVeterinaire;
    }

    public String getEmailVeterinaire() {
        return emailVeterinaire;
    }

    public void setEmailVeterinaire(String emailVeterinaire) {
        this.emailVeterinaire = emailVeterinaire;
    }

    public String getNumeroVeterinaire() {
        return numeroVeterinaire;
    }

    public void setNumeroVeterinaire(String numeroVeterinaire) {
        this.numeroVeterinaire = numeroVeterinaire;
    }

    public String getMdpVeterinaire() {
        return mdpVeterinaire;
    }

    public void setMdpVeterinaire(String mdpVeterinaire) {
        this.mdpVeterinaire = mdpVeterinaire;
    }

    public List<Rendezvous> getRendezvousList() {
        return rendezvousList;
    }

    public void setRendezvousList(List<Rendezvous> rendezvousList) {
        this.rendezvousList = rendezvousList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeterinaire != null ? idVeterinaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veterinaire)) {
            return false;
        }
        Veterinaire other = (Veterinaire) object;
        if ((this.idVeterinaire == null && other.idVeterinaire != null) || (this.idVeterinaire != null && !this.idVeterinaire.equals(other.idVeterinaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Veterinaire[ idVeterinaire=" + idVeterinaire + " ]";
    }
    
}
