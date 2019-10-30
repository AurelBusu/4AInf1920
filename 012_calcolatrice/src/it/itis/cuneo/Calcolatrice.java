package it.itis.cuneo;

import java.util.*;

public class Calcolatrice {
    private int s;
    private int d;

    public Calcolatrice(int s, int d) {
        this.s = s;
        this.d = d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public int somma(int s, int d) {
        int somma = s + d;
        return somma;
    }

    public int sottrazione(int s, int d) {
        int sottrazione = s - d;
        return sottrazione;
    }

    public int moltiplicazione(int s, int d) {
        int moltiplicazione = s * d;
        return moltiplicazione;
    }

    public int divisione(int s, int d) {
        int divisione = s / d;
        return divisione;
    }

    public static void main(String args[]) {
        System.out.println("inserire primo numero:");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println("inserire secondo numero:");
        Scanner input2 = new Scanner(System.in);
        int d = input2.nextInt();
        Calcolatrice c = new Calcolatrice(s, d);
        System.out.println("somma:" + c.somma(s, d));
        System.out.println("sottrazione:" + c.sottrazione(s, d));
        System.out.println("moltiplicazione:" + c.moltiplicazione(s, d));
        System.out.println("divisione:" + c.divisione(s, d));
    }
}