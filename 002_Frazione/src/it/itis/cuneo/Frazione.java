package it.itis.cuneo;

public class Frazione {
    private int num;
    private int den;

    public Frazione(int num, int den){
        this.num = num;
        this.den = den;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public void setDen(int den){
        this.den = den;
    }

    public int getDen(){
        return den;
    }

    public String toString(){
        return "Frazione { num:" + this.num + ", den:" + this.den + "}";
    }

    public Frazione somma(Frazione frazione){
        Frazione frazioneRis = new Frazione(this.num + frazione.getNum(), this.den + frazione.getDen());
        return frazioneRis;
    }

    public Frazione sottrazione(Frazione frazione){
        Frazione frazioneRis = new Frazione(this.num - frazione.getNum(), this.den - frazione.getDen());
        return frazioneRis;
    }

    public Frazione moltiplicazione(Frazione frazione){
        Frazione frazioneRis = new Frazione(this.num * frazione.getNum(), this.den * frazione.getDen());
        return frazioneRis;
    }

    public Frazione divisone(Frazione frazione){
        Frazione frazioneRis = new Frazione(this.num / frazione.getNum(), this.den / frazione.getDen());
        return frazioneRis;
    }

    public Frazione reciproco(){
        Frazione frazioneRis = new Frazione(this.den, this.num);
        return frazioneRis;
    }

    public Frazione semplificazione(Frazione FrazioneSomma){
        Frazione frazioneRis = new Frazione(FrazioneSomma.getNum() / 2, FrazioneSomma.getDen() / 2);
        return frazioneRis;
    }
    public static void main(String args[]){
        Frazione frazione = new Frazione(4, 5);
        Frazione frazione1 = new Frazione(2, 3);
        Frazione frazioneSomma = new Frazione(0, 0);
        Frazione frazioneSottrazione = new Frazione(0, 0);
        Frazione frazioneMoltiplicazione = new Frazione(0, 0);
        Frazione frazioneDivisione = new Frazione(0, 0);
        Frazione frazioneReciproco = new Frazione(0, 0);
        Frazione frazioneSemplificazione = new Frazione(0, 0);
        frazioneSomma = frazione.somma(frazione1);
        frazioneSottrazione = frazione.sottrazione(frazione1);
        frazioneMoltiplicazione = frazione.moltiplicazione(frazione1);
        frazioneDivisione = frazione.divisone(frazione1);
        frazioneReciproco = frazione.reciproco();
        frazioneSemplificazione = frazione.semplificazione(frazioneSomma);
        System.out.println(frazione);
        System.out.println(frazione1);
        System.out.println("Frazione somma:\n" + "num:" + frazioneSomma.getNum()  + ", den:" + frazioneSomma.getDen());
        System.out.println("Frazione sottrazione:\n" + "num:" + frazioneSottrazione.getNum()  + ", den:" + frazioneSottrazione.getDen());
        System.out.println("Frazione moltiplicazione:\n" + "num:" + frazioneMoltiplicazione.getNum()  + ", den:" + frazioneMoltiplicazione.getDen());
        System.out.println("Frazione divisone:\n" + "num:" + frazioneDivisione.getNum()  + ", den:" + frazioneDivisione.getDen());
        System.out.println("frazione reciproco:\n" + "num:" + frazioneReciproco.getNum() + ", den:" + frazioneReciproco.getDen());
        System.out.println("frazione semplificata:\n" + "num:" + frazioneSemplificazione.getNum() + ", den:" + frazioneSemplificazione.getDen());
    }
}
