public class PortoPienoException extends Exception{
    private String descrizione;
    int codice;

    public PortoPienoException(String descrizione, int codice) {
        this.descrizione = descrizione;
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }
}
