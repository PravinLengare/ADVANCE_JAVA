package Functional_Interface;

import java.util.function.BiFunction;

@FunctionalInterface
interface Calculator{
    void execute(int a,int b);
    default void dec(){
        System.out.println("This is methods of calculator !");
    }
}
public class Basics {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> {
            int sum = a + b;
            System.out.println("Sum: "+sum);
            int sub = a - b;
            System.out.println("Sub: "+sub);
        };
        calculator.execute(5,3);
        /**
         * Using the BiFunction so for the two arguments this interface can be used
         */
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a + b;
        BiFunction<Integer,Integer,Integer> sub = (a,b) -> a - b;
        System.out.println(add.apply(2,3) + " "+sub.apply(4,3));
        calculator.dec();
    }


}
