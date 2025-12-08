package com.pravin.Threads;

/*
class C implements Runnable {
    public void run(){
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("HI");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class D implements Runnable{
    public void run(){
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }public void run(){
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

 */
public class UsingRunnable {
    public static void main(String[] args) {
        Runnable obj1 =  () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("HI");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable obj2 =  () -> {
                for (int i = 0 ; i < 10 ; i++){
                    System.out.println("HELLO");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
