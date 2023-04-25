package persitence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modele.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
    
    List<Annonce> findByUtilisateurId(Long utilisateurId);
    public <S extends Annonce> S save(S annonce);
    List<Annonce> findByCategorieId(Long categorieId);
    
}