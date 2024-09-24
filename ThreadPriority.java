public class ThreadPriority extends Thread {
    public void run(){
        System.out.println("child thread 1");
        System.out.println(Thread.currentThread().getPriority()); 
    }

    public static void main(String[] args) {
        System.out.println("Main thread old prioity" + Thread.currentThread().getPriority());
         Thread.currentThread().setPriority(10);
        System.out.println("Main thread new prioity" + Thread.currentThread().getPriority());

        ThreadPriority t1 = new ThreadPriority();
        // t1.setPriority(5);
        t1.start();

    }
    
}
