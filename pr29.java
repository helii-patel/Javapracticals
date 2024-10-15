import java.io.*;

public class pr29 {
    
    // Method to copy data from source file to destination file
    public static void copyFile(String sourceFile, String destinationFile) {
        File srcFile = new File(sourceFile);
        File destFile = new File(destinationFile);

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            // Read and write data byte by byte
            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + sourceFile);
        } catch (IOException e) {
            System.out.println("Error while copying file.");
        }
    }

    public static void main(String[] args) {
        // Example: Input the source and destination file names
        if (args.length < 2) {
            System.out.println("Usage: java FileCopy <source-file> <destination-file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        // Call the method to copy data from source to destination
        copyFile(sourceFile, destinationFile);

        System.out.println("\nMade by: Heli Patel-23DIT044");
    }
}

