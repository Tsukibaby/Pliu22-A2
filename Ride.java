
import java.io.*;
import java.util.*;

public class Ride {

    private final String rideName;          // rideName 应该是不可变的
    private final int maxRiders;            // maxRiders 每个周期最大游客数
    private final Employee rideOperator;    // rideOperator 不会变化，可以设置为 final
    private final Queue<Visitor> queue;     // queue 应该是不可变的
    private final List<Visitor> rideHistory; // rideHistory 应该是不可变的
    private int numOfCycles = 0;            // 游乐设施已运行的周期数

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
        if (queue.size() < maxRiders * 2) {  // 最大队列容量，可以根据实际需求调整
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

    // 运行一个周期：游客从队列中移出并进入历史
    public void runOneCycle() {
        // 检查是否有操作员和游客
        if (rideOperator == null) {
            System.out.println("Cannot run the ride. No ride operator assigned.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("Cannot run the ride. No visitors in the queue.");
            return;
        }

        // 取出游客，最多不超过 maxRiders 个
        int count = Math.min(maxRiders, queue.size());
        for (int i = 0; i < count; i++) {
            Visitor visitor = queue.poll(); // 从队列中移除游客
            addVisitorToHistory(visitor);   // 将游客添加到历史记录
        }

        // 增加周期数
        numOfCycles++;
        System.out.println("Cycle " + numOfCycles + " completed.");
    }

    // 打印历史记录中的所有游客
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor);  // 调用 Visitor 的 toString 方法
        }
    }

    // 打印队列中的所有游客
    public void printQueue() {
        System.out.println("Queue:");
        for (Visitor visitor : queue) {
            System.out.println(visitor);
        }
    }

    // 将游客历史记录导出到文件
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // 遍历历史记录，写入每个游客信息
            for (Visitor visitor : rideHistory) {
                // 将游客的详细信息以逗号分隔写入文件
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender()
                        + "," + visitor.getTicketType() + "," + visitor.getVisitDate());
                writer.newLine(); // 每个游客信息占一行
            }
            System.out.println("Ride history successfully exported to " + filename);
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
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

    public int getNumOfCycles() {
        return numOfCycles;
    }
}
