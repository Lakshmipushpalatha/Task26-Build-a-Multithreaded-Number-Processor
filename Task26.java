import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Task26 {

    static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static long singleThread(int limit) {

        long count = 0;

        for (int i = 2; i <= limit; i++) {

            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    static long multiThread(int limit, int threads)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(threads);

        List<Future<Long>> results = new ArrayList<>();

        int range = (limit - 1 + threads - 1) / threads;

        for (int i = 0; i < threads; i++) {

            final int start = 2 + i * range;
            final int end = Math.min(limit, start + range - 1);

            results.add(executor.submit(() -> {

                long count = 0;

                for (int j = start; j <= end; j++) {

                    if (isPrime(j)) {
                        count++;
                    }
                }

                return count;
            }));
        }

        long totalCount = 0;

        for (Future<Long> result : results) {
            totalCount += result.get();
        }

        executor.shutdown();

        return totalCount;
    }

    public static void main(String[] args) throws Exception {

        int limit = 1000000;

        int threads = Runtime.getRuntime()
                             .availableProcessors();

        System.out.println("Number Processor");
        System.out.println("------------------------");

        System.out.println("Limit: " + limit);
        System.out.println("Threads: " + threads);


        long start1 = System.nanoTime();

        long singleResult = singleThread(limit);

        long end1 = System.nanoTime();

        long singleTime = end1 - start1;


        long start2 = System.nanoTime();

        long multiResult = multiThread(limit, threads);

        long end2 = System.nanoTime();

        long multiTime = end2 - start2;

        System.out.println("\nSingle Thread Result: "
                           + singleResult);

        System.out.println("Single Thread Time: "
                           + singleTime / 1000000.0 + " ms");

        System.out.println("\nMulti Thread Result: "
                           + multiResult);

        System.out.println("Multi Thread Time: "
                           + multiTime / 1000000.0 + " ms");

        System.out.println("\nExecution Comparison:");

        if (multiTime < singleTime) {

            System.out.println(
                "Multithreading is faster in this run.");

        } else {

            System.out.println(
                "Single threading is faster in this run.");
        }

        System.out.println("\nBoth results are equal: "
                           + (singleResult == multiResult));
    }
}
