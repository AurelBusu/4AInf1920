
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Playlist {




        public static final String FILE_CSV_NAME = "playlist.txt";
        public static final String FILE_N_BRANI = "nBrani.txt";
        public static final String FILE_T_BRANI = "tBrani.txt";

        private ArrayList<Brano> playlist;


        public Playlist() {
            super();
            playlist = new ArrayList<Brano>();
        }

        public Playlist(ArrayList<Brano> playlist) {
            super();
            this.playlist = playlist;
        }

        public ArrayList<Brano> getPlaylist() {
            return playlist;
        }

        public void setPlaylist(ArrayList<Brano> playlist) {
            this.playlist = playlist;
        }



        public void addBrano(Brano brano) {
            playlist.add(playlist.size(), brano);
        }



        public void remBrano(String titolo) {
            int cnt = 0;

            while (cnt < playlist.size() && !titolo.equalsIgnoreCase(playlist.get(cnt).getTitolo()))
                cnt++;

            if (titolo.equalsIgnoreCase(playlist.get(cnt).getTitolo()))
                playlist.remove(cnt);
        }


        public int durata() {
            int durataTotale = 0;

            for (Brano brano : playlist) durataTotale += brano.getDurata();

            return durataTotale;
        }



        public void esportaNBrani(int n) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_N_BRANI));
            String s;

            bw.write("Esportazione n brani:\n\n");
            for (int cnt = 0; cnt < n; cnt++) bw.write(playlist.get(cnt).generaRigaCsv() + "\n");
            bw.close();

        }



        public void esportaTBrani(int t) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_T_BRANI));
            String s;

            bw.write("Esportazione brani entro un tempo di riproduzione massimo:\n\n");

            int cnt = 0;
            int deltaT = 0;
            while (cnt < playlist.size() && deltaT < t) {
                deltaT += playlist.get(cnt).getDurata();

                if (deltaT < t) bw.write(playlist.get(cnt).generaRigaCsv() + "\n");

                cnt++;
            }
            bw.close();

        }



        public void spostaBranoPrecedente(int pos) {
            playlist.set(pos - 1, playlist.get(pos));
            playlist.remove(pos);
        }



        public void spostaBranoSuccessiva(int pos) {
            playlist.set(pos + 1, playlist.get(pos));
            playlist.remove(pos);
        }



        public void salvaLista() throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_CSV_NAME));

            for (Brano brano : playlist) bw.write(brano.generaRigaCsv() + "\n");
            bw.close();
        }



        public void shuffle() {
            Random rand = new Random();

            for (int i = playlist.size() - 1; i > 0; i--) {
                int j = rand.nextInt(i);

                Brano tBrano = new Brano(playlist.get(i));
                playlist.set(i, playlist.get(j));
                playlist.set(j, tBrano);
            }
        }


        public void test() {
            playlist.removeAll(playlist);

            playlist.add(new Brano("Colpa delle favole", 2770));
            playlist.add(new Brano("Lorenzo sulla Luna", 2456));
            playlist.add(new Brano("PULSE", 8705));
        }


        public static int menu() {
            System.out.println("1) Aggiunta brano;\n" +
                    "2) Rimozione brano;\n" +
                    "3) Determinazione durata totale dei brani della playlist;\n" +
                    "4) Esportazione su csv dei primi \"n\" brani della playlist;\n" +
                    "5) Esportazione dei primi brani della lista fino ad un tempo complessivo di riproduzione \"t\";\n" +
                    "6) Spostamento di un brano di una determinata posizione in quella precedente;\n" +
                    "7) Spostamento di un brano di una determinata posizione in quella successiva;\n" +
                    "8) Salvataggio della playlist su csv;\n" +
                    "9) Riordino casuale della playlist;\n" +
                    "10) Dati test;\n" +
                    "11) Termine programma;\n");

            return InputOutputUtility.leggiNumero("Digitare l'opzione desiderata: ");
        }

        public static void main(String[] args) {

            int scelta, tInt;
            String tTitolo;
            Brano tBrano = new Brano();

            Playlist playlist = new Playlist();

            do {
                scelta = menu();
                System.out.println();

                switch (scelta) {

                    case 1:
                        tBrano.caricaBrano();
                        playlist.addBrano(tBrano);
                        System.out.println("Brano aggiunto ...");
                        break;

                    case 2:
                        tTitolo = InputOutputUtility.leggiNome("Inserire il titolo del brano da rimuovere dalla playlist: ");
                        playlist.remBrano(tTitolo);
                        System.out.println("Brano rimosso ...");
                        break;

                    case 3:
                        System.out.println("Calcolo durata totale della playlist ...");
                        System.out.println("Durata totale della playlist: " + playlist.durata());
                        break;

                    case 4:
                        tInt = InputOutputUtility.leggiNumero("Inserire il numero dei primi brani da visualizzare: ");
                        if (tInt < 0 || tInt > playlist.playlist.size()) System.out.println("\tPosizione non valida!");
                        else {
                            try {
                                playlist.esportaNBrani(tInt);
                                System.out.println("Brani esportati ...");
                            } catch (IOException IOex) {
                                IOex.printStackTrace();
                            }
                        }
                        break;

                    case 5:
                        tInt = InputOutputUtility.leggiNumero("Inserire il tempo complessivo dei brani da esportare: ");
                        if (tInt < 0) System.out.println("\tTempo non valido!");
                        else {
                            try {
                                playlist.esportaTBrani(tInt);
                                System.out.println("Brani esportati ...");
                            } catch (IOException IOex) {
                                IOex.printStackTrace();
                            }
                        }
                        break;

                    case 6:
                        tInt = InputOutputUtility.leggiNumero("Inserire la posizione del brano da spostare nella posizione precedente: ");
                        if (tInt < 2 || tInt > playlist.playlist.size()) System.out.println("\tPosizione non valida!");
                        else {
                            playlist.spostaBranoPrecedente(tInt - 1);
                            System.out.println("Brano spostato nella posizione precedente ...");
                        }
                        break;

                    case 7:
                        tInt = InputOutputUtility.leggiNumero("Inserire la posizione del brano da spostare nella posizione successiva: ");
                        if (tInt < 1 || tInt > playlist.playlist.size() - 1)
                            System.out.println("\tPosizione non valida!");
                        else {
                            playlist.spostaBranoSuccessiva(tInt - 1);
                            System.out.println("Brano spostato nella posizione successiva ...");
                        }
                        break;

                    case 8:
                        System.out.println("Salvataggio playlist ...");
                        try {
                            playlist.salvaLista();
                        } catch (IOException IOex) {
                            IOex.printStackTrace();
                        }
                        System.out.println("Playlist salvata ...");
                        break;

                    case 9:
                        playlist.shuffle();
                        System.out.println("Brani ordinati in modo casuale ...");
                        break;

                    case 10:
                        System.out.println("Caricamento dati test ...");
                        playlist.test();
                        System.out.println("Dati test caricati ...");
                        break;

                    case 11:
                        System.out.println("Arrivederci!");
                        break;

                    default:
                        System.out.println("Scelta non valida!");

                }
                System.out.println();
            } while (scelta != 11);


        }

    }

