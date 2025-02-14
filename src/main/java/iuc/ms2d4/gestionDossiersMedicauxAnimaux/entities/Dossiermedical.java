/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuc.ms2d4.gestionDossiersMedicauxAnimaux.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
/**
 *
 * @author IMPACT TECH
 */
@Entity
@Table(name = "dossiermedical", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Dossiermedical.findAll", query = "SELECT d FROM Dossiermedical d"),
    @NamedQuery(name = "Dossiermedical.findByIdDossiermedical", query = "SELECT d FROM Dossiermedical d WHERE d.idDossiermedical = :idDossiermedical"),
    @NamedQuery(name = "Dossiermedical.findByDatecreation", query = "SELECT d FROM Dossiermedical d WHERE d.datecreation = :datecreation")})
public class Dossiermedical implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DOSSIERMEDICAL", nullable = false)
    private Integer idDossiermedical;
    @Basic(optional = false)
    @Column(name = "DATECREATION", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datecreation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDossiermedical")
    private List<Vaccin> vaccinList;
    @JoinColumn(name = "ID_ANIMAL_POSSEDE", referencedColumnName = "ID_ANIMAL", nullable = false)
    @ManyToOne(optional = false)
    private Animal idAnimalPossede;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDossiermedical")
    private List<Consultation> consultationList;

    public Dossiermedical() {
    }

    public Dossiermedical(Integer idDossiermedical) {
        this.idDossiermedical = idDossiermedical;
    }

    public Dossiermedical(Integer idDossiermedical, Date datecreation) {
        this.idDossiermedical = idDossiermedical;
        this.datecreation = datecreation;
    }

    public Integer getIdDossiermedical() {
        return idDossiermedical;
    }

    public void setIdDossiermedical(Integer idDossiermedical) {
        this.idDossiermedical = idDossiermedical;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    
    public List<Vaccin> getVaccinList() {
        return vaccinList;
    }

    public void setVaccinList(List<Vaccin> vaccinList) {
        this.vaccinList = vaccinList;
    }

    public Animal getIdAnimalPossede() {
        return idAnimalPossede;
    }

    public void setIdAnimalPossede(Animal idAnimalPossede) {
        this.idAnimalPossede = idAnimalPossede;
    }

    
    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDossiermedical != null ? idDossiermedical.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dossiermedical)) {
            return false;
        }
        Dossiermedical other = (Dossiermedical) object;
        if ((this.idDossiermedical == null && other.idDossiermedical != null) || (this.idDossiermedical != null && !this.idDossiermedical.equals(other.idDossiermedical))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Dossiermedical[ idDossiermedical=" + idDossiermedical + " ]";
    }
    
}
