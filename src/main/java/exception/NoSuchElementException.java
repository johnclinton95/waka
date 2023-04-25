package exception;

public class NoSuchElementException  extends RuntimeException{

        public NoSuchElementException(Long id) {
            super("categorie non trouvé avec l'ID : " + id);
        }
    }