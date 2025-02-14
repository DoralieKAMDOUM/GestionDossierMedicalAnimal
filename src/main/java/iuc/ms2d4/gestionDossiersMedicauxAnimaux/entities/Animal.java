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
 * @author IMPACT TECH
 */
@Entity
@Table(name = "animal", catalog = "gestanimaux", schema = "")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a"),
    @NamedQuery(name = "Animal.findByIdAnimal", query = "SELECT a FROM Animal a WHERE a.idAnimal = :idAnimal"),
    @NamedQuery(name = "Animal.findByAgeAnimal", query = "SELECT a FROM Animal a WHERE a.ageAnimal = :ageAnimal")})
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ANIMAL", nullable = false)
    private Integer idAnimal;
    @Basic(optional = false)
    @Lob
    @Column(name = "NOM_ANIMAL", nullable = false, length = 65535)
    private String nomAnimal;
    @Basic(optional = false)
    @Column(name = "AGE_ANIMAL", nullable = false)
    private long ageAnimal;
    @Basic(optional = false)
    @Lob
    @Column(name = "SEXE_ANIMAL", nullable = false, length = 65535)
    private String sexeAnimal;
    @Basic(optional = false)
    @Lob
    @Column(name = "COULEUR_ANIMAL", nullable = false, length = 65535)
    private String couleurAnimal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnimalPossede")
    private List<Dossiermedical> dossiermedicalList;
    @JoinColumn(name = "ID_ESPECE", referencedColumnName = "ID_ESPECE", nullable = false)
    @ManyToOne(optional = false)
    private Espece idEspece;
    @JoinColumn(name = "ID_PROPRIETAIRE", referencedColumnName = "ID_PROPRIETAIRE", nullable = false)
    @ManyToOne(optional = false)
    private Proprietaire idProprietaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnimal")
    private List<Rendezvous> rendezvousList;

    public Animal() {
    }

    public Animal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Animal(Integer idAnimal, String nomAnimal, long ageAnimal, String sexeAnimal, String couleurAnimal) {
        this.idAnimal = idAnimal;
        this.nomAnimal = nomAnimal;
        this.ageAnimal = ageAnimal;
        this.sexeAnimal = sexeAnimal;
        this.couleurAnimal = couleurAnimal;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public long getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(long ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getSexeAnimal() {
        return sexeAnimal;
    }

    public void setSexeAnimal(String sexeAnimal) {
        this.sexeAnimal = sexeAnimal;
    }

    public String getCouleurAnimal() {
        return couleurAnimal;
    }

    public void setCouleurAnimal(String couleurAnimal) {
        this.couleurAnimal = couleurAnimal;
    }

    public List<Dossiermedical> getDossiermedicalList() {
        return dossiermedicalList;
    }

    public void setDossiermedicalList(List<Dossiermedical> dossiermedicalList) {
        this.dossiermedicalList = dossiermedicalList;
    }

    public Espece getIdEspece() {
        return idEspece;
    }

    public void setIdEspece(Espece idEspece) {
        this.idEspece = idEspece;
    }

    public Proprietaire getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(Proprietaire idProprietaire) {
        this.idProprietaire = idProprietaire;
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
        hash += (idAnimal != null ? idAnimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iuc.ms2d4.gestionDossiersMedicauxAnimaux.Animal[ idAnimal=" + idAnimal + " ]";
    }
    
}
