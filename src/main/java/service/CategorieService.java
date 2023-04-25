package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persitence.CategorieRepository;
import modele.*;

@Service
public class CategorieService {
    private final CategorieRepository categorieRepository;
    
    @Autowired
    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }
    
    public Categorie getCategorieParNom(Long id) {
        Optional<Categorie> optionalCategorie = categorieRepository.findById(id);
        return optionalCategorie.orElse(null);
    }
    
    public List<Categorie> getCategoriesEnfants(Categorie categorieParente) {
        return categorieRepository.findByCategorieParente(categorieParente);
    }
}





