package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persitence.*;
import dto.*;
import modele.*;
import exception.*;
@Service
public class AnnonceService {
    
    private final AnnonceRepository annonceRepository;
    private final CategorieRepository categorieRepository;
    private final UtilisateurRepository utilisateurRepository;
    
    @Autowired
    public AnnonceService(AnnonceRepository annonceRepository, CategorieRepository categorieRepository, UtilisateurRepository utilisateurRepository) {
        this.annonceRepository = annonceRepository;
        this.categorieRepository = categorieRepository;
        this.utilisateurRepository = utilisateurRepository;
    }
    
    public AnnonceDto ajouterAnnonce(AnnonceDto annonceDto) {
        Categorie categorie = categorieRepository.findById(annonceDto.getCategorieId()).orElseThrow(() -> new NoSuchElementException(annonceDto.getCategorieId()));
        Utilisateur utilisateur = utilisateurRepository.findById(annonceDto.getUtilisateurId()).orElseThrow(() -> new UtilisateurNotFoundException(annonceDto.getUtilisateurId()));
        
        Annonce annonce = new Annonce();
        annonce.setTitre(annonceDto.getTitre());
        annonce.setDescription(annonceDto.getDescription());
        annonce.setPrix(annonceDto.getPrix());
        annonce.setCategorie(categorie);
        annonce.setUtilisateur(utilisateur);
        
        annonce = annonceRepository.save(annonce);
        
        annonceDto.setId(annonce.getId());
        annonceDto.setDatePublication(annonce.getDatePublication());
        
        return annonceDto;
    }

    public List<Annonce> getAllAnnonces(){
        return this.annonceRepository.findAll();
    }
    
}
