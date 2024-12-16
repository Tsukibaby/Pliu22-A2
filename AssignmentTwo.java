
public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partFive();  // 运行 Part 5 测试方法
        assignmentTwo.partSix();   // 运行 Part 6 测试方法
    }

    // Part 5: 运行一个周期
    public void partFive() {
        // 创建一个新的 Ride 对象
        Employee rideOperator = new Employee("John Doe", 30, "Male", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 3, rideOperator);

        // 创建游客并添加到队列
        Visitor visitor1 = new Visitor("Alice", 25, "Female", "Regular", "2023-01-01");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", "VIP", "2023-02-01");
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", "Regular", "2023-03-01");
        Visitor visitor4 = new Visitor("Diana", 22, "Female", "VIP", "2023-01-15");
        Visitor visitor5 = new Visitor("Eve", 27, "Female", "Regular", "2023-02-20");
        Visitor visitor6 = new Visitor("Frank", 24, "Male", "VIP", "2023-03-10");
        Visitor visitor7 = new Visitor("Grace", 30, "Female", "Regular", "2023-04-01");
        Visitor visitor8 = new Visitor("Hannah", 26, "Female", "VIP", "2023-05-01");
        Visitor visitor9 = new Visitor("Isaac", 32, "Male", "Regular", "2023-06-01");
        Visitor visitor10 = new Visitor("Jack", 40, "Male", "VIP", "2023-07-01");

        // 向队列中添加游客
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        // 打印队列中的游客
        System.out.println("Before running cycle:");
        rollerCoaster.printQueue();

        // 运行一个周期
        rollerCoaster.runOneCycle();

        // 打印队列中的游客和历史记录
        System.out.println("After running one cycle:");
        rollerCoaster.printQueue();
        rollerCoaster.printRideHistory();
    }

    // Part 6: 导出游客历史记录到文件
    public void partSix() {
        // 创建一个新的 Ride 对象
        Employee rideOperator = new Employee("John Doe", 30, "Male", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 3, rideOperator);

        // 创建游客并添加到历史记录
        Visitor visitor1 = new Visitor("Alice", 25, "Female", "Regular", "2023-01-01");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", "VIP", "2023-02-01");
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", "Regular", "2023-03-01");
        Visitor visitor4 = new Visitor("Diana", 22, "Female", "VIP", "2023-01-15");
        Visitor visitor5 = new Visitor("Eve", 27, "Female", "Regular", "2023-02-20");

        // 将游客添加到历史记录中
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // 导出游客历史记录到文件
        String filename = "ride_history.csv";
        rollerCoaster.exportRideHistory(filename);
    }
}
