public class Rombo implements Quadrilatero {

    private double lato;
    @Override
    public double calcolaPerimetro() {
        return (lato*4);
    }
}
