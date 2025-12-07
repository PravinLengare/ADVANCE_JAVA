package com.pravin.collectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetI {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(3);
        nums.add(5);
        nums.add(9);
        nums.add(3);

        // using the iterator

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){

            System.out.println(values.next());
        }

//        for (Integer i : nums){
//            System.out.println(i);
//        }
    }
}
