
public class Visitor extends Person {

    private String ticketType;
    private String visitDate;

    // 默认构造函数
    public Visitor() {
        super(); // 调用父类构造函数
        this.ticketType = "General"; // 默认票种为普通票
        this.visitDate = "Unknown";  // 默认访问日期为未知
    }

    // 带参数的构造函数
    public Visitor(String name, int age, String gender, String ticketType, String visitDate) {
        super(name, age, gender); // 调用父类构造函数
        this.ticketType = ticketType; // 设置票种
        this.visitDate = visitDate;  // 设置访问日期
    }

    // 获取票种
    public String getTicketType() {
        return ticketType;
    }

    // 设置票种
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // 获取访问日期
    public String getVisitDate() {
        return visitDate;
    }

    // 设置访问日期
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    // 重写toString方法，方便打印游客信息
    @Override
    public String toString() {
        return "Visitor: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender()
                + ", Ticket Type: " + ticketType + ", Visit Date: " + visitDate;
    }
}
