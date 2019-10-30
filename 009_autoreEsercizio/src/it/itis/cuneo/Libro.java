package it.itis.cuneo;

/**
 * Created by inf.busua0409 on 17/10/2019.
 */
public class Libro {
    private Autore aut;
    private CasaEditrice cas;
    private String libro;
    private int dataFondazione;

    public Libro(Autore aut1, CasaEditrice cas1, String libro, int dataFondazione){
        this.aut = new Autore(aut1);
        this.cas = new CasaEditrice(cas1);
        this.libro = libro;
        this.dataFondazione = dataFondazione;
    }

    public void setAut(Autore aut) {
        this.aut = new Autore(aut);
    }

    public Autore getAut() {
        return aut;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getLibro() {
        return libro;
    }

    public void setDataFondazione(int dataFondazione) {
        this.dataFondazione = dataFondazione;
    }

    public int getDataFondazione() {
        return dataFondazione;
    }

    public void setCas(CasaEditrice cas) {
        this.cas = new CasaEditrice(cas);
    }

    public CasaEditrice getCas() {
        return cas;
    }

    public String toString(){
        return    "" + aut + cas + "\nlibro:" + libro + "\nanno fondazione:" + dataFondazione;
    }

    public static void main(String[] args) {
        Autore autore = new Autore("Busu", "Aurel", 2000);
        CasaEditrice casaEditrice = new CasaEditrice("mondadori", "cuneo", 1957);
        Libro libro = new Libro(autore, casaEditrice, "pietro", 1975);
        System.out.println(libro);
    }
}