class pr32 implements Runnable {

    private final int start;
    private final int end;
    private final long[] result;
    private final int index;

    // Constructor to initialize the task
    public pr32(int start, int end, long[] result, int index) {
        this.start = start;
        this.end = end;
        this.result = result;
        this.index = index;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        result[index] = sum; // Store the partial result
    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length != 2) {
            System.out.println("Usage: java SumTask <N> <number_of_threads>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        long[] results = new long[numThreads]; // Array to hold partial results
        Thread[] threads = new Thread[numThreads];

        int range = N / numThreads; // Range of numbers each thread will handle
        int start = 1;

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int end = (i == numThreads - 1) ? N : start + range - 1;
            threads[i] = new Thread(new pr32(start, end, results, i));
            threads[i].start();
            start = end + 1;
        }

        // Wait for all threads to complete
        for (Thread t : threads) {
            t.join();
        }

        // Sum up all the partial results
        long totalSum = 0;
        for (long partialSum : results) {
            totalSum += partialSum;
        }

        // Display the final result
        System.out.println("Sum of numbers from 1 to " + N + " is: " + totalSum);
    }
}
