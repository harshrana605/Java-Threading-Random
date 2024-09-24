public class ThreadNaming extends Thread {
    public void run(){

        // Thread.currentThread().setName("Shivam") ;  can change name here too 

        System.out.println("Task is executed by  :" + Thread.currentThread().getName() );
    }
    public static void main(String[] args) {
        System.out.println("hello " +Thread.currentThread().getName() );

        ThreadNaming t1 = new ThreadNaming();
        t1.start();

        ThreadNaming t2 = new ThreadNaming();
        // t2.setName("Harsh");
        t2.start();


    }
}
