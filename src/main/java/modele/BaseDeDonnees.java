package modele;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDeDonnees {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BaseDeDonnees(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void fermer() {
        // Fermeture de la connexion à la base de données
    }

    public List<Annonce> getAnnonces() {
        String sql = "SELECT * FROM annonces";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int id = resultSet.getInt("id");
            String titre = resultSet.getString("titre");
            String description = resultSet.getString("description");
            double prix = resultSet.getDouble("prix");
            String categorie = resultSet.getString("categorie");
            String localisation = resultSet.getString("localisation");
            String images = resultSet.getString("images");
            String utilisateur = resultSet.getString("utilisateur");
            ///List<String> images = Arrays.asList(resultSet.getString("images").split(","));
            return new Annonce(titre, description, prix, new Categorie(), localisation, images, new Utilisateur());
            
        });
    }

    public void ajouterAnnonce(Annonce annonce) {
        String sql = "INSERT INTO annonces (id, titre, description, prix, categorie, localisation, images) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, annonce.getId(), annonce.getTitre(), annonce.getDescription(), annonce.getPrix(), annonce.getCategorie(), annonce.getLocalisation(), String.join(",", annonce.getImages()), annonce.getUtilisateur());
    }
}