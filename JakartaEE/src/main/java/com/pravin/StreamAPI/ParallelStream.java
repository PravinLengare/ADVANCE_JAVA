package com.pravin.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {

        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random rand = new Random();

        for (int i = 1; i < size ; i++){
            nums.add(rand.nextInt());
        }

        /*

        int sum1 = nums.stream()
                .map(i -> i * 2)
                .reduce(0,(c,e)-> c+e);


         */
        Long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                        e.getCause();
                    }
                    return i * 2;
                 })
                .mapToInt(i -> i)
                .sum();

        Long endSeq = System.currentTimeMillis();

        Long startSeqP = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i ->{
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                    }
                    return  i * 2;
                })
                .mapToInt(i -> i)
                .sum();

        Long endSeqP = System.currentTimeMillis();

        System.out.println(" "+sum2+" "+sum3);

        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("SeqP : " + (endSeqP - startSeqP));


//        ToIntFunction<Integer> i =  i -> i;



    }

}
