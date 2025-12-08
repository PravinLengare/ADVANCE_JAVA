package com.pravin.Threads;
class Bank {
    int counter;

    public synchronized void count(){
        counter++;
    }

}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Bank b = new Bank();

        Runnable obj2 =  () -> {
            for (int i = 0 ; i < 10000 ; i++){
                 b.count();
            }
        };

        Runnable obj1 =  () -> {
            for (int i = 0 ; i < 10000 ; i++){
                b.count();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(b.counter);
    }
}
