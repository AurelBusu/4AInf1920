public class Thread4 extends Thread{

    private Buffer c2;

    public Thread4(Buffer c2){
        this.c2 = c2;
    }

    public void run(){
        c2.setY(c2.getX() + c2.getA());

        System.out.println("c2.y:" + c2.getY());
    }
}
