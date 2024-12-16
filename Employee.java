
public class Employee extends Person {

    private String position;  // 员工职位
    private double salary;    // 员工薪水

    // 默认构造函数
    public Employee() {
        super(); // 调用父类构造函数
        this.position = "Unknown"; // 默认职位为"未知"
        this.salary = 0.0;  // 默认薪水为0
    }

    // 带参数的构造函数
    public Employee(String name, int age, String gender, String position, double salary) {
        super(name, age, gender); // 调用父类构造函数
        this.position = position; // 设置职位
        this.salary = salary;     // 设置薪水
    }

    // 获取职位
    public String getPosition() {
        return position;
    }

    // 设置职位
    public void setPosition(String position) {
        this.position = position;
    }

    // 获取薪水
    public double getSalary() {
        return salary;
    }

    // 设置薪水
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 重写toString方法，方便打印员工信息
    @Override
    public String toString() {
        return "Employee: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender()
                + ", Position: " + position + ", Salary: " + salary;
    }
}
