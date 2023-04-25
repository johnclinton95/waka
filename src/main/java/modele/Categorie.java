package modele;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String nom;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie_parente_id")
    private Categorie categorieParente;
    
    @OneToMany(mappedBy = "categorieParente", cascade = CascadeType.ALL)
    private List<Categorie> categoriesEnfants = new ArrayList<>();

    public Categorie() {}

    public Categorie(String nom, Categorie categorieParente) {
        this.nom = nom;
        this.categorieParente = categorieParente;
    }

    // Getters et setters pour chaque attribut

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorieParente() {
        return categorieParente;
    }

    public void setCategorieParente(Categorie categorieParente) {
        this.categorieParente = categorieParente;
    }

    public List<Categorie> getCategoriesEnfants() {
        return categoriesEnfants;
    }

    public void setCategoriesEnfants(List<Categorie> categoriesEnfants) {
        this.categoriesEnfants = categoriesEnfants;
    }
    
    public void addCategorieEnfant(Categorie categorieEnfant) {
        categoriesEnfants.add(categorieEnfant);
        categorieEnfant.setCategorieParente(this);
    }
}
