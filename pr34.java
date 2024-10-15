class Incrementer extends Thread {
    private int value;

    public Incrementer(int startValue) {
        this.value = startValue;
    }

    @Override
    public void run() {
        try {
            // Sleep for 1 second (1000 milliseconds)
            Thread.sleep(1000);

            // Increment the value by 1
            value++;

            // Display the incremented value
            System.out.println("Value after increment: " + value);

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class pr34 {
    public static void main(String[] args) {
        int startValue = 10;  // Initial value

        // Create an Incrementer thread
        Incrementer incrementer = new Incrementer(startValue);

        // Start the thread
        incrementer.start();
    }
}
