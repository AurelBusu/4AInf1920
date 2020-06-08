public class Semaforo {

    int value;

    public Semaforo() {
        value = 0;
    }
    public Semaforo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void lock() {
        while (value == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void unlock(){
                value++;
                notify();
    }
}
