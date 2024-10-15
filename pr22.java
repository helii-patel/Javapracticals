 interface Shape {
    // Method to get the area of the shape
    double getArea();
    
    // Method to get the color of the shape
    String getColor();
    
    // Default method to describe the shape
    default String describe() {
        return "This is a shape with color " + getColor();
    }
}
3
 class circle implements Shape {
    private double radius;
    private String color;
    
    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    // Overriding describe method
    @Override
    public String describe() {
        return "This is a circle with radius " + radius + " and color " + color;
    }
}

 class rectangle implements Shape {
    private double length;
    private double width;
    private String color;
    
    public rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    // Overriding describe method
    @Override
    public String describe() {
        return "This is a rectangle with length " + length + ", width " + width + " and color " + color;
    }
}

 class sign {
    private Shape backgroundShape;
    private String text;
    
    public sign(Shape backgroundShape, String text) {
        this.backgroundShape = backgroundShape;
        this.text = text;
    }
    
    public void displaySign() {
        System.out.println(backgroundShape.describe());
        System.out.println("Sign text: " + text);
    }
}

public class pr22 {
    public static void main(String[] args) {
        Shape circle = new circle(5, "Red");
        Shape rectangle = new rectangle(4, 6, "Blue");
        
        sign circleSign = new sign(circle, "Welcome to the Campus Center!");
        sign rectangleSign = new sign(rectangle, "Library Entrance");
        
        // Displaying signs
        circleSign.displaySign();
        rectangleSign.displaySign();
    }
}
