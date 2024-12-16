
public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partFourB();
    }

    public void partFourB() {
        // 创建一个新的 Ride 对象
        Employee rideOperator = new Employee("John Doe", 30, "Male", "Ride Operator", 50000);
        Visitor visitor1 = new Visitor("Alice", 25, "Female", "Regular", "2023-01-01");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", "VIP", "2023-02-01");
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", "Regular", "2023-03-01");
        Visitor visitor4 = new Visitor("Diana", 22, "Female", "VIP", "2023-01-15");
        Visitor visitor5 = new Visitor("Eve", 27, "Female", "Regular", "2023-02-20");

        // 创建一个新的 Ride 并添加游客到历史
        Ride rollerCoaster = new Ride("Roller Coaster", 3, rideOperator);
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // 打印游玩过的游客（排序前）
        System.out.println("Before sorting:");
        rollerCoaster.printRideHistory();

        // 排序游乐历史
        rollerCoaster.sortRideHistory();

        // 打印排序后的游客
        System.out.println("After sorting:");
        rollerCoaster.printRideHistory();
    }
}
