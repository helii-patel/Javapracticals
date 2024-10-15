// // User-defined exception
// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String message) {
//         super(message);
//     }
// }

// public class pr25 {

//     // Method that throws the user-defined exception
//     public static void checkAge(int age) throws InvalidAgeException {
//         if (age < 18) {
//             // Throwing the user-defined exception
//             throw new InvalidAgeException("Age is less than 18, not eligible to vote.");
//         } else {
//             System.out.println("Eligible to vote.");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             checkAge(15); // This will throw an exception
//         } catch (InvalidAgeException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }

//         try {
//             checkAge(20); // This will not throw an exception
//         } catch (InvalidAgeException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }


import java.io.*;

// Class that demonstrates checked and unchecked exceptions
public class pr25 {

    // Method that throws a checked exception (IOException)
    public static void readFile() throws IOException {
        // This will cause a checked exception (IOException)
        FileReader file = new FileReader("nonexistentfile.txt");
        BufferedReader fileInput = new BufferedReader(file);
        
        fileInput.readLine();
    }

    public static void main(String[] args) {
        
        // Unchecked Exception - ArithmeticException
        try {
            int division = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: ArithmeticException - " + e.getMessage());
        }

        // Unchecked Exception - ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            arr[10] = 20; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Unchecked Exception: ArrayIndexOutOfBoundsException - " + e.getMessage());
        }

        // Checked Exception - IOException
        try {
            readFile(); // This will cause IOException
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: IOException - " + e.getMessage());
        }

        // Checked Exception - ClassNotFoundException
        try {
            Class.forName("some.nonexistent.Class"); // This will cause ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Checked Exception: ClassNotFoundException - " + e.getMessage());
        }
    }
}

