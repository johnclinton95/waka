package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import modele.*;
import persitence.*;

import java.util.List;
//import java.util.Optional;

@Service
public class MessageService {
    
    private final MessageRepo messageRepository;
    
    @Autowired
    public MessageService(MessageRepo messageRepository) {
        this.messageRepository = messageRepository;
    }
    
    public List<Message> getMessagesPourAnnonce(Annonce annonce) {
        return messageRepository.findByAnnonce(annonce);
    }
    
    public List<Message> getMessagesDeUtilisateur(Utilisateur utilisateur) {
        return messageRepository.findByUtilisateur(utilisateur);
    }
    
    public List<Message> getMessagesPourAnnonceEtDeUtilisateur(Annonce annonce, Utilisateur utilisateur) {
        return messageRepository.findByAnnonceAndUtilisateur(annonce, utilisateur);
    }
    
    public void enregistrerMessage(Message message) {
      //  messageRepository.save(message);
    }
}