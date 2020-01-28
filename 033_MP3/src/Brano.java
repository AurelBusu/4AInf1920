public class Brano {

    public static final String SEPARATOR = ";";

    private String titolo;
    private int durata;

    public Brano() {}
    public Brano(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }
    public Brano(Brano brano) {
        titolo = brano.getTitolo();
        durata = brano.getDurata();
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }


    public void caricaBrano() {
        System.out.println("Inserimento dati brano:");
        titolo = InputOutputUtility.leggiNome("\tTitolo: ");
        while (durata<1) durata = InputOutputUtility.leggiNumero("\tDurata (in secondi): ");
    }


    public String generaRigaCsv() {
        return "\"" + titolo + "\"" + SEPARATOR +
                "\"" + durata + "\"";
    }
}
