public class ThreadYieldDemo extends Thread {
    public void run() {
        // Thread.yield();
        for (int i = 1; i <= 5; i++) {
            Thread.yield();
            System.out.println("i : " + i + " " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadYieldDemo t = new ThreadYieldDemo();
        t.start();

        //  thread.yield() if yyou want main threadd to stop

        for (int i = 1; i <= 5; i++) {
            System.out.println("i : " + i + " " + Thread.currentThread().getName());
        }
    }
}
