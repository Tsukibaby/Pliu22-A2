
public class Visitor extends Person {

    private String ticketType;
    private String visitDate;

    public Visitor() {
        super();
        this.ticketType = "General";
        this.visitDate = "Unknown";
    }

    public Visitor(String name, int age, String gender, String ticketType, String visitDate) {
        super(name, age, gender);
        this.ticketType = ticketType;
        this.visitDate = visitDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}
