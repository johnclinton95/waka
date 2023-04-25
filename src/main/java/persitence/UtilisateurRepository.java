package persitence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modele.Utilisateur;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    
   Optional <Utilisateur> findById(Long utilusitateurId);
    void delete(Utilisateur user);
    Utilisateur save(Utilisateur utilisateur);
    
}
