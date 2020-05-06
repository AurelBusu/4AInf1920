public class ThreadDecrementatore extends Thread {
    private int totale;
    private int num;
    private Semaforo semaforo;

    public ThreadDecrementatore() {
    }

    public ThreadDecrementatore(Semaforo semaforo, int num) {
        this.num = num;
        this.semaforo = semaforo;
    }

    public int getTotale() {
        return totale;
    }

    public void setTotale(int totale) {
        this.totale = totale;
    }

    @Override
    public void run() {
        while(semaforo.contatore >= 1){
            System.out.println("Thread " + num +": --> Contatore Prima: "+semaforo.contatore);
            totale  ++;
            semaforo.decrementaContatore();
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread "+ num +": --> Contatore Dopo: "+semaforo.contatore);
        }
        System.out.println("Totale thread "+ num +": " + totale);
    }
}
