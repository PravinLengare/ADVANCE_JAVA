package basic;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        int i = 0;
       while (i < 10){
           System.out.println("hello");
           i++;
       }
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.setDaemon(true);
        ThreadTest t2 = new ThreadTest();
        t2.start();
        t.start();
        t.interrupt();
        System.out.println("MAIN DONE ........");

    }
}

