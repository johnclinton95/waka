package com.mboa.waka;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.notNull;



import persitence.AnnonceRepository;
import persitence.CategorieRepository;
import persitence.MessageRepo;
import persitence.UtilisateurRepository;
import service.AnnonceService;
import service.CategorieService;
import service.MessageService;
import service.UtilisateurService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
class WakaApplicationTests {

	@Test
	void contextLoads() {
		 final AnnonceRepository annonceRepository = notNull();
		 final CategorieRepository categorieRepository=notNull();
		 final MessageRepo messageRepo= notNull();
		 final UtilisateurRepository utilisateurRepository = notNull();

		CategorieService categorieService = new CategorieService(categorieRepository);
		assertNotNull(categorieService);

		AnnonceService annonceService = new AnnonceService(annonceRepository, categorieRepository, utilisateurRepository);
		assertNotNull(annonceService);
		
		MessageService messageService = new MessageService(messageRepo);
		assertNotNull(messageService);

		UtilisateurService utilisateurService = new UtilisateurService();
		assertNotNull(utilisateurService);


	}
}