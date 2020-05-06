public class Main {

    public static void main(String[] args) {
        int contatore = 20;
        Semaforo semaforo = new Semaforo();
        ThreadDecrementatore th1 = new ThreadDecrementatore(semaforo,1);
        ThreadDecrementatore th2 = new ThreadDecrementatore(semaforo,2);
        ThreadDecrementatore th3 = new ThreadDecrementatore(semaforo,3);
        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Contatore:" + semaforo.contatore);
    }
}