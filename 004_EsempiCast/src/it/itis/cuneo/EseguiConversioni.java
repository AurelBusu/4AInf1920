package it.itis.cuneo;

/**
 * Created by inf.busua0409 on 30/09/2019.
 */
public class EseguiConversioni {

    //esempi di conversione tra wrapper, partendo da un primitivo
    public static void main(String args[]) {
        //Float : è una classe wrapper, contiene un primitivo dello stesso tipo e i metodi che ne permettono l'elaborazione
        //float : è un tipo primitivo, variabile semplice

        Float f = new Float(2.52d);
        //System.out.println(String s)
        //La firma del metodo sopra richiede una stringa come parametro, quindi il float viene convertito in una stringa
        //System.out.println(float fPrimitivo)ù
        //nel caso della firma sopra gli passiamo un float wrapper ma il metodo si aspetta un metodo primitivo e converte automaticamente
        System.out.println(f);
        System.out.println();

        int n = Integer.parseInt("6");
        System.out.println(n);

        String quanteMele = "6";
        int m = Integer.parseInt(quanteMele);
        System.out.println(m);

        //esempio 1
        int e = 5;
        Integer ogI;
        ogI = new Integer(e);
        System.out.println(ogI);

        //esempio 2
        int j = 3;
        Float k = new Float(3);
        System.out.println(k);

        //esempio 3
        String s2 = "5.25f";
        Float ogF;
        ogF = Float.parseFloat(s2);
        System.out.println(ogF);

        //esempio 4
        String s3;
        s3 = new String("" + ogF);
        System.out.println("s3 = new String(\"\" + ogF):" + ogF);

        //double ---> Integer
        double dN = 6.5d;
        int intN = (int) dN; //intN = 6
        Integer iN = new Integer(intN);
        System.out.println(iN);

        //float ---> Integer
        float fN = 6.35f;
        int kl = (int) fN;
        Integer po = new Integer(kl);
        System.out.println(po);



    }
}
