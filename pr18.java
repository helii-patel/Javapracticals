import java.util.*;
import java.util.Scanner;
class Rectangle {
    public double length;
    public double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print the area of the rectangle
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to print the perimeter of the rectangle
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle {

    // Constructor
    public Square(double side) {
        super(side, side);
    }
}

public class pr18 {
    public static void main(String[] args) {
        // Create an array of Rectangle and Square objects
        Rectangle[] shapes = new Rectangle[2];

        // Initialize the array with a rectangle and a square
        shapes[0] = new Rectangle(3.4, 5); // Rectangle with length 4 and breadth 5
        shapes[1] = new Square(5.5);       // Square with side 4

        // Print area and perimeter of the rectangle
        System.out.println("Rectangle:");
        shapes[0].printArea();
        shapes[0].printPerimeter();

        // Print area and perimeter of the square
        System.out.println("Square:");
        shapes[1].printArea();
        shapes[1].printPerimeter();
    }
}


