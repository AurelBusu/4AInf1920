package it.itis.cuneo;

public class Rettangolo extends Segmento {
    private int rettangolo;

    public Rettangolo(int segmento, int segmento2, int segmento3, int segmento4){
    }

    public Rettangolo(){
    }

    public Rettangolo(int rettangolo){
        this.rettangolo = rettangolo;
    }

    public void setRettangolo(int rettangolo){
        this.rettangolo = rettangolo;
    }

    public int getRettangolo(){
        return rettangolo;
    }

    public Rettangolo calcolaArea(Segmento segmento, Segmento segmento2, Segmento segmento3, Segmento segmento4){
        Rettangolo ris = new Rettangolo((segmento.getSegmento() + segmento2.getSegmento()) * 2);
        return ris;
    }

    public static void main(String[] args) {
        Segmento segmento = new Segmento(3);
        Segmento segmento2 = new Segmento(5);
        Segmento segmento3 = new Segmento(3);
        Segmento segmento4 = new Segmento(5);
        Rettangolo rettangolo = new Rettangolo();
        Rettangolo area = rettangolo.calcolaArea(segmento, segmento2, segmento3, segmento4);
        System.out.println("l'area del rettangolo vale:" + area.getRettangolo());
    }
}
