import java.util.Scanner;

public class pr2 {
    // Arrays to store letters and corresponding Morse codes
    private static final char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
    private static final String[] morseCodes = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", 
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", 
        "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", 
        "----.", "-----"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter '1' to convert text to Morse code, '2' to convert Morse code to text:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (choice == 1) {
            System.out.println("Enter the string to be converted to Morse code:");
            String input = scanner.nextLine().toUpperCase();
            System.out.println("Morse Code: " + textToMorse(input));
        } else if (choice == 2) {
            System.out.println("Enter the Morse code to be converted to text (separate each letter with space):");
            String input = scanner.nextLine();
            System.out.println("Text: " + morseToText(input));
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Method to convert text to Morse code
    private static String textToMorse(String text) {
        String morse = "";
        for (char c : text.toCharArray()) {
            int index = getIndex(c);
            if (index != -1) {
                morse += morseCodes[index] + " ";
            } else {
                morse += " "; // For spaces between words
            }
        }
        return morse.trim();
    }

    // Method to convert Morse code to text
    private static String morseToText(String morse) {
        String text = "";
        String[] morseArray = morse.split(" ");
        for (String morseLetter : morseArray) {
            int index = getIndex(morseLetter);
            if (index != -1) {
                text += letters[index];
            } else {
                text += " "; // For spaces between words
            }
        }
        return text.trim();
    }

    // Helper method to get index of a character in the letters array
    private static int getIndex(char c) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == c) {
                return i;
            }
        }
        return -1;
    }

    // Helper method to get index of a Morse code in the morseCodes array
    private static int getIndex(String morse) {
        for (int i = 0; i < morseCodes.length; i++) {
            if (morseCodes[i].equals(morse)) {
                return i;
            }
        }
        return -1;
    }
}
