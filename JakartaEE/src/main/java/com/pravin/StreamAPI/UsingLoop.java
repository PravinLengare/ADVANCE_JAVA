package com.pravin.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingLoop {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,7,8);

        System.out.println(nums);
        int sum = 0;
        for (Integer n : nums){
            if(n%2==0){
                n = n*2;
                sum = sum + n;
            }
        }

        System.out.println(sum);

        for (int i = 0 ; i < nums.size();i++){
            System.out.println(nums.get(i));
        }
        // How forEach Works
        /*
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

         */
        /*
        Consumer<Integer> con = n -> System.out.println(n);

        This con obj we have to pass in the method.
         */

        nums.forEach(n -> System.out.println(n));
    }
}
