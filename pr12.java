class employee1 {
    private String fname;
    private String lname;
    private double monWageOfEmp;

    public employee1(String fname, String lname, double monWageOfEmp) {
        this.fname = fname;
        this.lname = lname;
        setMonWageOfEmp(monWageOfEmp);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getMonWageOfEmp() {
        return monWageOfEmp;
    }

    public void setMonWageOfEmp(double monWageOfEmp) {
        if (monWageOfEmp < 0) {
            this.monWageOfEmp = 0.0;
        } else {
            this.monWageOfEmp = monWageOfEmp;
        }
    }

    public double getAnnualSalary() {
        return monWageOfEmp * 12;
    }

    public void increaseSalary() {
        monWageOfEmp *= 1.10;
    }
}

public class pr12 {
    public static void main(String[] args) {
        employee1 emp1 = new employee1("Heli", "Patel", 2100.00);
        employee1 emp2 = new employee1("Isha", "Patel", 4000.00);
        employee1 emp3 = new employee1("Dhani", "Patel", 4500.00);
        employee1 emp4 = new employee1("Nancy", "Patel", 4500.00);

        System.out.println("\n::::::::::ANNUAL SALARY DETAILS::::::::::");
        System.out.println(emp1.getFname() + " " + emp1.getLname() + "'s annual salary: " + emp1.getAnnualSalary());
        System.out.println(emp2.getFname() + " " + emp2.getLname() + "'s annual salary: " + emp2.getAnnualSalary());
        System.out.println(emp3.getFname() + " " + emp3.getLname() + "'s annual salary: " + emp3.getAnnualSalary());
        System.out.println(emp4.getFname() + " " + emp4.getLname() + "'s annual salary: " + emp4.getAnnualSalary());

        emp1.increaseSalary();
        emp2.increaseSalary();
        emp3.increaseSalary();
        emp4.increaseSalary();

        System.out.println("\n::::::::::ANNUAL SALARY AFTER 10% INCREASE DETAILS::::::::::");
        System.out.println(emp1.getFname() + " " + emp1.getLname() + "'s annual salary after 10% increase: " + emp1.getAnnualSalary());
        System.out.println(emp2.getFname() + " " + emp2.getLname() + "'s annual salary after 10% increase: " + emp2.getAnnualSalary());
        System.out.println(emp3.getFname() + " " + emp3.getLname() + "'s annual salary after 10% increase: " + emp3.getAnnualSalary());
        System.out.println(emp4.getFname() + " " + emp4.getLname() + "'s annual salary after 10% increase: " + emp4.getAnnualSalary());

        System.out.println("\n Made By: Heli Patel-23DIT044");
    }
}
