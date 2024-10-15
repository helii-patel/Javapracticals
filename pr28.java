public class pr28 {
    public static void main(String[] args) {
        // Creating wrapper objects from primitive types
        Integer intObj = Integer.valueOf(100); // Wrapping an int into an Integer object
        Double doubleObj = Double.valueOf(45.75); // Wrapping a double into a Double object

        // Converting wrapper objects to primitives (unboxing)
        int intValue = intObj.intValue(); 
        double doubleValue = doubleObj.doubleValue();

        // Displaying the values
        System.out.println("Integer object: " + intObj);
        System.out.println("Primitive int value: " + intValue);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive double value: " + doubleValue);
    }
}
