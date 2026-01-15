package ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreads {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

//        scheduler.schedule(()->{
//                    System.out.println("Task executed after the 4 sec delay !");
//                    }
//                    ,4, TimeUnit.SECONDS
//                );

//        scheduler.scheduleAtFixedRate( () -> {
//            System.out.println("Task executed after the 2 sec delay and periodically every 5 sec  !");
//        },2,5,TimeUnit.SECONDS
//        );

//
        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task executed after the 5 sec delay and initial delay 3 !");
        },3,
                5,
                TimeUnit.SECONDS
        );
        scheduler.schedule(() -> {
                    System.out.println("Initialting shutdown......");
                    scheduler.shutdown();
                },10,TimeUnit.SECONDS
        );


    }
}

/**
 *  1. scheduler.schedule() -> Submits a one-shot task that becomes enabled after the given delay.
 *                          Params:
 *                          command – the task to execute
 *                          delay – the time from now to delay execution
 *                          unit – the time unit of the delay parameter
 */