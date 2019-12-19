package it.itis.cuneo;

import javafx.scene.shape.Arc;

import java.util.Arrays;

/**
* Created by inf.busua0409 on 13/11/2019.
 */
public class Archivio {
    public static final int MAX_PROGRAMMI = 10;
    private int cntProgrammi;
    private Programma[] vProgrammi;
    private int nProgrammi;

    //UML relazione 1-->n tra Archivio e programma
    public Archivio(){
        vProgrammi = new Programma[MAX_PROGRAMMI];
        nProgrammi = MAX_PROGRAMMI;
        cntProgrammi = 0;
    }

    public Archivio(int nProgrammi) throws ArchivioPienoException{
        if(nProgrammi > MAX_PROGRAMMI)
            throw new ArchivioPienoException(1,"LIMITE MASSIMO SUPERATO");
        vProgrammi = new Programma[nProgrammi];
        this.nProgrammi = nProgrammi;
        cntProgrammi = 0;
    }

    public Programma getProgramma(int posizione){
        Programma programma = null;
        if(posizione>0 && posizione<nProgrammi)
        programma = this.vProgrammi[posizione];
        return programma;
    }

    //esito<0 --> l'operazione non ha avuto successo
    public int setProgramma(Programma programma, int posizione){
        int esito = 0;
        if(posizione>0 && posizione<nProgrammi) {
            //se sto aggiungendo in una posizione vuota
            if ((vProgrammi[posizione] == null)) {
                cntProgrammi++;
                this.vProgrammi[posizione] = programma;
                esito = posizione;
            } else {
                esito = -2;
            }
        }
            else{
                //non sono riuscito a inserire
                esito = -1;
            }
        return esito;
    }

    public void killProgramma(int posizione){
        if(posizione>0 && posizione<nProgrammi){
            this.vProgrammi[posizione] = null;
            cntProgrammi--;
        }
    }

    public int getN(){
        return this.nProgrammi;
    }

    public Programma cercaProgrammaPerDenominazione(String denominazione){
        Programma programma = null;
        boolean bTrovato = false;
        for(int cntProgramma = 0; cntProgramma<nProgrammi && !bTrovato; cntProgramma++){
             programma = vProgrammi[cntProgramma];
            if(programma != null && denominazione.equalsIgnoreCase(programma.getDenominazione()));
            bTrovato = true;
        }
        return programma;
    }

    //override: sovrascrittura di un altro metodo con la stessa firma, nella classe base java.lang.Object
    //quindi esiste già un metodo con la stessa firma, presente nella classe base
    @Override
    public String toString() {
        return "Archivio{" +
                "cntProgrammi=" + cntProgrammi +
                ", vProgrammi=" + Arrays.toString(vProgrammi) +
                ", nProgrammi=" + nProgrammi +
                '}';
    }

    public boolean equals(Archivio archivio){
        boolean bUguali = true;

        if(this.nProgrammi == archivio.getN()) {
            for (int cntProgramma = 0; cntProgramma < nProgrammi && bUguali; cntProgramma++) {
                Programma programmaInterno = this.getProgramma(cntProgramma);
                Programma programmaEsterno = archivio.getProgramma(cntProgramma);
                //NO programmaInterno == programmaEsterno --> si confrontano gli handlers
                if(!programmaInterno.equals(programmaEsterno)){
                    bUguali = false;
                }
            }
        }else{
            //se la dimensione definita per gli archivi è diversa
            bUguali = false;
        }
        return bUguali;
    }

          public int confrontaContenitore(Archivio archivio){
        int cont = 0;


        for(int cntProgramma=0; cntProgramma<nProgrammi; cntProgramma++){
            Programma programmaInterno = this.getProgramma(cntProgramma);
            Programma programmaEsterno = archivio.getProgramma(cntProgramma);
            if(programmaInterno.equals(programmaEsterno)){
                cont++;
            }
        }
        return cont;
    }

    public int contaProgrammiUgualiIncrociati(Archivio archivio){
        int cont = 0;
        boolean bUgualeTrovato = false;

        for(int contaProgrammiInterni=0; contaProgrammiInterni<MAX_PROGRAMMI; contaProgrammiInterni++){
            bUgualeTrovato = false;
            for(int contaProgrammiEsterni=0; contaProgrammiEsterni<archivio.getN() && !bUgualeTrovato; contaProgrammiEsterni++){
                if(vProgrammi[contaProgrammiInterni].equals(vProgrammi[contaProgrammiEsterni]))
                    bUgualeTrovato = true;
                    cont++;
            }
        }
            return cont;
    }

    public void caricaArchivio(){
        this.nProgrammi = InputOutputUtility.leggiNumero("quanti programmi vuoi utilizzare?:");

        for(cntProgrammi=0; cntProgrammi<nProgrammi; cntProgrammi++){
            Programma programma = new Programma();
            System.out.println("\n inserire il programma " + cntProgrammi + "...");
            programma.caricaProgramma();
            this.setProgramma(programma, cntProgrammi);
        }
    }

    public void simulaArchivio(){
        Programma programma1 = new Programma(1, "office", "Microsoft", "windows", 10, 2000);
        this.setProgramma(programma1, 0);
        Programma programma2 = new Programma(2, "Autocad", "Autodesk", "Linux", 10, 2010);
        this.setProgramma(programma2, 1);
    }

    public void stamapMenu(){
        String menu = "\t0: esci\n" +
                "\t1: carica archivio\n" +
                "\t2: elimina archivio\n" +
                "\t3: ricerca programma per denominazione\n" +
                "\t4: stampa archivio";

        System.out.println(menu);
    }

    public static void main(String[] args) {
        Archivio archivio = new Archivio();
        int sceltaMenu = -1;
        boolean bEsci = false;

        while(!bEsci){
            archivio.stamapMenu();
            sceltaMenu = InputOutputUtility.leggiNumero("inserisci la scelta:");
            switch (sceltaMenu){
                case 0: bEsci = true;
                    break;
                case 1: archivio.caricaArchivio();
                    break;
                case 2: int posDeleteProgr = InputOutputUtility.leggiNumero("inserire posizione da cancellare");
                    archivio.killProgramma(posDeleteProgr);
                    break;
                case 3: String denominazione = InputOutputUtility.leggiNome("inserire denominazione:");
                    Programma programma = archivio.cercaProgrammaPerDenominazione(denominazione);
                    System.out.println(programma);
                    break;
                case 4: System.out.println(archivio.toString());
                        break;
                case 99: archivio.simulaArchivio();
                    break;

            }
        }

    }
}
