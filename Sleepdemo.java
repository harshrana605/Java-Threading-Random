public class Sleepdemo extends Thread {

    public void run(){
      for(int i = 20; i<=25; i++){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(i);
      }
    }

    public static void main(String[] args) throws Exception {
        
        for(int i = 1 ; i<=5 ; i++){
            Thread.sleep(1000);
            System.out.println(i);

            Sleepdemo s1 = new Sleepdemo();
            s1.start();
        }
    }
    
}
