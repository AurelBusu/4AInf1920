package it.itis.cuneo;

public class Abitazione {
    private int numStanze;
    private float superficie;
    private String indirizzo;
    private String citta;

    public Abitazione() {
    }

    public Abitazione(int numStanze, float superficie, String indirizzo, String citta) {
        super();
        this.numStanze = numStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public int getNumStanze() {
        return numStanze;
    }

    public void setNumStanze(int numStanze) {
        this.numStanze = numStanze;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Abitazione{" +
                "numStanze=" + numStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }

    public void caricaAbitazione(){
        numStanze = InputOutputUtility.leggiNumero("inserire numero di stanze:");
        superficie = InputOutputUtility.leggiNumeroFloat("inserire la superficie:");
        indirizzo = InputOutputUtility.leggiNome("inserire indirizzo:");
        citta = InputOutputUtility.leggiNome("inserire nome città:");
    }
}
