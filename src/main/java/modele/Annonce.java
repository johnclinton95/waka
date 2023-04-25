package modele;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double prix;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie_id")

    @Column(nullable = false)
    private LocalDateTime datePublication;

    @Column(nullable = false)
    private String localisation;

    private Categorie categorie;

    @Column(nullable = false)
    private String images;

    @Column(nullable = false)
    private Utilisateur utilisateur;

    public Annonce() {}


    public Annonce(String titre, String description, double prix, Categorie categorie, String localisation, String images, Utilisateur utilisateur) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.categorie = categorie;
        this.localisation =localisation;
        this.images =images;
        this.utilisateur = utilisateur;
    }

    // Getters et setters pour chaque attribut

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getLocalisation(){
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public String getImages(){
        return images;
    }
    public LocalDateTime getDatePublication() {
        return datePublication;
    }
    
    public Utilisateur getUtilisateur(){
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur){
        this.utilisateur= utilisateur;
    }

}
