package dai.hong.wei.test.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Date:18/9/9
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Fibonacci2 implements Callable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        ArrayList<Future<Integer>> results = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            results.add(executorService.submit(new Fibonacci2(i)));
        }
        Thread.yield();
        executorService.shutdown();
        for (Future<Integer> future :
                results) {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private int count;
    private final int n;

    public Fibonacci2(int n) {
        this.n = n;
    }

    public Integer next() {
        return fibonacci(count++);
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += next();
        return sum;
    }

    private int fibonacci(int n) {
        if (n < 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
