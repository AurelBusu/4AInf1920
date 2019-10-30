package it.itis.cuneo;

public class Telecomando {
    private int canale;
    private int volume;
    private boolean acceso;
    private int luminosita;

    public Telecomando(int canale, int volume, int luminosita, boolean acceso){
        this.canale = canale;
        this.volume = volume;
        this.luminosita = luminosita;
        this.acceso = acceso;
    }

    public void setCanale(int canale){
        this.canale = canale;
    }

    public int getCanale(){
        return canale;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setLuminosita(int luminosita){
        this.luminosita = luminosita;
    }

    public int getLuminosita(){
        return luminosita;
    }

    public void setAcceso(boolean acceso){
        this.acceso = acceso;
    }

    public boolean getAcceso(){
        return acceso;
    }

    public int cambiaVolume(){
        this.volume++;
        return volume;
    }

    public int cambiaCanale(){
        this.canale++;
        return canale;
    }

    public int cambiaLuminosita(){
        this.luminosita++;
        return luminosita;
    }

    public boolean verifica(){
        if(this.acceso == true){
            return acceso;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Telecomando telecomando = new Telecomando(11, 6, 40, true);
        int telecomandoVolume = telecomando.cambiaVolume();
        int telecomandoCanale = telecomando.cambiaCanale();
        int telecomandoLuminosita = telecomando.cambiaLuminosita();
        boolean telecomandoAcceso = telecomando.verifica();
        System.out.println("volume:" + telecomandoVolume);
        System.out.println("canale:" + telecomandoCanale);
        System.out.println("luminosità:" + telecomandoLuminosita);
        System.out.println("tv:" + telecomandoAcceso);
    }
}
