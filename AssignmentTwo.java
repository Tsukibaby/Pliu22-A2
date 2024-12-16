
public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partFive();  //  Part 5 
        assignmentTwo.partSix();   //  Part 6 
        assignmentTwo.partSeven(); //  Part 7 
    }

    // Part 5: Run a cycle
    public void partFive() {
        // Create a new Ride object
        Employee rideOperator = new Employee("Tsuki", 30, "Male", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Timo", 13, rideOperator);

        // Create visitors and add them to the queue
        Visitor visitor1 = new Visitor("Ben", 25, "Female", "Regular", "2023-01-01");
        Visitor visitor2 = new Visitor("Jiangge", 28, "Male", "VIP", "2023-02-01");
        Visitor visitor3 = new Visitor("Xiaoyao", 35, "Male", "Regular", "2023-03-01");
        Visitor visitor4 = new Visitor("Fanyi", 22, "Female", "VIP", "2023-01-15");
        Visitor visitor5 = new Visitor("Litian", 27, "Female", "Regular", "2023-02-20");
        Visitor visitor6 = new Visitor("Gaofeng", 24, "Male", "VIP", "2023-03-10");
        Visitor visitor7 = new Visitor("Daniel", 30, "Female", "Regular", "2023-04-01");
        Visitor visitor8 = new Visitor("King", 26, "Female", "VIP", "2023-05-01");
        Visitor visitor9 = new Visitor("June", 32, "Male", "Regular", "2023-06-01");
        Visitor visitor10 = new Visitor("Jack", 40, "Male", "VIP", "2023-07-01");

        // Add visitors to the queue
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

        // Print visitors in the queue
        System.out.println("Before running cycle:");
        rollerCoaster.printQueue();

        // Run a cycle
        rollerCoaster.runOneCycle();

        // Print the visitors and history in the queue
        System.out.println("After running one cycle:");
        rollerCoaster.printQueue();
        rollerCoaster.printRideHistory();
    }

    // Part 6: Export visitor history to a file
    public void partSix() {
        // Create a new Ride object
        Employee rideOperator = new Employee("Tsuki", 30, "Male", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Timo", 13, rideOperator);

        // Create visitors and add them to history
        Visitor visitor1 = new Visitor("Ben", 25, "Female", "Regular", "2023-01-01");
        Visitor visitor2 = new Visitor("Jiangge", 28, "Male", "VIP", "2023-02-01");
        Visitor visitor3 = new Visitor("Xiaoyao", 35, "Male", "Regular", "2023-03-01");
        Visitor visitor4 = new Visitor("Fanyi", 22, "Female", "VIP", "2023-01-15");
        Visitor visitor5 = new Visitor("Litian", 27, "Female", "Regular", "2023-02-20");

        // Add visitors to history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Export visitor history to a file
        String filename = "ride_history.csv";
        rollerCoaster.exportRideHistory(filename);
    }

    // Part 7: Import visitor history from file
    public void partSeven() {
        // Create a new Ride object
        Employee rideOperator = new Employee("Tsuki", 30, "Male", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Timo", 13, rideOperator);

        // Import visitor history from file
        String filename = "ride_history.csv";
        rollerCoaster.importRideHistory(filename);

        // Print the history after import
        rollerCoaster.printRideHistory();
    }
}
