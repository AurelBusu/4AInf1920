public class Porto {

    static InputOutputUtility t = new InputOutputUtility();

    public static final int MAX_BARCHE = 100;
    private Barca elencoBarche[];
    private static int cntBarche;

    Barca barca = new Barca();

    public Porto(int cntBarche) {
        super();
        this.cntBarche = cntBarche;

        elencoBarche = new Barca[MAX_BARCHE];
        t = new InputOutputUtility();
    }

    public Porto(Barca[] elencoBarche) {
        super();
        this.elencoBarche = elencoBarche;
    }

    public Porto() {

    }

    public void addBarca() throws PortoPienoException {
        if (cntBarche > MAX_BARCHE) {
            throw new PortoPienoException("porto pieno", 1);
        }else{
            //if(Barca.MOTORE == )
        }
        barca.caricaBarca(elencoBarche, cntBarche, t);

    }

    public static void main(String[] args) throws PortoPienoException {
        Porto porto = new Porto();
        porto.addBarca();

    }



}
