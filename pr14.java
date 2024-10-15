import java.util.Scanner;
import java.util.*;

public class pr14 {
    double length;
    double breadth;

    public pr14(double len, double brd) {
        this.length = len;
        this.breadth = brd;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        pr14 rectangle = new pr14(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.returnArea());

        scanner.close();
        System.out.println("23DIT044-Heli Patel");
    }
}
