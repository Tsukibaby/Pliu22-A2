
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {

    private final String rideName;
    private int maxRiders;
    private Employee rideOperator;
    private final Queue<Visitor> queue;
    private final LinkedList<Visitor> rideHistory;

    public Ride() {
        this.rideName = "Unknown Ride";
        this.maxRiders = 0;
        this.rideOperator = null;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, int maxRiders, Employee rideOperator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.rideOperator = rideOperator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Visitor cannot be null.");
            return;
        }
        queue.add(visitor);
        System.out.println(visitor.getName() + " has been added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Visitor cannot be null.");
            return;
        }
        if (queue.remove(visitor)) {
            System.out.println(visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitors in the queue:");
            for (Visitor visitor : queue) {
                System.out.println(visitor.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("No ride operator assigned. Cannot run the ride.");
            return;
        }
        if (queue.isEmpty()) {
            System.out.println("No visitors in the queue to take the ride.");
            return;
        }

        int ridersCount = 0;
        while (!queue.isEmpty() && ridersCount < maxRiders) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
            ridersCount++;
        }
        System.out.println("Ride cycle completed with " + ridersCount + " visitors.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has taken the ride.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride yet.");
        } else {
            System.out.println("Visitors who have taken the ride:");

            for (Visitor visitor : rideHistory) {
                System.out.println(visitor.getName());
            }
        }
    }

    public String getRideName() {
        return rideName;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    public Queue<Visitor> getQueue() {
        return queue;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }
}
