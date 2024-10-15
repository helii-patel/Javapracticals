import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pr26 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file names as command line arguments.");
            return;
        }

        // Process each file provided in the command line arguments
        for (String pr22 : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(pr22))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(pr22 + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file: " + pr22 + " (" + e.getMessage() + ")");
            }
        }
    }
}
