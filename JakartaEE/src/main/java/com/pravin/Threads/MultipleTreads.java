package com.pravin.Threads;
class A extends Thread{
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

class B extends Thread{
    public void run(){
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
public class MultipleTreads {
    public static void main(String[] args)  {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj2.getName());

        obj1.start();
        obj2.start();
    }
}
