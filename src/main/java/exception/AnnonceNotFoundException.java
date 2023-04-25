package exception;

public class AnnonceNotFoundException extends RuntimeException{
        public AnnonceNotFoundException(Long id) {
            super("Annonce non trouvée avec l'ID : " + id);
        }
    }