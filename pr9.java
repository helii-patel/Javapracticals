import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class pr9 {
    public static void main(String[] args) {
        String str = "ExampleString"; // Example input

        System.out.println("Original String: " + str);
        System.out.println("Length of the String: " + getLength(str));
        System.out.println("Lowercase of the String: " + toLowerCase(str));
        System.out.println("Uppercase of the String: " + toUpperCase(str));
        System.out.println("uppercase is:", +toUpperCaseManual(str));
        System.out.println("Reversed String: " + reverseString(str));
        System.out.println("Sorted String: " + sortString(str));
    }

    // Method to find the length of the string
    public static int getLength(String str) {
        return str.length();
    }

    // Method to convert the string to lowercase
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // public class CustomUpperCase {
    public static void main(String[] args) {
        String str = "ExampleString"; // Example input
        String result = toUpperCaseManual(str);
        System.out.println("Uppercase String: " + result);
    }

    public static String toUpperCaseManual(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder upperCaseString = new StringBuilder(str.length());

        for (char c : str.toCharArray()) {
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase by subtracting the difference
                upperCaseString.append((char) (c - ('a' - 'A')));
            } else {
                // If it's not a lowercase letter, just append it as is
                upperCaseString.append(c);
            }
        }

        return upperCaseString.toString();
    }

    }

    // Method to convert the string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Method to reverse the string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to sort the string
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}