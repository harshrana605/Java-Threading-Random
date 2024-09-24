class MyThread1 extends Thread {
    public void run(){
        System.out.println("Task 1");
    }
}
class MyThread2 extends Thread {
    public void run(){
        System.out.println("Task 2");
    }
}


public class ThreadCreation4 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();


        MyThread2 t2 = new MyThread2();
        t2.start();
    }
    
}
