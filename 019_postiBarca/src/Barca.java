public class Barca {

    InputOutputUtility t;

    public static final int VELA = 1;
    public static final int MOTORE = 0;
    private String nome;
    private String nazionalità;
    private double lunghezza;
    private double stazza;

    public Barca(){

    }

    public Barca(String nome, String nazionalità, double lunghezza, double stazza){
        super();
        this.nome = nome;
        this.nazionalità = nazionalità;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getStazza() {
        return stazza;
    }

    public void setStazza(double stazza) {
        this.stazza = stazza;
    }

    @Override
    public String toString() {
        return "Barca{" +
                "nome='" + nome + '\'' +
                ", nazionalità='" + nazionalità + '\'' +
                ", lunghezza=" + lunghezza +
                ", stazza=" + stazza +
                '}';
    }

    public void caricaBarca(Barca elencoBarche[], int cntBarca, InputOutputUtility t){
        int tipoBarca;
        System.out.println("dichiarare quale barca si vuole avere: premendo 1-->a vela  ||  0--> a motore:");
        tipoBarca = t.leggiNumero("inserire numero:");
        if(tipoBarca == Barca.VELA){
            elencoBarche[cntBarca] = new Vela();
        }else{
            elencoBarche[cntBarca] = new Motore();
        }
        this.nome = t.leggiNome("inserire nome della barca:");
        this.nazionalità = t.leggiNome("inserire la nazionalità:");
        this.lunghezza = t.leggiNumero("inserire la lunghezza della nave:");
        this.stazza = t.leggiNumero("inserire la stazza della barca:");
    }

}
