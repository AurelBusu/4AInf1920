public class Operation2 {
    Buffer dati;
    private double k2;

    public Operation2(Buffer buffer) {
        dati = buffer;
        k2 = dati.b;
    }

    @Override
    public void run() {
        dati.z = 2*(k2-3) +4;
    }
}
