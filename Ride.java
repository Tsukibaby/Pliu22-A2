
import java.io.*;
import java.util.*;

public class Ride {

    private final String rideName;
    private final int maxRiders;
    private final Employee rideOperator;
    private final Queue<Visitor> queue;
    private final List<Visitor> rideHistory;  // Ride history
    private int numOfCycles = 0;

    public Ride(String rideName, int maxRiders, Employee rideOperator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.rideOperator = rideOperator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Add visitor to the queue
    public void addVisitorToQueue(Visitor visitor) {
        if (queue.size() < maxRiders * 2) {
            queue.add(visitor);
            System.out.println(visitor.getName() + " added to the queue.");
        } else {
            System.out.println("Queue is full. Cannot add " + visitor.getName());
        }
    }

    // Move visitor to the ride history
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has taken the ride and added to history.");
    }

    // Run one cycle
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("Cannot run the ride. No ride operator assigned.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("Cannot run the ride. No visitors in the queue.");
            return;
        }

        int count = Math.min(maxRiders, queue.size());
        for (int i = 0; i < count; i++) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
        }

        numOfCycles++;
        System.out.println("Cycle " + numOfCycles + " completed.");
    }

    // Print all visitors in the ride history
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor);  // Call Visitor's toString method
        }
    }

    // Print all visitors in the queue
    public void printQueue() {
        System.out.println("Queue:");
        for (Visitor visitor : queue) {
            System.out.println(visitor);
        }
    }

    // Export the ride history to a file
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender()
                        + "," + visitor.getTicketType() + "," + visitor.getVisitDate());
                writer.newLine();
            }
            System.out.println("Ride history successfully exported to " + filename);
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
    }

    // Part 7: Import ride history from a file
    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split by comma
                String[] visitorData = line.split(",");
                if (visitorData.length == 5) {
                    String name = visitorData[0];
                    int age = Integer.parseInt(visitorData[1]);
                    String gender = visitorData[2];
                    String ticketType = visitorData[3];
                    String visitDate = visitorData[4];

                    // Create Visitor object
                    Visitor visitor = new Visitor(name, age, gender, ticketType, visitDate);

                    // Add visitor to the ride history
                    rideHistory.add(visitor);
                    System.out.println(visitor.getName() + " imported to ride history.");
                }
            }
            System.out.println("Import completed successfully. Total visitors imported: " + rideHistory.size());
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please ensure the file exists.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing data. Make sure the file format is correct.");
        }
    }

    // Getter and Setter methods
    public String getRideName() {
        return rideName;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public Queue<Visitor> getQueue() {
        return queue;
    }

    public List<Visitor> getRideHistory() {
        return rideHistory;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }
}
