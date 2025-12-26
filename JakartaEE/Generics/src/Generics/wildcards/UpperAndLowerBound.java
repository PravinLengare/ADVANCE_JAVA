package Generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A{

    public <T> void printList(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }


    }
}
public class UpperAndLowerBound {
    public static double sum(List<? extends Number> numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }
    public static void sum1(List<? super Number> numbers) {
        numbers.add(23);
        numbers.add(1.5);
        numbers.add(2.53434);

        for (Object o : numbers){
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        /*
        A a = new A();
        List<?> arrayList = Arrays.asList("Apple", "Banana", "Orange");
        List<?> arrayInteger = Arrays.asList(1,3,3);

//        List l =  Arrays.asList(1,"jdf",2.2);
//
//       Double d = (Double) l.get(2);
//       Double  d1 = (Double) l.get(1);
//        System.out.println(d1);

        a.printList(arrayList);


         */

        List<? extends Number> arrayInteger = Arrays.asList(1,2,3);
        sum(arrayInteger);
        System.out.println("Sum of integers: " + sum(arrayInteger));

        List<Object> l = new ArrayList<>();
        sum1(l);

    }
}
