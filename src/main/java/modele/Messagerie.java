package modele;

import java.util.List;
import javax.persistence.*;
import jakarta.mail.Message;


@Entity
public class Messagerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "annonce_id")
    private Annonce annonce;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur1_id")
    private Utilisateur utilisateur1;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur2_id")
    private Utilisateur utilisateur2;
    
    @OneToMany(mappedBy = "messagerie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> messages;

    public Messagerie() {}

    public Messagerie(Annonce annonce, Utilisateur utilisateur1, Utilisateur utilisateur2) {
        this.annonce = annonce;
        this.utilisateur1 = utilisateur1;
        this.utilisateur2 = utilisateur2;
    }

    // Getters et setters pour chaque attribut

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
