package com.pravin.collectionAPI;



import java.util.ArrayList;
import java.util.List;


public class ALIst {
    public static void main(String[] args) {
        /*
        Collection nums = new ArrayList();
        nums.add(3);
        nums.add(5);
        nums.add(9);
        nums.add("4");

        System.out.println(nums);
        for (Object n : nums){
            System.out.println(nums);
        }


         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(5);
        nums.add(9);

        for (Integer k : nums){
            System.out.println(k);
        }

    }
}
