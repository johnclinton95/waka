package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import service.AnnonceService;
import dto.*;
import modele.Annonce;

@RestController
@RequestMapping("/annonces")
@ResponseBody
public class AnnonceController {
    
    private final AnnonceService annonceService;
    
    @Autowired
    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }

    @GetMapping("/tous-annonces")
    public List<Annonce> getAllUserAnnonces(){
        return this.annonceService.getAllAnnonces();
    }
    
    @PostMapping("/annonce")
    public ResponseEntity<AnnonceDto> ajouterAnnonce(@RequestBody AnnonceDto annonceDto) {
        AnnonceDto annonceAjoutee = annonceService.ajouterAnnonce(annonceDto);
        return ResponseEntity.ok(annonceAjoutee);
    }
    
}
