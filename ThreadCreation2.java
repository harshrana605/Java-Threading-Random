

public class ThreadCreation2 implements Runnable {
     @Override
     public void run(){
        System.out.println("Thread Task"); 
     }
     public static void main(String[] args) {
        ThreadCreation2 t = new ThreadCreation2();
        Thread th = new Thread(t);
        th.start();
     }
}
