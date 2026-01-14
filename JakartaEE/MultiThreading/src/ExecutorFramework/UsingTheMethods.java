package ExecutorFramework;

import java.util.concurrent.*;

public class UsingTheMethods {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();

        /*
            Thread[] t = new Thread[9];
            for (int j = 1; j < 10; j++) {
                int finalI = j;
                int finalJ = j;
                t[j-1] = new Thread(()->{
                    long result = fact(finalJ);
                    System.out.println(result);
                });
                t[j-1].start();
            }

         */

        /**
         * after using the Executor interface we don't have the method to, shutdown the threads
         * we have do it manually
         * but if we use the Executor Service interface then we have the access to , shutdown the threads
         */

        ExecutorService executor = Executors.newFixedThreadPool(5);
        //Executor executor = Executors.newFixedThreadPool(3);
        for (int j = 1; j < 10; j++) {
            int finalI = j;
            Future<?> future = executor.submit(()-> {
                long result =  fact(finalI);
                System.out.println(result);
            });

        }
        executor.shutdown();
        /**
         * not allowed after the shutdown -> then it will not take any task to do it will throw errors.
         */
//        executor.submit(()-> {
//            long result = 2;
//            System.out.println(result);
//        });
        while (! executor.awaitTermination(1,TimeUnit.MILLISECONDS)){
            System.out.println("Waiting.......");
            executor.shutdownNow();
        }

        System.out.println("The time required is "+(System.currentTimeMillis() - startTime));
    }
        // elicit ,paper-pal,julisus
    private static int fact(int i) {
        int f = 1;
        for (int j = 1; j <=i ; j++) {
            f = f * j;
        }
        return f;
    }
}
