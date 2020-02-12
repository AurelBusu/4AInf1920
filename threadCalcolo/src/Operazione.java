public class Operazione extends Thread{

    public static final double A = 2;
    public static final double B = 3;

    public Operazione(Buffer parziali) {
    }

    public static void main(String[] args) {
        Buffer parziali = new Buffer(A, B);

        Operazione th1 = new Operazione(parziali);
        Operazione th2 = new Operazione(parziali);
        Operazione th3 = new Operazione(parziali);

        th1.start();
        th2.start();
        th3.start();
        try {
            th3.join();
        } catch (InterruptedException e) {
        }
    }
}