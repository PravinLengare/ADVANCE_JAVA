package com.pravin.Functional_Interface;

@FunctionalInterface
interface A {
    void show();
}
public class basic {
    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("In show");
            }
        };
        a.show();
    }
}
