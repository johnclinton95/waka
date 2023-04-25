package modele;

import java.util.List;

public class Recherche {
    
    private int id;
    private String titre;
    private String description;
    private List<String> motsCles;
    private int prixMax;
    private int prixMin;
    private String localisation;
    private int rayon;

    public Recherche() {}

    public Recherche(int id, String titre, String description, List<String> motsCles, int prixMax, int prixMin, String localisation, int rayon) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.motsCles = motsCles;
        this.prixMax = prixMax;
        this.prixMin = prixMin;
        this.localisation = localisation;
        this.rayon = rayon;
    }

    // Getters et setters pour chaque attribut

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<String> getMotsCles() {
        return motsCles;
    }

    public void setMotsCles(List<String> motsCles) {
        this.motsCles = motsCles;
    }

    public int getPrixMax() {
        return prixMax;
    }

    public void setPrixMax(int prixMax) {
        this.prixMax = prixMax;
    }

    public int getPrixMin() {
        return prixMin;
    }

    public void setPrixMin(int prixMin) {
        this.prixMin = prixMin;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
}