package it.itis.cuneo;

import java.lang.Math;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto(){

    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public int quadrante(){
        int quadrante;
        if(y>0){
            if(x>0){
                quadrante = 1;
            }else{
                quadrante = 2;
            }
        }else{
                if(x>0){
                    quadrante = 4;
                }else{
                    quadrante = 3;
                }
            }
        return quadrante;
        }

        public String toString(){
        return ("Punto{x:"+ this.x + ", y:" + this.y + "}");
        }

        public boolean equals(Punto punto){
        boolean res = false;
        if(this.x == punto.getX() && this.y == punto.getY()){
            res = true;
        }
        return res;
        }

        public double distanza(Punto punto){
           return (Math.sqrt((this.x - punto.getX()) * (this.x - punto.getX()) + (this.y - punto.getY()) * (this.y - punto.getY())));
        }

    public static void main(String args[]){
        Punto punto = new Punto(8, -6);
        Punto punto1 = new Punto(4, 10);
        System.out.println(punto);
        System.out.println(punto1);
        int puntoQuadrante = punto.quadrante();
        int puntoQuadrante1 = punto1.quadrante();
        boolean puntoGenere = punto.equals(punto1);
        System.out.println("la distanza tra i due punti vale:" + punto.distanza(punto1));
        System.out.println("il primo punto si trova nel quadrante:" + puntoQuadrante);
        System.out.println("il secondo punto si trova nel quadrante:" + puntoQuadrante1);
        System.out.println("punto == punto1 ? ----> " + puntoGenere);

    }
}
