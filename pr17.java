import java.util.*;
import java.util.Scanner;

class member {
    //Employee details
    String name = new String("Heli");
    int age = 19;
    long ph_no = 7567092398L;
    String address = new String("21,Saryuvilla-3");
    int salary = 90000;

    void printsalary() {
        System.out.println("Salary: " + salary);
    }
//manager details
    String name1 = new String("Kaksha");
    int age1 = 24;
    long ph_no1 = 7566992398L;
    String address1 = new String("21,Saryuvilla-3");
    long salary1 = 100000L;

    void printsalary1() {
        System.out.println("Salary: " + salary1);
    }

};

class Employee extends member {
    String sp = new String("programmar");
    // Method to print Employee details

    void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + ph_no);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + sp);
        printsalary();
    }
};

class manager extends member {
    String dept1 = new String("SBI");
    // Method to print Manager details

    void printDetails1() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Phone Number: " + ph_no1);
        System.out.println("Address: " + address1);
        System.out.println("Department: " + dept1);
        printsalary1();
    }

}

public class pr17 {
    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee();
        emp.printDetails();

        // Creating Manager object
        manager mgr = new manager();
        mgr.printDetails1();

    }
}



// import java.util.*;

// class Member {
// String name;
// int age;
// long phoneNumber;
// String address;
// double salary;

// void printSalary() {
// System.out.println("Salary: " + salary);
// }
// }

// class Employee extends Member {
// String specialization;

// // Constructor to initialize Employee attributes
// Employee(String name, int age, long phoneNumber, String address, double
// salary, String specialization) {
// this.name = name;
// this.age = age;
// this.phoneNumber = phoneNumber;
// this.address = address;
// this.salary = salary;
// this.specialization = specialization;
// }

// // Method to print Employee details
// void printDetails() {
// System.out.println("Employee Details:");
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// System.out.println("Phone Number: " + phoneNumber);
// System.out.println("Address: " + address);
// System.out.println("Specialization: " + specialization);
// printSalary();
// }
// }

// class Manager extends Member {
// String department;

// // Constructor to initialize Manager attributes
// Manager(String name, int age, long phoneNumber, String address, double
// salary, String department) {
// this.name = name;
// this.age = age;
// this.phoneNumber = phoneNumber;
// this.address = address;
// this.salary = salary;
// this.department = department;
// }

// // Method to print Manager details
// void printDetails() {
// System.out.println("Manager Details:");
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// System.out.println("Phone Number: " + phoneNumber);
// System.out.println("Address: " + address);
// System.out.println("Department: " + department);
// printSalary();
// }
// }

// public class pr17 {
// public static void main(String[] args) {
// // Creating Employee object
// Employee emp = new Employee("Heli", 19, 7567092398L, "21, Saryuvilla-3",
// 90000, "Programmer");
// emp.printDetails();

// // Creating Manager object
// Manager mgr = new Manager("Kaksha", 24, 7566992398L, "201,avadh-3", 120000,
// "BOB");
// mgr.printDetails();
// }
// }
