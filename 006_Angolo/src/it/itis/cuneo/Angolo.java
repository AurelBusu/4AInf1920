package it.itis.cuneo;

public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(int gradi, int primi, int secondi){
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public void setGradi(int gradi){
        this.gradi = gradi;
    }

    public int getGradi(){
        return gradi;
    }

    public void setPrimi(int primi){
        this.primi = primi;
    }

    public int getPrimi(){
        return primi;
    }

    public void setSecondi(int secondi){
        this.secondi = secondi;
    }

    public int getSecondi(){
        return secondi;
    }

    public String toString(){
        return ("angolo{\n" + "\tgradi:" + this.gradi + "\n\t" + "primi:" + this.primi + "\n\t" + "secondi:" + this.secondi + "\n}");
    }

    public Angolo aggiungiGradi(){
        Angolo ris = new Angolo(this.gradi + 20, this.primi + 5, this.secondi + 3);
        return ris;
    }

    public Angolo differenzaSecondi(Angolo angolo){
        Angolo ris = new Angolo(0, 0, this.secondi - angolo.getSecondi());
        return ris;
    }

    public Angolo somma(Angolo angolo){
        Angolo ris = new Angolo(this.gradi + angolo.getGradi(), this.primi + angolo.getPrimi(), this.secondi + angolo.getSecondi());
        return ris;
    }

    public void controlloGradi(){
        if(this.getGradi() < 1 || this.getGradi() > 360){
            System.out.println("errore, gradi non compresi tra 1 e 360");
            System.exit(1);
        }
    }

    public void controlloPrimi(){
        if(this.getPrimi() < 1 || this.getPrimi() > 60){
            System.out.println("errore, i primi non sono compresi tra 1 e 60");
            System.exit(1);
        }
    }

    public void controlloSecondi(){
        if(this.getSecondi() < 1 || this.getSecondi() > 60){
            System.out.println("errore, i secondi non sono compresi tra 1 e 60");
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        Angolo angolo = new Angolo(120, 10, 10);
        Angolo angolo1 = new Angolo(0, 0, 0);
        Angolo angolo2 = new Angolo(100, 24, 31);
        angolo.controlloGradi();
        angolo.controlloPrimi();
        angolo.controlloSecondi();
        System.out.println(angolo);
        System.out.println("nuovo " + angolo.aggiungiGradi());
        System.out.println("differenza secondi:" + angolo.differenzaSecondi(angolo2));
        System.out.println("somma " + angolo.somma(angolo2));

    }
}
