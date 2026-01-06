package basic;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    /*
    @Override
    public void run() {
        System.out.println("Thread is Running...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }

     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        /*
        basic.MyThread l = new basic.MyThread("Low Priority Thread");
        basic.MyThread m = new basic.MyThread("Medium Priority Thread");
        basic.MyThread n = new basic.MyThread("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        n.start();

         */
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        t1.start();
        t2.start();


    }
}
