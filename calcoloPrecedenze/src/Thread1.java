public class Thread1  extends Thread{

    private Buffer c1;

    public Thread1(Buffer c1){
        this.c1 = c1;
    }

    public void run(){

        c1.setX(c1.getB()*4);

        System.out.println("c1.x:" + c1.getX());
    }
}
