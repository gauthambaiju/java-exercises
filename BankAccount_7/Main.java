package BankAccount_7;

public class Main {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        System.out.println(ac);
        ac.deposit(1000);
        System.out.println(ac);
        ac.withdraw(1500);
        System.out.println(ac);
    }
}
