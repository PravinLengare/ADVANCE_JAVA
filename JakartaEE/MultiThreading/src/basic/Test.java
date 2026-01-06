package basic;

public class Test {

    public static void main(String[] args) throws InterruptedException {
//        basic.Main m = new basic.Main();
//        Thread t = new Thread(m);
//        t.start();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("hello");
//        }
        Main m = new Main();
        System.out.println(m.getState());
        m.start();
        System.out.println(m.getState());
        Thread.sleep(100);
        System.out.println(m.getState());
        m.join();
        System.out.println(m.getState());

    }
}
