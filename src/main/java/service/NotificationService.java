package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import modele.*;
@Service
public class NotificationService {
    @Autowired
    private JavaMailSender mailSender;

    public void notifier(Utilisateur utilisateur, Annonce annonce) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(utilisateur.getEmail());
        message.setSubject("Nouvelle annonce correspondante à votre alerte");
        message.setText("Une nouvelle annonce a été publiée correspondant à votre alerte : " 
            + annonce.getTitre() + " - " + annonce.getPrix() + "€");
        mailSender.send(message);
    }
}
   
