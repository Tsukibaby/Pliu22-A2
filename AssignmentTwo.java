// AssignmentTwo.java

public class AssignmentTwo {

    public static void main(String[] args) {

        Employee operator = new Employee("John", 30, "Male", "Ride Operator", 50000);

        Ride rollerCoaster = new Ride("Roller Coaster", 5, operator);

        Visitor visitor1 = new Visitor("Alice", 25, "Female", "VIP", "2024-12-16");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", "General", "2024-12-16");
        Visitor visitor3 = new Visitor("Charlie", 32, "Male", "VIP", "2024-12-16");
        Visitor visitor4 = new Visitor("David", 22, "Male", "General", "2024-12-16");
        Visitor visitor5 = new Visitor("Eve", 27, "Female", "VIP", "2024-12-16");

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        rollerCoaster.printQueue();

        rollerCoaster.runOneCycle();

        rollerCoaster.printRideHistory();
    }
}
