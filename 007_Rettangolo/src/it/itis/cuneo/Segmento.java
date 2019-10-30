package it.itis.cuneo;

public class Segmento extends Punto{
    private int segmento;

    public Segmento(int x , int y){
        super(x, y);
    }

    public Segmento(int segmento) {
        this.segmento = segmento;
    }

    public Segmento(){

    }

    public void setSegmento(int segmento){
        this.segmento = segmento;
    }

    public int getSegmento(){
        return segmento;
    }

    public int calcoloDistanza(Punto punto, Punto punto2){
            int ris = 0;
            ris = punto.getY() - punto2.getY();
            return ris;
    }

    public int calcoloDistanza2(Punto punto2, Punto punto3){
        int ris = punto3.getX() - punto2.getX();
        return ris;
    }

    public int calcoloDistanza3(Punto punto3, Punto punto4){
        int ris = punto4.getY() - punto3.getY();
        return ris;
    }

    public int calcoloDistanza4(Punto punto4, Punto punto){
        int ris = punto4.getX() - punto.getX();
        return ris;
    }

    public static void main(String[] args) {
        Punto punto = new Punto(4, 5);
        Punto punto2 = new Punto(4, 2);
        Punto punto3 = new Punto(9,2);
        Punto punto4 = new Punto(9,5);
        Segmento segmento = new Segmento();
        Segmento segmento2 = new Segmento();
        Segmento segmento3 = new Segmento();
        Segmento segmento4 = new Segmento();
        int distanza1 =  segmento.calcoloDistanza(punto, punto2);
        int distanza2 = segmento2.calcoloDistanza2(punto2, punto3);
        int distanza3 = segmento3.calcoloDistanza3(punto3, punto4);
        int distanza4 = segmento4.calcoloDistanza4(punto4, punto);
        System.out.println(" 1 segmento:" + distanza1);
        System.out.println(" 2 segmento:" + distanza2);
        System.out.println(" 3 segmento:" + distanza3);
        System.out.println(" 4 segmento:" + distanza4);
    }
}
