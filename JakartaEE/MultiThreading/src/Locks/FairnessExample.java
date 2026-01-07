package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessExample {
    private final Lock lock = new ReentrantLock(true);  // avoid starvation

    void acquireLock(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "acquiring the lock .....");
            Thread.sleep(1000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName() + "releasing the lock .....");
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        FairnessExample e = new FairnessExample();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                e.acquireLock();
            }
        };
        Thread t1 = new Thread(runnable,"t-1");
        Thread t2 = new Thread(runnable,"t-2");
        Thread t3 = new Thread(runnable,"t-3");

        t3.start();
        t1.start();
        t2.start();
    }
}
