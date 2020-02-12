public class Operation1 extends Thread {

    Buffer dati;
    private double k;
    private double parziale;

    public Operation1(Buffer buffer) {
        dati = buffer;
        k = dati.a;
    }

    @Override
    public void run() {
        dati.x = 4 * (k-2) + 5;
    }
}