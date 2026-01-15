package ExecutorFramework;

import java.util.concurrent.*;

class DependentService implements Callable<String> {
    private final CountDownLatch latch;

    DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(6000);
        } finally {
            latch.countDown();
        }
        return "ok";
    }
}
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        int count = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        CountDownLatch latch = new CountDownLatch(count);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await(5000, TimeUnit.MILLISECONDS);
        System.out.println("Main");
        executorService.shutdownNow();
    }
}
/**
 * Once the count reaches to the zero it can't be initialize again so use the cyclic Barrier
 */