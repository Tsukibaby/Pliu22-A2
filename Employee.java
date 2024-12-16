// Employee.java

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee() {
        super();
        this.position = "Unknown";
        this.salary = 0.0;
    }

    public Employee(String name, int age, String gender, String position, double salary) {
        super(name, age, gender);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
