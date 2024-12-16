
import java.util.*;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
        // 根据 ticketType 排序
        return v1.getTicketType().compareTo(v2.getTicketType());
    }
}
