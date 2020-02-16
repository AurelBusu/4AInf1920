public class Thread5 extends Thread{

    private Buffer c1;
    private Buffer c2;

    public Thread5(Buffer c1, Buffer c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public void run(){
        c1.setZ(c1.getY() * c2.getY());

        System.out.println("z:" + c1.getZ());
    }
}
