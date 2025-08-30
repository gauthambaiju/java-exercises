package Employee_5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Abu", 10000.00);
        System.out.println(employee);
        System.out.println(employee.increaseSalary(20));
        System.out.println(employee);
    }
}