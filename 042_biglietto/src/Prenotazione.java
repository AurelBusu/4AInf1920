public class Prenotazione {

    private String cognome;
    private String nome;
    private String telefono;
    private String cittaPartenza;
    private String cittaDestinazione;
    private String data;
    public static final String SEPARATOR = ",";

    public Prenotazione() {
        super();
    }

    public Prenotazione(String cognome, String nome, String telefono, String partenza, String destinazione, String data) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaPartenza = partenza;
        this.cittaDestinazione = destinazione;
        this.data = data;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCittaPartenza() {
        return cittaPartenza;
    }

    public void setCittaPartenza(String cittaPartenza) {
        this.cittaPartenza = cittaPartenza;
    }

    public String getCittaDestinazione() {
        return cittaDestinazione;
    }

    public void setCittaDestinazione(String cittaDestinazione) {
        this.cittaDestinazione = cittaDestinazione;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", telefono='" + telefono + '\'' +
                ", partenza='" + cittaPartenza + '\'' +
                ", destinazione='" + cittaDestinazione + '\'' +
                ", data='" + data + '\'' + "\n";
    }

    public String toRowCSV(){
        return cognome + SEPARATOR +
                nome + SEPARATOR +
                telefono + SEPARATOR +
                cittaPartenza + SEPARATOR +
                cittaDestinazione + SEPARATOR +
                data + "\n";
    }
}