package it.itis.cuneo;

import java.lang.String;

public class Persona {
    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    public Persona(int eta, String nome, String sesso, String professione){
        this.eta = eta;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    public int getEta(){
        return eta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSesso(String sesso){
        this.sesso = sesso;
    }

    public String getSesso(){
        return sesso;
    }

    public void setProfessione(String professione){
        this.professione = professione;
    }

    public String getProfessione(){
        return professione;
    }

    public Persona chiSei(){
        Persona ris = new Persona(this.eta, this.nome, this.sesso, this.professione);
        return ris;

    }

    public static void main(String[] args) {
        Persona persona = new Persona(19, "mihai", "maschio", "studente");
        Persona persona1 = persona.chiSei();
        System.out.println("persona:\n" + "età:" + persona1.getEta() + "\n" + "nome:" + persona1.getNome() + "\n" + "sesso:" + persona1.getSesso() + "\n" + "professione:" + persona1.getProfessione());

    }
}
