import java.util.InputMismatchException;
import java.util.Scanner;

public class pr23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input for x
            System.out.print("Enter the first integer (x): ");
            int x = scanner.nextInt();

            // Taking input for y
            System.out.print("Enter the second integer (y): ");
            int y = scanner.nextInt();

            // Performing the division
            int result = divide(x, y);
            System.out.println("Result of " + x + " / " + y + " = " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }

        System.out.println("Program continues after exception handling.");
    }

    public static int divide(int num, int denom) {
        if (denom == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num / denom;
    }
}

