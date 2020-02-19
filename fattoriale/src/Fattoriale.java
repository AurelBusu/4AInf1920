public class Fattoriale extends Thread {

    private int num;
    private long risultato;

    public Fattoriale() {}
    public Fattoriale(int num) { this.num = num; }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public long getRisultato() {
        return risultato;
    }
    public void setRisultato(long risultato) {
        this.risultato = risultato;
    }

    @Override
    public String toString() {
        return "Fattoriale{" +
                "num=" + num +
                ", res=" + risultato +
                '}';
    }

    public void run() {
        if (num <= 0) {
            setRisultato(1);
        }
        else {
            Fattoriale tFattoriale = new Fattoriale(num-1);
            tFattoriale.start();

            try {
                tFattoriale.join();
                System.out.println("fact(" + tFattoriale.getNum() + "): " + tFattoriale.getRisultato());

                setRisultato(num*tFattoriale.getRisultato());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
