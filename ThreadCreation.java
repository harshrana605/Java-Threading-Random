

public class ThreadCreation extends Thread {
            public void run() {
                System.out.println("Thread Task");
            }
    public static void main(String[] args) {
        ThreadCreation t = new ThreadCreation();
        t.start(); 
         // t.start();  exception in thread main
    }
}



