public class Thread2 extends Thread{

    private Buffer c1;

    public Thread2(Buffer c1){
        this.c1 = c1;
    }

    public void run(){

        c1.setY(c1.getX() + c1.getA());

        System.out.println("c1.y:" + c1.getY());
    }
}
