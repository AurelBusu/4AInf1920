public class Main {

    public static int TOT_DELAY = 0;
    public static final String NAME = "fragola";

    public static void main(String[] args) {

        System.out.println(NAME);

        long startTime = System.nanoTime();

        Carattere carattere = new Carattere(NAME, 0);
        carattere.start();
        try {
            carattere.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println();
    }
}
