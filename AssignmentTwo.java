
public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
    }

    public void partThree() {
        // Create a new Ride object
        Employee rideOperator = new Employee("John Doe", 30, "Male", "Ride Operator", 50000);

        // Create Visitor objects with appropriate constructors
        Visitor visitor1 = new Visitor("Alice", 25, "Female", "Regular", "Roller Coaster");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", "VIP", "Water Ride");
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", "Regular", "Haunted House");
        Visitor visitor4 = new Visitor("Diana", 22, "Female", "VIP", "Roller Coaster");
        Visitor visitor5 = new Visitor("Eve", 27, "Female", "Regular", "Ferris Wheel");

        // Create a new Ride and add visitors to the queue
        Ride rollerCoaster = new Ride("Roller Coaster", 3, rideOperator);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print all visitors in the queue
        rollerCoaster.printQueue();

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue(visitor3);

        // Print all visitors in the queue after removal
        rollerCoaster.printQueue();
    }
}
