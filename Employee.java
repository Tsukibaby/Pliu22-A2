
public class Employee extends Person {

    private String position;  // Staff position
    private double salary;    // Employee salary

    // Default constructor
    public Employee() {
        super(); // Call the parent class constructor
        this.position = "Unknown"; // Default position is "Unknown"
        this.salary = 0.0;  // The default salary is 0
    }

    // A constructor with arguments
    public Employee(String name, int age, String gender, String position, double salary) {
        super(name, age, gender); // Call the parent class constructor
        this.position = position; // Set up a position
        this.salary = salary;     // Set salary
    }

    // Get a job
    public String getPosition() {
        return position;
    }

    // Set up a position
    public void setPosition(String position) {
        this.position = position;
    }

    // Get a salary
    public double getSalary() {
        return salary;
    }

    // Set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the toString method to print employee information
    @Override
    public String toString() {
        return "Employee: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender()
                + ", Position: " + position + ", Salary: " + salary;
    }
}
