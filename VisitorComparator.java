
import java.util.*;

public class VisitorComparator implements Comparator<Visitor> {

    // 按 ticketType 和 visitDate 进行排序
    @Override
    public int compare(Visitor v1, Visitor v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }

        // 首先按照 ticketType 排序
        int ticketComparison = v1.getTicketType().compareTo(v2.getTicketType());
        if (ticketComparison != 0) {
            return ticketComparison;
        }

        // 如果 ticketType 相同，则按照 visitDate 排序
        return v1.getVisitDate().compareTo(v2.getVisitDate());
    }
}
