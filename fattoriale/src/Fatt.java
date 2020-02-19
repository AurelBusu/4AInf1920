public class Fatt {

    public static final int NUMERO = 10;

    public static void main(String[] args) {

        Fattoriale thFattoriale = new Fattoriale(NUMERO);

        thFattoriale.start();
        try {
            thFattoriale.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fattoriale di " + NUMERO + ": " + thFattoriale.getRisultato());
    }
}
