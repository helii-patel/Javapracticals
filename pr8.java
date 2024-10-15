import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        String input = "The"; // Example input
        String result = doubleCharacters(input);
        System.out.println(result); // Output: "TThhee"
        System.out.println("23DIT044-Heli Patel");
    }

    public static String doubleCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder doubledString = new StringBuilder(input.length() * 2);

        for (char c : input.toCharArray()) {
            doubledString.append(c).append(c);
        }

        return doubledString.toString();
    }
}
