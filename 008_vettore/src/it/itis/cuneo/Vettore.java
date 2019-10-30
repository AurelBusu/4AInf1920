package it.itis.cuneo;

import java.lang.Math;

public class Vettore {
    private Punto punto1;
    private Punto punto2;

    public Vettore(Punto punto1, Punto punto2){
        this.punto1 = new Punto(punto1);
        this.punto2 = new Punto(punto2);
    }

    public Vettore(Vettore v){
        this.punto1 = new Punto(v.getPunto1());
        this.punto2 = new Punto(v.getPunto2());
    }

    public void setPunto1(Punto punto1){
        this.punto1 = new Punto(punto1);
    }

    public Punto getPunto1(){
        return punto1;
    }

    public void setPunto2(Punto punto2){
        this.punto2 = new Punto(punto2);
    }

    public Punto getPunto2(){
        return punto2;
    }

    public boolean equals(Vettore vettore){
        boolean ris = false;
        if(this.punto1.equals(vettore.getPunto1()) && this.punto2.equals(vettore.getPunto2())){
            ris = true;
        }
        return ris;
    }

    public double distanza(){
        return (Math.sqrt((punto1.getX() - punto2.getX()) * (punto1.getX() - punto2.getX()) + (punto1.getY() - punto2.getY()) * (punto1.getY() - punto2.getY())));
    }

    public static void main(String[] args) {

        Punto puntoA = new Punto(4, 7);
        Punto puntoB = new Punto(3, 6);
        Punto puntoC = new Punto(4, 8);
        Punto puntoD = new Punto(6, 1);

        Vettore vettore1 = new Vettore(puntoA, puntoB);
        Vettore vettore2 = new Vettore(puntoC, puntoD);

        System.out.println(puntoA);
        System.out.println(puntoB);
        System.out.println(puntoC);
        System.out.println(puntoD);

        boolean uguali = vettore1.equals(vettore2);
        System.out.println("vettore1 == vettore2 -->" + uguali);

        System.out.println("distanza vettore1:" + vettore1.distanza());
        System.out.println("distanza vettore2:" + vettore2.distanza());
    }
}
