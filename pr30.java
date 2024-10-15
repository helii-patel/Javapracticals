import java.io.*;

public class pr30 {

    // Method to demonstrate Byte Stream (copying file using bytes)
    public static void byteStreamExample(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied using Byte Stream successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while using byte stream.");
        }
    }

    // Method to demonstrate Character Stream (copying file using characters)
    public static void characterStreamExample(String sourceFile, String destinationFile) {
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destinationFile)) {

            int data;
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }

            System.out.println("File copied using Character Stream successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while using character stream.");
        }
    }

    // Method to demonstrate use of BufferedReader and BufferedWriter
    public static void bufferedReaderWriterExample(String outputFile) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            System.out.println("Enter text (type 'exit' to finish):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Text has been written to " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred while using BufferedReader/BufferedWriter.");
        }
    }

    public static void main(String[] args) {
        // Byte Stream Example
        byteStreamExample("sourceByte.txt", "destinationByte.txt");

        // Character Stream Example
        characterStreamExample("sourceChar.txt", "destinationChar.txt");

        // BufferedReader/BufferedWriter Example (reading console input and writing to file)
        bufferedReaderWriterExample("consoleOutput.txt");

        System.out.println("\nMade by: Heli Patel-23DIT044");
    }
}
