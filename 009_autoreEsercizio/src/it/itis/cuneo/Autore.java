package it.itis.cuneo;

/**
 * Created by inf.busua0409 on 17/10/2019.
 */
public class Autore {
    private String cognome;
    private String nome;
    private int annoNascita;

    public Autore(String cognome, String nome, int annoNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.annoNascita = annoNascita;
    }

    public Autore(Autore p){
        this.cognome = p.getCognome();
        this.nome = p.getNome();
        this.annoNascita = p.getAnnoNascita();
    }

    public Autore(){}

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCognomeNome(){
        return cognome + nome;
    }

    public String toString(){
        return "cognome:" + cognome + "\nnome:" + nome + "\nanno nascita:" + annoNascita;
    }

    public static void main(String[] args) {
        Autore a = new Autore("baba", "dede", 1992);

        System.out.println(a.toString());
    }
}
