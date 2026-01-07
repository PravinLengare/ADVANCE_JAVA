package basic;

class Counter {
    private int count = 0; // shared resource

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
public class Synchronization extends Thread{
    private Counter counter;

    public Synchronization(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Synchronization t1 = new Synchronization(counter);
        Synchronization t2 = new Synchronization(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(counter.getCount()); // Expected: 2000, Actual will be random <= 2000
    }
}
