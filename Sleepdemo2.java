public class Sleepdemo2 extends Thread {
    public void run(){
        try {
            for(int i = 1 ; i<=5 ; i++){
                System.out.println("i  :  " + Thread.currentThread().getName());
                Thread.sleep(1000);
                
        }
    }
    catch (Exception e) {
        System.out.println(e);
    } 
}
  public static void main(String[] args) {
    Sleepdemo2 s1 = new Sleepdemo2() ;
    s1.start() ;

    Sleepdemo2 s2 = new Sleepdemo2() ;
    s2.start() ;
  }
}
