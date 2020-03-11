import java.util.Random;

public class Carattere extends Thread {

    public static final int MIN_DELAY = 1000;
    public static final int MAX_DELAY = 3000;

    private String string;
    private int ind;

    public Carattere(String str, int index) {
        this.string = str;
        this.ind = index;
    }

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
    public int getInd() {
        return ind;
    }
    public void setInd(int ind) {
        this.ind = ind;
    }

    @Override
    public String toString() {
        return "Character{" +
                "str='" + string + '\'' +
                ", index=" + ind +
                '}';
    }

    public void run() {

        if (ind < string.length()-1) {
            Carattere carattere = new Carattere(string, ind + 1);
            carattere.start();
            try {
                carattere.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Random rand = new Random();
        int delay = rand.nextInt((MAX_DELAY - MIN_DELAY) + 1) + MIN_DELAY;
        try {
            sleep(delay);
            Main.TOT_DELAY += delay;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" " + string.charAt(ind) + " "  + delay);
    }
}