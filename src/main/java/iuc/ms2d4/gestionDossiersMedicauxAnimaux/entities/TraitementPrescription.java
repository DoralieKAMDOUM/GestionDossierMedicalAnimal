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
@Table(name = "traitement_prescription", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "TraitementPrescription.findAll", query = "SELECT t FROM TraitementPrescription t"),
    @NamedQuery(name = "TraitementPrescription.findByIdTraitement", query = "SELECT t FROM TraitementPrescription t WHERE t.idTraitement = :idTraitement"),
    @NamedQuery(name = "TraitementPrescription.findByContenuTraitement", query = "SELECT t FROM TraitementPrescription t WHERE t.contenuTraitement = :contenuTraitement"),
    @NamedQuery(name = "TraitementPrescription.findByDateTraitement", query = "SELECT t FROM TraitementPrescription t WHERE t.dateTraitement = :dateTraitement"),
    @NamedQuery(name = "TraitementPrescription.findByDuree", query = "SELECT t FROM TraitementPrescription t WHERE t.duree = :duree")})
public class TraitementPrescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TRAITEMENT", nullable = false)
    private Integer idTraitement;
    @Basic(optional = false)
    @Column(name = "CONTENU_TRAITEMENT", nullable = false, length = 128)
    private String contenuTraitement;
    @Column(name = "DATE_TRAITEMENT")
    @Temporal(TemporalType.DATE)
    private Date dateTraitement;
    @Basic(optional = false)
    @Column(name = "DUREE", nullable = false)
    private long duree;
    @JoinColumn(name = "ID_CONSULTATION", referencedColumnName = "ID_CONSULTATION", nullable = false)
    @ManyToOne(optional = false)
    private Consultation idConsultation;

    public TraitementPrescription() {
    }

    public TraitementPrescription(Integer idTraitement) {
        this.idTraitement = idTraitement;
    }

    public TraitementPrescription(Integer idTraitement, String contenuTraitement, long duree) {
        this.idTraitement = idTraitement;
        this.contenuTraitement = contenuTraitement;
        this.duree = duree;
    }

    public Integer getIdTraitement() {
        return idTraitement;
    }

    public void setIdTraitement(Integer idTraitement) {
        this.idTraitement = idTraitement;
    }

    public String getContenuTraitement() {
        return contenuTraitement;
    }

    public void setContenuTraitement(String contenuTraitement) {
        this.contenuTraitement = contenuTraitement;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public long getDuree() {
        return duree;
    }

    public void setDuree(long duree) {
        this.duree = duree;
    }

    public Consultation getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(Consultation idConsultation) {
        this.idConsultation = idConsultation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTraitement != null ? idTraitement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraitementPrescription)) {
            return false;
        }
        TraitementPrescription other = (TraitementPrescription) object;
        if ((this.idTraitement == null && other.idTraitement != null) || (this.idTraitement != null && !this.idTraitement.equals(other.idTraitement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.TraitementPrescription[ idTraitement=" + idTraitement + " ]";
    }
    
}
