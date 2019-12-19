package it.itis.cuneo;

public class Ville extends Abitazione {
    private int numPiani;
    private float superficieGiardino;
    private String piscina;

    public Ville(){
        super();
    }

    //Abitazione abitazione = new Abitazione();

    public Ville(int numStanze, float superficie, String indirizzo, String citta, int numPiani, float superficieGiardino, String piscina){
        super(numStanze, superficie, indirizzo, citta);
        this.numPiani = numPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public int getNumPiani() {
        return numPiani;
    }

    public void setNumPiani(int numPiani) {
        this.numPiani = numPiani;
    }

    public float getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(float superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Ville{" +"numStanze=" + super.toString() +
                ", numPiani=" + numPiani +
                ", superficieGiardino=" + superficieGiardino +
                ", piscina='" + piscina + '\'' +
                '}';
    }

    public void caricaVilla(){
        caricaAbitazione();
        numPiani = InputOutputUtility.leggiNumero("inserire il numero di piani:");
        superficieGiardino = InputOutputUtility.leggiNumeroFloat("inserire la dimensione del giardino:");
        piscina = InputOutputUtility.leggiNome("scrive (SI) se hanno una psicina , (NO) se non lo hanno:");
    }
}
