
import java.util.*;

public class Ride {

    private final String rideName;          // rideName 应该是不可变的
    private final int maxRiders;            // maxRiders 应该是不可变的
    private final Employee rideOperator;    // rideOperator 不会变化，可以设置为 final
    private final Queue<Visitor> queue;     // queue 应该是不可变的
    private final List<Visitor> rideHistory; // rideHistory 应该是不可变的

    // 构造函数
    public Ride(String rideName, int maxRiders, Employee rideOperator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.rideOperator = rideOperator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 添加游客到队列
    public void addVisitorToQueue(Visitor visitor) {
        if (queue.size() < maxRiders) {
            queue.add(visitor);
            System.out.println(visitor.getName() + " added to the queue.");
        } else {
            System.out.println("Queue is full. Cannot add " + visitor.getName());
        }
    }

    // 将游客移到历史记录中
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has taken the ride and added to history.");
    }

    // 检查游客是否在历史记录中
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    // 获取历史记录中的游客数量
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    // 打印历史记录中的所有游客
    public void printRideHistory() {
        System.out.println("Ride History:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(visitor);  // 调用 Visitor 的 toString 方法
        }
    }

    // 运行一个周期：游客从队列中移出并进入历史
    public void runOneCycle() {
        if (!queue.isEmpty()) {
            Visitor visitor = queue.poll();  // 从队列中取出一个游客
            addVisitorToHistory(visitor);    // 将其加入历史记录
        } else {
            System.out.println("No visitors in the queue.");
        }
    }

    // 使用迭代器打印队列中的游客
    public void printQueue() {
        System.out.println("Queue:");
        Iterator<Visitor> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(visitor);
        }
    }

    // 排序历史记录：按名字排序（可以根据需要修改排序逻辑）
    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted.");
    }

    // getter 和 setter
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

}
