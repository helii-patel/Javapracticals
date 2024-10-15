import java.util.Scanner;
import java.util.*;
class Parent
{
    void display()
    {
        System.out.println("This is parent...");
    }
};
class child extends Parent
{
    void display1()
    {
        System.out.println("child...");
    }
};
class pr16
{
public static void main(String[] args) 
{
    Parent p = new Parent();
        p.display(); // Calling Parent class method

        // Creating an object of Child class
        child c = new child();
        c.display(); // Calling Parent class method from Child object
        c.display1(); // Calling Child class method
    
}
}