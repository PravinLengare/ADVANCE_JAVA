package com.pravin.Functional_Interface;

@FunctionalInterface
interface  B{
    //void show(int i);
    int add(int i , int j);

}
public class LambdaExpression {
    public static void main(String[] args) {
        /*
        B obj = new B()
        {
            public void show(){
                System.out.println("I am in show");
            }
        };
        obj.show();

         */
        /*
        B obj = () -> System.out.println("In show");
        obj.show();

        B obj = (i) -> System.out.println(i +" in show");
        obj.show(5);

         */

        // with return values

        B obj =   (int i,int j) ->   i+j;

        int result = obj.add(3,4);
        System.out.println(result);

    }
}
