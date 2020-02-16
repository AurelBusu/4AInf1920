public class Thread3 extends Thread{

    private Buffer c2;

    public Thread3(Buffer c2){
        this.c2 = c2;
    }

    public void run(){
        c2.setX(c2.getB()*5);

        System.out.println("c2.x:" + c2.getX());
    }
}
