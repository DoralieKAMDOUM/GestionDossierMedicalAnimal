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
@Table(name = "consultation", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Consultation.findAll", query = "SELECT c FROM Consultation c"),
    @NamedQuery(name = "Consultation.findByIdConsultation", query = "SELECT c FROM Consultation c WHERE c.idConsultation = :idConsultation"),
    @NamedQuery(name = "Consultation.findByDiagnostic", query = "SELECT c FROM Consultation c WHERE c.diagnostic = :diagnostic")})
public class Consultation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CONSULTATION", nullable = false)
    private Integer idConsultation;
    @Basic(optional = false)
    @Lob
    @Column(name = "SYMPTOME", nullable = false, length = 65535)
    private String symptome;
    @Basic(optional = false)
    @Column(name = "DIAGNOSTIC", nullable = false, length = 128)
    private String diagnostic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsultation")
    private List<TraitementPrescription> traitementPrescriptionList;
    @JoinColumn(name = "ID_DOSSIERMEDICAL", referencedColumnName = "ID_DOSSIERMEDICAL", nullable = false)
    @ManyToOne(optional = false)
    private Dossiermedical idDossiermedical;

    public Consultation() {
    }

    public Consultation(Integer idConsultation) {
        this.idConsultation = idConsultation;
    }

    public Consultation(Integer idConsultation, String symptome, String diagnostic) {
        this.idConsultation = idConsultation;
        this.symptome = symptome;
        this.diagnostic = diagnostic;
    }

    public Integer getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(Integer idConsultation) {
        this.idConsultation = idConsultation;
    }

    public String getSymptome() {
        return symptome;
    }

    public void setSymptome(String symptome) {
        this.symptome = symptome;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public List<TraitementPrescription> getTraitementPrescriptionList() {
        return traitementPrescriptionList;
    }

    public void setTraitementPrescriptionList(List<TraitementPrescription> traitementPrescriptionList) {
        this.traitementPrescriptionList = traitementPrescriptionList;
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
        hash += (idConsultation != null ? idConsultation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultation)) {
            return false;
        }
        Consultation other = (Consultation) object;
        if ((this.idConsultation == null && other.idConsultation != null) || (this.idConsultation != null && !this.idConsultation.equals(other.idConsultation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Consultation[ idConsultation=" + idConsultation + " ]";
    }
    
}
