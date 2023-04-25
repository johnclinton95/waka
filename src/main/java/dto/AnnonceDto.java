package dto;

import java.time.LocalDateTime;

public class AnnonceDto {
    
        private Long id;
        
        private String titre;
        
        private String description;
        
        private double prix;
        
        private LocalDateTime datePublication;
        
        private Long categorieId;
        
        private Long utilisateurId;
        
        // Constructeurs
        
        public AnnonceDto() {}
        
        public AnnonceDto(String titre, String description, double prix, LocalDateTime datePublication, Long categorieId, Long utilisateurId) {
            this.titre = titre;
            this.description = description;
            this.prix = prix;
            this.datePublication = datePublication;
            this.categorieId = categorieId;
            this.utilisateurId = utilisateurId;
        }
        
        // Getters et setters
        
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
        
        public LocalDateTime getDatePublication() {
            return datePublication;
        }
        
        public void setDatePublication(LocalDateTime datePublication) {
            this.datePublication = datePublication;
        }
        
        public Long getCategorieId() {
            return categorieId;
        }
        
        public void setCategorieId(Long categorieId) {
            this.categorieId = categorieId;
        }
        
        public Long getUtilisateurId() {
            return utilisateurId;
        }
        
        public void setUtilisateurId(Long utilisateurId) {
            this.utilisateurId = utilisateurId;
        }
        
    }
    