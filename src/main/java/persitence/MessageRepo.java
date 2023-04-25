package persitence;

    import java.util.List;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    
    import modele.*;
    
    @Repository
    public interface MessageRepo extends  JpaRepository<Message, Long> {
        
        List<Message> findByAnnonce(Annonce annonce);
        
        List<Message> findByUtilisateur(Utilisateur utilisateur);
        
        List<Message> findByAnnonceAndUtilisateur(Annonce annonce, Utilisateur utilisateur);
        void save(Message message);
    }