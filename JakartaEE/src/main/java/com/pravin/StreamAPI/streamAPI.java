package com.pravin.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,7,2,8);

        /*
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0,(c,e)->c+e);



        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));

        System.out.println(result);

         */


        // IN ONE LINE

        int result = nums.stream()
                .filter(n -> n%2==0)
                .map(n-> n*2)
                .reduce(0,(c,e)-> c+e);

        System.out.println(result);


        // Do Experiments

        Predicate<Integer> p =   n -> n%2==0;

        Function<Integer,Integer> fun =  n -> n*2;

        BinaryOperator<Integer> b =   (c,  e) ->  c + e;


        // Printing the sorted values

        Stream<Integer> sorted = nums.stream()
                .filter(n->n%2==0)
                .sorted();

       sorted.forEach(n-> System.out.println(n));









    }
}
