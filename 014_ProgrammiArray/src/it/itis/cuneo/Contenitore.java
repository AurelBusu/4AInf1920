package it.itis.cuneo;


public class Contenitore {
    private static final int MAX_NUM = 3;
    private Programma pr[];

    public Contenitore(){
        int j;
        pr = new Programma[MAX_NUM];
        for(j=0; j<MAX_NUM; j++){
            pr[j] = new Programma();
        }
    }

    public Contenitore(Contenitore contenitore){
        int j;
        pr = new Programma[MAX_NUM];
        for(j=0; j<MAX_NUM; j++){
            pr[j] = new Programma(contenitore.pr[j]);
        }
    }

    public Programma getProgramma(int posizione){
        return pr[posizione];
    }

    public void setProgramma(Programma programma, int posizione){
        pr[posizione] = programma;
    }

    public void killProgramma(int posizione){
        pr[posizione] = new Programma();
    }

    public int getN(){
        return MAX_NUM;
    }

    public int cercaProgrammaDenominazione(String denominazione){
        int j;
        int posizione = -1;
        for(j=0; j<MAX_NUM; j++){
            if(pr[j].getDenominazione() == denominazione)
                posizione = j;
        }
        return posizione;
    }

    public String toString(){
        return "programmi sono:" + pr[0].getDenominazione() + " " + pr[1].getDenominazione() + " " + pr[2].getDenominazione();
    }

    public static void main(String[] args) {
        Programma programma = new Programma("java","marco",1,"linux",1997);
        Programma programma1 = new Programma("c","felipe",2,"linux",1997);
        Programma programma2 = new Programma("python","alfredo",3,"windows",1985);

        Contenitore contenitore = new Contenitore();
        contenitore.setProgramma(programma,0);
        contenitore.setProgramma(programma1,1);
        contenitore.setProgramma(programma2,2);

        System.out.println(contenitore.toString());
        System.out.println("i numeri di programmi presenti sono:" + contenitore.getN());
        System.out.println("posizione della denominazione si trova nella posizione:" + contenitore.cercaProgrammaDenominazione("c"));
        contenitore.killProgramma(1);
        System.out.println(contenitore.toString());
    }
}
