package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();
//    public synchronized void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if (balance >=amount){
//
//            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
//            try {
//                Thread.sleep(3000); // Simulate time taken to process the withdrawal
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
//        }
//        else
//        {
//            System.out.println(Thread.currentThread().getName() + " insufficient balance");
//        }
//    }
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if (lock.tryLock(10000, TimeUnit.MILLISECONDS)){
                try {
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        try {
                            Thread.sleep(3000); // Simulate time taken to process the withdrawal
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                        finally {
                            lock.unlock();
                        }
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " insufficient balance");
                    }
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }

            }
            else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }


    }

}

