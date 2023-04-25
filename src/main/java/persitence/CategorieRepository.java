package persitence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import modele.*;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    
    Optional<Categorie> findById(Long categoryId);
    Categorie save(Categorie categorie);
    List<Categorie> findByCategorieParente(Categorie categorieParente);
}