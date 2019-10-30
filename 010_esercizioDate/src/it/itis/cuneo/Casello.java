package it.itis.cuneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Casello {
    private Calendar entrata;
    private Calendar uscita;
    private String identifier;

    public Casello(Calendar entrata, Calendar uscita, String identifier){
        this.entrata = entrata;
        this.uscita = uscita;
        this.identifier = identifier;
    }

    public void setUscita(Calendar uscita) {
        this.uscita = uscita;
    }

    public Calendar getUscita() {
        return uscita;
    }

    public void setEntrata(Calendar entrata) {
        this.entrata = entrata;
    }

    public Calendar getEntrata() {
        return entrata;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public static void main(String[] args) {

        String strPartenza = "23/10/2019 20:36:44";
        String strArrivo = "23/10/2019 21:05:57";

        Calendar entrata = Calendar.getInstance();
        Calendar uscita = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date dataPartenza = null;
        Date dataArrivo = null;

        try{
                dataPartenza = sdf.parse(strPartenza);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try{
            dataArrivo = sdf.parse(strArrivo);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        entrata.setTime(dataPartenza);
        uscita.setTime(dataArrivo);

        System.out.println(sdf.format(dataPartenza));
        System.out.println(sdf.format(dataArrivo));

        Casello casello = new Casello(entrata, uscita, "1");

        long millisec = entrata.getTimeInMillis();
        long millisec2 = uscita.getTimeInMillis();

        System.out.println(millisec);
        System.out.println(millisec2);

        long millisec3 = millisec2 - millisec;
        long h,m;
        millisec3 = millisec3/1000;
        h = millisec3/60/60;
        millisec3 = millisec3 - h*60*60;
        m = millisec3/60;
        millisec3 = millisec3 - m*60;

        System.out.println(h+":" + m+":" + millisec3);

    }

}
