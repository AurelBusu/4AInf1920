public class Rettangolo implements Quadrilatero{

    private double base, altezza;
    @Override
    public double calcolaPerimetro() {
        return ((base+altezza)*2);
    }
}
