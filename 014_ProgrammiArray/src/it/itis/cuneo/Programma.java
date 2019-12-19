package it.itis.cuneo;


public class Programma {
    private String denominazione;
    private String produttore;
    private int versione;
    private String sistemaOperativo;
    private int anno;

    public Programma(String denominazione, String produttore, int versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }

    public Programma(Programma p){
        this.denominazione = p.getProduttore();
        this.produttore = p.getProduttore();
        this.versione = p.getVersione();
        this.sistemaOperativo = p.getSistemaOperativo();
        this.anno = p.getAnno();
    }

    public Programma() {

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

    public int getVersione() {
        return versione;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Programma{" +
                "denominazione='" + denominazione + '\'' +
                ", produttore='" + produttore + '\'' +
                ", versione=" + versione +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", anno=" + anno +
                '}';
    }

    public boolean equals(Programma programma) {
        boolean ris = false;
        if(this.anno == programma.getAnno())
            ris = true;
        return ris;
    }

    public static void main(String[] args) {
        Programma programma = new Programma("java","marco",1,"linux",1997);
        Programma programma1 = new Programma("c","felipe",2,"linux",1997);
        System.out.println("sono uguali-->" + programma.equals(programma1));
        System.out.println(programma.toString());
    }

}
