package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();
    public void outerMethod(){
        try {
            lock.lockInterruptibly();
            try {
                System.out.println("Outer method ");
                innerMethod();
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException e) {
            System.out.println("I was interrupted while waiting for the lock!");
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
