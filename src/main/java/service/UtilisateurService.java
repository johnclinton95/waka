package service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.*;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;


import dto.UtilisateurDto;
import modele.*;
import persitence.UtilisateurRepository;
import exception.*;
import jakarta.annotation.PostConstruct;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private ResourceLoader resourceLoader;


    public Utilisateur createUtilisateur(UtilisateurDto utilisateurDto) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur updateUtilisateur(Long id, UtilisateurDto utilisateurDto) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepository.findById(id);
        if (optionalUtilisateur.isPresent()) {
            Utilisateur utilisateur = optionalUtilisateur.get();
            utilisateur.setNom(utilisateurDto.getNom());
            utilisateur.setPrenom(utilisateurDto.getPrenom());
            utilisateur.setEmail(utilisateurDto.getEmail());
            utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
            return utilisateurRepository.save(utilisateur);
        } else {
            throw new UtilisateurNotFoundException(id);
        }
    }

    public void deleteUtilisateur(Long id) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepository.findById(id);
        if (optionalUtilisateur.isPresent()) {
            utilisateurRepository.delete(optionalUtilisateur.get());
        } else {
            throw new UtilisateurNotFoundException(id);
        }
    }

    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateurById(Long id) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepository.findById(id);
        if (optionalUtilisateur.isPresent()) {
            return optionalUtilisateur.get();
        } else {
            throw new UtilisateurNotFoundException(id);
        }
    }
    @PostConstruct
    public void init(){
        try{

            Resource resource= resourceLoader.getResource("utilisateurs.json");
            InputStream inputStream = resource.getInputStream();
            ObjectMapper objectMapper = new ObjectMapper();

        }catch(IOException e)
        {
          throw new RuntimeException("error du chargement des utilisateurs");
        }
    }
}
