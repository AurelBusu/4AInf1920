package it.itis.cuneo;

import java.util.Arrays;

public class Contenitore {
    public static final int MAX_BOTTIGLIE = 5;
    private Bottiglia[] vBottiglia;
    private int cntBottiglia;

    public Contenitore(){
        vBottiglia = new Bottiglia[MAX_BOTTIGLIE];
        cntBottiglia = 0;
    }

    public void addBottiglia(Bottiglia bottiglia)
        throws ContenitorePienoException{
            if(cntBottiglia+1 > MAX_BOTTIGLIE)
                throw new ContenitorePienoException("troppe bottiglie");
            vBottiglia[cntBottiglia] = bottiglia;
            cntBottiglia++;
        }

    @Override
    public String toString() {
        return "Contenitore{" +
                "vBottiglia=" + Arrays.toString(vBottiglia) +
                ", cntBottiglia=" + cntBottiglia +
                '}';
    }

    public static void main(String[] args) {
        Bottiglia bottiglia = new Bottiglia(1);
        Contenitore contenitore = new Contenitore();
        try{
            contenitore.addBottiglia(bottiglia);
            contenitore.addBottiglia(bottiglia);
            contenitore.addBottiglia(bottiglia);
            contenitore.addBottiglia(bottiglia);
            contenitore.addBottiglia(bottiglia);
            contenitore.addBottiglia(bottiglia);
        } catch (ContenitorePienoException e) {
            e.printStackTrace();
        }

        System.out.println(contenitore.toString());
    }
}


