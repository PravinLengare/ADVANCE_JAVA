package ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableAndRunnable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

//
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        /**
//         * In case of runnable only future method will return the null after the complete successfully execution
//         */
//        // Future<?> future = executorService.submit(() -> System.out.println("Hi runnable "));
//
//        /**
//         *  The Future's get method will return the task's result upon successful completion
//         */
//        // Future<Integer> future = executorService.submit(() -> 23);
//
//        /**
//         * The Future's get method will return the given result upon successful completion.
//         */
//        Future<Integer> future = executorService.submit(() -> System.out.println("The result of runnable is : "),23);
//
//        /**
//         * Returns true if this task completed. Completion may be due to normal termination, an exception, or cancellation --
//         * in all of these cases, this method will return true.
//         */
//
//        try {
//            System.out.println(future.get());
//            if (future.isDone()){
//                System.out.println("Success !");
//            }
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//        }
//        executorService.shutdown();
//        System.out.println(executorService.isShutdown());
//        Thread.sleep(100);
//        System.out.println(executorService.isTerminated());

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<Integer> collable1 = () -> {
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> collable2 = () -> {
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> collable3 = () -> {
            Thread.sleep(2222);
            System.out.println("Task 3");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(collable1,collable2,collable3);
        List<Future<Integer>> future = executorService.invokeAll(list,2000,TimeUnit.MILLISECONDS);
        System.out.println("Hello");
        for (Future<Integer> f:future){
            System.out.println(f.get());
        }
        executorService.shutdown();

    }
}

/**
 * 1 . future.get() -> this wait till all tasks are done
 * And then returns the values
 * 2 . executorService.isShutdown() -> Returns true if this executor has been shut down
 * 3 . executorService.isTerminated() -> Return true if all tasks are completed following the shutdown and shutdownNow
 * 4.  executorService.invokeAll(list) -> Executes the given tasks, returning a list of Futures holding their status and results when all complete. Future.isDone is true for each element of the returned list. Note that a completed task could have terminated either normally or by throwing an exception. The results of this method are undefined
 *                                        if the given collection is modified while this operation is in progress
 */
