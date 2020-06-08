import java.util.ArrayList;

public class Gestione {

    private ArrayList<Elemento> arrayList;
    private Semaforo semaforo;
    private MyThread threadProduttore1;
    private MyThread threadProduttore2;
    private MyThread threadProduttore3;

    public Gestione() {
        arrayList = new ArrayList<Elemento>();
        semaforo = new Semaforo();
        this.threadProduttore1 = new MyThread(1, arrayList, semaforo);
        this.threadProduttore2 = new MyThread(2, arrayList, semaforo);
        this.threadProduttore3 = new MyThread(3, arrayList, semaforo);
    }

    public ArrayList<Elemento> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Elemento> arrayList) {
        this.arrayList = arrayList;
    }

    public MyThread getThreadProduttore1() {
        return threadProduttore1;
    }

    public void setThreadProduttore1(MyThread threadProduttore1) {
        this.threadProduttore1 = threadProduttore1;
    }

    public MyThread getThreadProduttore2() {
        return threadProduttore2;
    }

    public void setThreadProduttore2(MyThread threadProduttore2) {
        this.threadProduttore2 = threadProduttore2;
    }

    public MyThread getThreadProduttore3() {
        return threadProduttore3;
    }

    public void setThreadProduttore3(MyThread threadProduttore3) {
        this.threadProduttore3 = threadProduttore3;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public static void main(String[] args) {

        Gestione gestione = new Gestione();
        gestione.getThreadProduttore1().start();
        gestione.getThreadProduttore2().start();
        gestione.getThreadProduttore3().start();
        gestione.getSemaforo().unlock();
        try {
            gestione.getThreadProduttore1().join();
            gestione.getThreadProduttore2().join();
            gestione.getThreadProduttore3().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Elemento tElement: gestione.getArrayList()){
            System.out.println("ID: " + tElement.getId() + "\n\tNumero di sequenza: " + tElement.getNumSequenza() + "\n\tNumero casuale: " + tElement.getNumeroCasuale());
        }
    }
}
