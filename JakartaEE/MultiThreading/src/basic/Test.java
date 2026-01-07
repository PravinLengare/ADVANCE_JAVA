package basic;


interface a{

    static void k(){
        System.out.println("k is");
    }
    default void h(){
        System.out.println("h is");
    }

}
public class Test implements a{
    @Override
    public void h(){
        System.out.println("In sub class");
    }

    public void k(){
        System.out.println("k is in sub class");
    }
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

        // Interface default and concrete methods
        a ref = new Test();
        ref.h();        // it checks the object
        a.k();          // it checks the ref of class when it will be static method


        Test a = new Test();
        a.h();

    }
}
