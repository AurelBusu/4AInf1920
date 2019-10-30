package it.itis.cuneo;

/**
 * Created by inf.busua0409 on 17/10/2019.
 */
public class CasaEditrice {
    private String ragioneSociale;
    private String luogo;
    private int annoFondazione;

    public CasaEditrice(){

    }

    public CasaEditrice( String ragioneSociale, String luogo, int annoFondazione){
        this.ragioneSociale = ragioneSociale;
        this.luogo = luogo;
        this.annoFondazione = annoFondazione;
    }

    public CasaEditrice(CasaEditrice c){
        this.ragioneSociale = c.getRagioneSociale();
        this.luogo = c.getLuogo();
        this.annoFondazione = c.getAnnoFondazione();
    }

    public void setAnnoFondazione(int annoFondazione) {
        this.annoFondazione = annoFondazione;
    }

    public int getAnnoFondazione() {
        return annoFondazione;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public String toString(){
        return  "\nragione sociale:" + ragioneSociale + "\nluogo:" + luogo + "\nanno fondazione:" + annoFondazione;
    }



}
