public class pr24 {

    public static void main(String[] args) 
    {
        int number = -1; // Example number to test the exception

        try {
            checkPositiveNumber(number);
            System.out.println("The number is positive: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    public static void checkPositiveNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        }
    }
}

// Custom Exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
