package it.itis.cuneo;

/**
 * Created by inf.busua0409 on 13/11/2019.
 */
public class Programma {
    private int codice;
    private String denominazione;
    private String produttore;
    private String sistemaOperativo;
    private int versione;
    private int anno;

    public Programma() {
    }

    public Programma(int codice, String denominazione, String produttore, String sistemaOperativo, int versione, int anno) {
        this.codice = codice;
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.sistemaOperativo = sistemaOperativo;
        this.versione = versione;
        this.anno = anno;
        }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getVersione() {
        return versione;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public boolean equals(Programma programma){
        boolean bUguali = false;

        if(programma != null
                && this.codice == programma.getCodice()
                && denominazione.equalsIgnoreCase(programma.getDenominazione())
                && produttore.equalsIgnoreCase(programma.getProduttore())
                && sistemaOperativo == programma.getSistemaOperativo()
                && anno == programma.getAnno())
            bUguali = true;
        return bUguali;
    }

    @Override
    public String toString() {
        return "Programma{" +
                "codice=" + codice +
                ", denominazione='" + denominazione + '\'' +
                ", produttore='" + produttore + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", versione=" + versione +
                ", anno=" + anno +
                '}';
    }

    public void caricaProgramma(){
        this.codice = InputOutputUtility.leggiNumero("\tInserire codice:");
        this.denominazione = InputOutputUtility.leggiNome("\tinserire denominazione:");
        this.produttore = InputOutputUtility.leggiNome("\tinserire il produttore:");
        this.sistemaOperativo = InputOutputUtility.leggiNome("\tinserire il sistema operativo:");
        this.versione = InputOutputUtility.leggiNumero("\tinserire una versione:");
        this.anno = InputOutputUtility.leggiNumero("\tinserire anno:");
        System.out.println("\n");
    }
}
