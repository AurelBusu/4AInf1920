package it.itis.cuneo;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){

    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public  String toString(){
        return ("punto:\n" + "\tcoordinata x:" + this.x + "\n" + "\tcoordinata y:" + this.y + "\n");
    }

    public boolean equals(Punto punto1, Punto punto2, Punto punto3){
        boolean ris = false;
        if(this.x == punto1.getX() && punto1.getY() == punto2.getY() && punto2.getX() == punto3.getX() && punto3.getY() == this.y) {
            ris = true;
        }else{
            System.out.println("ERRORE, non è un rettangolo");
            System.exit(1);
        }
        return ris;
    }

    public static void main(String[] args) {
        Punto punto = new Punto(4, 5);
        Punto punto1 = new Punto(5, 2);
        Punto punto2 = new Punto(9,2);
        Punto punto3 = new Punto(9,5);
        boolean uguali = punto.equals(punto1, punto2, punto3);
        System.out.println(punto);
        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);
        System.out.println("E' un rettangolo? --->" + uguali);
    }
}

