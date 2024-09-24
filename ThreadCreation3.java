public class ThreadCreation3 extends Thread{
    public void run(){
        System.out.println("Task");
    }
    public static void main(String[] args) {
        ThreadCreation3 thread1 = new ThreadCreation3();
        thread1.start();

        ThreadCreation3 thread3 = new ThreadCreation3();
        thread3.start();

        ThreadCreation3 thread2 = new ThreadCreation3();
        thread2.start();
    }
}
