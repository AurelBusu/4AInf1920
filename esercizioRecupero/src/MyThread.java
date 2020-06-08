import java.util.ArrayList;
import java.util.Random;

public class MyThread extends Thread{

        public static final int TMIN = 1000;
        public static final int TMAX = 3000;
        public static final int MAX = 50;
        private int IDThreadProduttore;
        private int num;
        private ArrayList<Elemento> arrayList;
        private Semaforo semaforo;

        public MyThread(int IDThreadProduttore, ArrayList<Elemento> arrayList, Semaforo semaforo){
            this.IDThreadProduttore = IDThreadProduttore;
            this.arrayList = arrayList;
            this.semaforo = semaforo;

            do{
                 this.num = InputOutputUtility.leggiNumero("inserire il numero di sequenza:");
                 if(num < 1 || num > 9){
                     System.out.println("errore , il numero deve essere minore di 10");
                 }
            }while(this.num > 9);

        }

        public void run(){
            Random random = new Random();

            for(int i = 0; i < num; i++){

                int delay = random.nextInt((TMAX - TMIN) +1 ) + TMIN;
                try {
                    sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int numRandom = random.nextInt((MAX - 1) +1 ) +1;
                System.out.println(IDThreadProduttore + "generazione del numero rand");
                semaforo.lock();
                arrayList.add(new Elemento(IDThreadProduttore, numRandom, i+1));
                System.out.println(IDThreadProduttore + "inserimento arrayList");
                semaforo.unlock();
            }
        }

}
