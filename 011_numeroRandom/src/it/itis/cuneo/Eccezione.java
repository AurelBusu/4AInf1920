package it.itis.cuneo;

import java.lang.Exception;

public class Eccezione {

    public void metodo() throws Exception{
        System.out.println("eccezione del metodo");
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        Eccezione eccezione = new Eccezione();
        int c = 0;
        while (c < 5) {
            double casuale = (int) (Math.random() * 2);
            if (casuale == 1) {
                c++;
                try {
                    eccezione.metodo();
                } catch (Exception e) {
                    System.out.println("ecezione fatta");
                    e.printStackTrace();
                }
            }
            }
        }
    }