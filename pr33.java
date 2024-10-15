import java.util.Random;

// Thread to generate random numbers
class NumberGenerator extends Thread {
    public int number;
    public boolean isEven;

    @Override
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                number = rand.nextInt(100); // Generate a random number between 0 and 99
                System.out.println("Generated Number: " + number);

                // Check if the number is even or odd
                isEven = (number % 2 == 0);

                // Sleep for 1 second
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("NumberGenerator Thread Interrupted");
        }
    }
}

// Thread to compute square of even numbers
class SquareCalculator extends Thread {
    private final NumberGenerator generator;

    public SquareCalculator(NumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (generator.isEven) {
                    int square = generator.number * generator.number;
                    System.out.println("Square of " + generator.number + " (even) is: " + square);
                }
                // Sleep for a while to avoid racing conditions
                Thread.sleep(1100);
            }
        } catch (InterruptedException e) {
            System.out.println("SquareCalculator Thread Interrupted");
        }
    }
}

// Thread to compute cube of odd numbers
class CubeCalculator extends Thread {
    private final NumberGenerator generator;

    public CubeCalculator(NumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!generator.isEven) {
                    int cube = generator.number * generator.number * generator.number;
                    System.out.println("Cube of " + generator.number + " (odd) is: " + cube);
                }
                // Sleep for a while to avoid racing conditions
                Thread.sleep(1100);
            }
        } catch (InterruptedException e) {
            System.out.println("CubeCalculator Thread Interrupted");
        }
    }
}

public class pr33 {
    public static void main(String[] args) {
        // Create the number generator thread
        NumberGenerator generator = new NumberGenerator();

        // Create square and cube calculator threads
        SquareCalculator squareCalculator = new SquareCalculator(generator);
        CubeCalculator cubeCalculator = new CubeCalculator(generator);

        // Start all the threads
        generator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
