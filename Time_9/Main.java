package Time_9;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(3, 62, 45);
        System.out.println(time1);
        Time time2 = new Time(5, 76, 22);
        System.out.println(time2);
        System.out.println(time1.addTime(time2));
    }
}
