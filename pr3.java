import java.util.Scanner;

public class pr3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile number in format +91-AA-BBB-CCCCC: ");
        String input = scanner.nextLine();

        // Validate and parse input
        if (input.matches("\\+91-\\d{2}-\\d{3}-\\d{5}")) {
            String[] parts = input.split("-");
            String operatorCode = parts[1];
            String mscCode = parts[2];
            String uniqueCode = parts[3];

            System.out.println("Mobile system operator code is: " + operatorCode);
            System.out.println("MSC code is: " + mscCode);
            System.out.println("Unique code is: " + uniqueCode);
        } else {
            System.out.println("Invalid input format. Please enter the mobile number in the format +91-AA-BBB-CCCCC.");
        }

        scanner.close();
        System.out.println("23DIT044-Heli Patel");
    }
}
