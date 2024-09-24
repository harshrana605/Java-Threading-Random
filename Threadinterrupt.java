public class Threadinterrupt extends Thread {
    public void run() {
        try {
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("child thread" + i);
            Thread.sleep(1000);
        }}
        catch(Exception e ){
            System.out.println("Thread interrupted " + e);
        }
    }
    public static void main(String[] args) {
        Threadinterrupt t1 = new Threadinterrupt();
        t1.start();
        try {
            // Main thread sleeps for 2 seconds before interrupting the child thread
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted " + e);
        }
        t1.interrupt();
    }
    
}
