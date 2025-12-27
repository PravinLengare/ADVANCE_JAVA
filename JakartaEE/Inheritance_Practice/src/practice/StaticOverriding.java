package practice;

abstract class Test{
    public void test(){
        System.out.println("Testing in the Test class");
    }
    public abstract void add();
}
class A{
    public static void run(){
        System.out.println("A is running in static method");
    }
     void see(){
        System.out.println("A is seeing ");
    }
}
class B extends A{
    public static void run(){
        System.out.println("B is running in static method");
    }
    @Override
    void see(){
        System.out.println("B is seeing ");
    }
}
public class StaticOverriding {

    public static void main(String[] args) {
        A a = new B();
        a.see();
        a.run();


        /**
         * Anonymous Class
         */
        Test t = new Test() {
            @Override
            public void test() {
                super.test();
            }

            @Override
            public void add() {
                System.out.println("Adding ");
            }
        };
        t.test();
        t.add();


        /*
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        // Get a set of all threads currently alive
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();

        System.out.println("Total Threads: " + threadSet.size());

        for (Thread t : threadSet) {
            System.out.println("Name: " + t.getName() +
                    " | Daemon: " + t.isDaemon() +
                    " | Priority: " + t.getPriority());
        }


         */
    }
}
