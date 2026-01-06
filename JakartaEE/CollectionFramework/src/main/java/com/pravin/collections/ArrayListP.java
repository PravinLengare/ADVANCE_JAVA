package com.pravin.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.Integer.valueOf;

public class ArrayListP {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);

        list.set(1,5);
        // System.out.println(list.get(0));
        for (Integer i : list){
            System.out.println(i);
        }

        System.out.println(list.contains(2));



         */


        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(3);
        System.out.println(list2.getClass().getName());

        List<String> list = Arrays.asList("Monday", "Tuesday");
        System.out.println(list.getClass().getName());

        List<Integer> list1 = Arrays.asList(1,2,3,3);
        System.out.println(list1.getClass().getName());
        // list1.add(3);
        list1.set(2,44);
        System.out.println(list1);
        /**
         * In the arrays.asList we can update not add
         * but in the list.of we can not do like add and update also.
         */

        List<Integer> list3 = List.of(2,34,5);
        // list3.set(5,3);


        list2.remove(valueOf(3));
        System.out.println(list2);

        Object[] array = list2.toArray();
        Integer[] arrau2 = list2.toArray(new Integer[0]);
        System.out.println(arrau2);


        Integer a = Integer.valueOf(2);
        System.out.println(a);


        Iterator<Integer> it = list2.iterator();

        while(it.hasNext()) {
            // 3. Get the next item and print it
            System.out.println(it.next());
        }


    }
}
