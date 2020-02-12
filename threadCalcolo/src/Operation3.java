public class Operation3 {
    Buffer dati;
    private double x, y, z;

    public Operation3(Buffer buffer) {
        dati = buffer;
        x = dati.a;
        z = dati.b;
    }

    @Override
    public void run() {
        dati.y = dati.x * dati.z;
        System.out.println("Operazione: " + dati.x + " " + dati.z + " = " + dati.y);
    }
}
