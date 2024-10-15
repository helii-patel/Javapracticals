import java.util.Random;
import java.util.Scanner;

public class pr5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfAttempts = 0;
        boolean Guessed = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (!Guessed) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                Guessed = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                System.out.println("\n Made by: Heli Patel-23DIT044");
            }

        }

    }
}