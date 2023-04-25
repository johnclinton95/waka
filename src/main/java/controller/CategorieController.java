package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import modele.Categorie;
import service.CategorieService;

@RestController
@RequestMapping("/categories")
public class CategorieController {
    private final CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService){
        this.categorieService = categorieService;
    }
    
    @GetMapping("/categorie/{id}")
    public Categorie getCategorieById(@PathVariable Long  id){
        return this.categorieService.getCategorieParNom(id);
    }
   
}
