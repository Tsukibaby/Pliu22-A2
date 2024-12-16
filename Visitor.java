
public class Visitor extends Person {

    private String ticketType;  // Ticket type (e.g., General, VIP)
    private String visitDate;   // Date of the visit

    // Default constructor
    public Visitor() {
        super(); // Call the parent class constructor
        this.ticketType = "General"; // Default ticket type is "General"
        this.visitDate = "Unknown";  // Default visit date is "Unknown"
    }

    // Parameterized constructor
    public Visitor(String name, int age, String gender, String ticketType, String visitDate) {
        super(name, age, gender); // Call the parent class constructor
        this.ticketType = ticketType; // Set the ticket type
        this.visitDate = visitDate;  // Set the visit date
    }

    // Get ticket type
    public String getTicketType() {
        return ticketType;
    }

    // Set ticket type
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // Get visit date
    public String getVisitDate() {
        return visitDate;
    }

    // Set visit date
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    // Override toString method to print visitor's details
    @Override
    public String toString() {
        return "Visitor: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender()
                + ", Ticket Type: " + ticketType + ", Visit Date: " + visitDate;
    }
}
