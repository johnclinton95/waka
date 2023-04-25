package modele;

import java.util.List;

public class Utilisateur {
private int id;
private String nom;
private String prenom;
private String email;
private String motDePasse;
private List<Annonce> annonces;

public Utilisateur() {}

public Utilisateur(int id, String nom, String prenom, String email, String motDePasse, List<Annonce> annonces) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.motDePasse = motDePasse;
    this.annonces = annonces;
}

// Getters et setters pour chaque attribut

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public String getPrenom() {
    return prenom;
}

public void setPrenom(String prenom) {
    this.prenom = prenom;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getMotDePasse() {
    return motDePasse;
}

public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
}

public List<Annonce> getAnnonces() {
    return annonces;
}

public void setAnnonces(List<Annonce> annonces) {
    this.annonces = annonces;
}
}