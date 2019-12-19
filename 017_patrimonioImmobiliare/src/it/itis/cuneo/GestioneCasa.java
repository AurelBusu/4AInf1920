package it.itis.cuneo;

public class GestioneCasa {

    public static void main(String[] args) {

        Abitazione abitazione = new Abitazione();
        Ville ville = new Ville();
        Appartamento appartamento = new Appartamento();

        int scelta = 0;

        do{
            scelta = GestioneCasa.scegliCasa();
            switch(scelta){
                case 1:
                    System.out.println("inserire dati:\n");
                    abitazione.caricaAbitazione();
                    System.out.println(abitazione.toString());
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("inserire dati:\n");
                    ville.caricaVilla();
                    System.out.println(ville.toString());
                    System.exit(0);
                    break;
                case 3:
                    System.out.println("inserire dati:\n");
                    appartamento.caricaAppartamento();
                    System.out.println(appartamento.toString());
                    System.exit(0);
                    break;
                case 99:
                    System.out.println("arrivederci");
                    System.exit(0);
                    break;
                default:
                    System.out.println("errore");
                    System.exit(0);
                    break;
            }
        }
        while(scelta != 0);
    }

    public static int scegliCasa(){
        int scelta;

        System.out.println("menu:");
        System.out.println("opzione 1: abitazione");
        System.out.println("opzione 2: villa");
        System.out.println("opzione 3: appartamento");
        System.out.println("opzione 99: esci");

        scelta = InputOutputUtility.leggiNumero("");

        return scelta;
    }
}
