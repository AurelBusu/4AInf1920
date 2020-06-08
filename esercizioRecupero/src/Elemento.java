public class Elemento {

    private int id;
    private int numeroCasuale;
    private int numSequenza;

    public Elemento(int id, int numeroCasuale, int numSequenza) {
        this.id = id;
        this.numeroCasuale = numeroCasuale;
        this.numSequenza = numSequenza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCasuale() {
        return numeroCasuale;
    }

    public void setNumeroCasuale(int numeroCasuale) {
        this.numeroCasuale = numeroCasuale;
    }

    public int getNumSequenza() {
        return numSequenza;
    }

    public void setNumSequenza(int numSequenza) {
        this.numSequenza = numSequenza;
    }
}
