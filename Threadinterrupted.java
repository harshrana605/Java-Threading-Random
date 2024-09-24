public class Threadinterrupted extends Thread {
    public void run() {
        System.out.println("A1: "+ Thread.interrupted());   // true ----> false
        System.out.println("A2: "+ Thread.interrupted()); 
       // System.out.println(Thread.currentThread().isInterrupted());    // true  ----> true
        try { 
        for (int i = 1; i <= 5; i++) {
            
            System.out.println( i);
            Thread.sleep(1000);
             System.out.println("B : " + Thread.interrupted());
        }}
        catch(Exception e ){
            System.out.println("Thread interrupted " + e);
        }
    }
    public static void main(String[] args) {
        Threadinterrupted t1 = new Threadinterrupted();
        t1.start();
        t1.interrupt();
    
}}
