package it.itis.cuneo;

public class Appartamento extends Abitazione {
    private int piano;
    private int numTerrazzi;

    public Appartamento(){
        super();
    }

    public Appartamento(int numStanze, float superficie, String indirizzo, String citta, int piano, int numTerrazzi){
        super(numStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.numTerrazzi = numTerrazzi;
    }


    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public int getNumTerrazzi() {
        return numTerrazzi;
    }

    public void setNumTerrazzi(int numTerrazzi) {
        this.numTerrazzi = numTerrazzi;
    }

    @Override
    public String toString() {
        return "Appartamento{" + super.toString()+
                "piano=" + piano +
                ", numTerrazzi=" + numTerrazzi +
                '}';
    }

    public void caricaAppartamento(){
        caricaAbitazione();
        piano = InputOutputUtility.leggiNumero("inserire piano in cui si trova:");
        numTerrazzi = InputOutputUtility.leggiNumero("inserire il numero di terrazzi:");
    }
}
