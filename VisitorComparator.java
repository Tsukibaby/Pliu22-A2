
import java.util.*;

public class VisitorComparator implements Comparator<Visitor> {

    // Sort by ticketType and visitDate
    @Override
    public int compare(Visitor v1, Visitor v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }

        // Sort by ticketType first
        int ticketComparison = v1.getTicketType().compareTo(v2.getTicketType());
        if (ticketComparison != 0) {
            return ticketComparison;
        }

        // If ticketType is the same, sort by visitDate
        return v1.getVisitDate().compareTo(v2.getVisitDate());
    }
}
