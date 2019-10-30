package it.itis.cuneo;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p){
        x = p.getX();
        y = p.getY();
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void  setY(double y){
        this.y = y;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return ("x:" + x + ", y:" + y);
    }

}
