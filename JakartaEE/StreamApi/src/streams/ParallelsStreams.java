package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelsStreams {
    public static void main(String[] args) {
        int size = 100;
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 1; i < size; i++) {
            list.add(random.nextInt(100));
        }

        long st = System.currentTimeMillis();

        int sum1 = list.stream()
                .map(i -> {
                    try{
                        Thread.sleep(10);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    return i  * 2;
                })
                .mapToInt(i -> i)
                .sum();

        long en = System.currentTimeMillis();
        int sum2 = list.stream()
                .map(i -> {
                    try{
                        Thread.sleep(10);
                    }catch (Exception e){
                        e.getCause();
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();

        long withPara = System.currentTimeMillis();
        int sum3 = list.parallelStream()
                .map(i -> {
                    try{
                        Thread.sleep(10);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();

        long endPara = System.currentTimeMillis();

        System.out.println(" "+sum1+" "+sum3);

        System.out.println("Seq : " + (en - st));
        System.out.println("Parallel : " + (endPara - withPara));


        // Method reference in the streams


     }
}
