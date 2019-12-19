package it.itis.cuneo;

public class ContenitorePienoException extends Exception {
    private String descrizione;

    public ContenitorePienoException( String descrizione){
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "ContenitorePienoException{" +
                "descrizione='" + descrizione + '\'' +
                '}';
    }
}
