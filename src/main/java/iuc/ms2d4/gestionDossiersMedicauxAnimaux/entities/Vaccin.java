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
@Table(name = "vaccin", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vaccin.findAll", query = "SELECT v FROM Vaccin v"),
    @NamedQuery(name = "Vaccin.findByIdVaccin", query = "SELECT v FROM Vaccin v WHERE v.idVaccin = :idVaccin"),
    @NamedQuery(name = "Vaccin.findByTypeVaccin", query = "SELECT v FROM Vaccin v WHERE v.typeVaccin = :typeVaccin"),
    @NamedQuery(name = "Vaccin.findByDateVaccin", query = "SELECT v FROM Vaccin v WHERE v.dateVaccin = :dateVaccin"),
    @NamedQuery(name = "Vaccin.findByRappelVaccin", query = "SELECT v FROM Vaccin v WHERE v.rappelVaccin = :rappelVaccin")})
public class Vaccin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VACCIN", nullable = false)
    private Integer idVaccin;
    @Basic(optional = false)
    @Column(name = "TYPE_VACCIN", nullable = false, length = 20)
    private String typeVaccin;
    @Basic(optional = false)
    @Column(name = "DATE_VACCIN", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateVaccin;
    @Basic(optional = false)
    @Column(name = "RAPPEL_VACCIN", nullable = false, length = 20)
    private String rappelVaccin;
    @JoinColumn(name = "ID_DOSSIERMEDICAL", referencedColumnName = "ID_DOSSIERMEDICAL", nullable = false)
    @ManyToOne(optional = false)
    private Dossiermedical idDossiermedical;

    public Vaccin() {
    }

    public Vaccin(Integer idVaccin) {
        this.idVaccin = idVaccin;
    }

    public Vaccin(Integer idVaccin, String typeVaccin, Date dateVaccin, String rappelVaccin) {
        this.idVaccin = idVaccin;
        this.typeVaccin = typeVaccin;
        this.dateVaccin = dateVaccin;
        this.rappelVaccin = rappelVaccin;
    }

    public Integer getIdVaccin() {
        return idVaccin;
    }

    public void setIdVaccin(Integer idVaccin) {
        this.idVaccin = idVaccin;
    }

    public String getTypeVaccin() {
        return typeVaccin;
    }

    public void setTypeVaccin(String typeVaccin) {
        this.typeVaccin = typeVaccin;
    }

    public Date getDateVaccin() {
        return dateVaccin;
    }

    public void setDateVaccin(Date dateVaccin) {
        this.dateVaccin = dateVaccin;
    }

    public String getRappelVaccin() {
        return rappelVaccin;
    }

    public void setRappelVaccin(String rappelVaccin) {
        this.rappelVaccin = rappelVaccin;
    }

    public Dossiermedical getIdDossiermedical() {
        return idDossiermedical;
    }

    public void setIdDossiermedical(Dossiermedical idDossiermedical) {
        this.idDossiermedical = idDossiermedical;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVaccin != null ? idVaccin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vaccin)) {
            return false;
        }
        Vaccin other = (Vaccin) object;
        if ((this.idVaccin == null && other.idVaccin != null) || (this.idVaccin != null && !this.idVaccin.equals(other.idVaccin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Vaccin[ idVaccin=" + idVaccin + " ]";
    }
    
}
