public class GrafoPrecedenze {

    public static void main(String[] args) {

        Buffer c1 = new Buffer();
        Buffer c2 = new Buffer();

        Thread1 th1 = new Thread1(c1);
        Thread2 th2 = new Thread2(c1);
        Thread3 th3 = new Thread3(c2);
        Thread4 th4 = new Thread4(c2);
        Thread5 th5 = new Thread5(c1,c2);

        c1.setA(4);
        c2.setA(2);
        c1.setB(3);
        c2.setB(5);

        th1.start();
        th3.start();

        try{
            th1.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th2.start();
        th4.start();

        try {
            th2.join();
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th5.start();

        try {
            th5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("risultato:" + c1.getZ());
    }
}
