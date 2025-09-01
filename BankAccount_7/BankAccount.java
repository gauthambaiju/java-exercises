package BankAccount_7;

public class BankAccount {
    private double balance;

    BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Nuhh Uhh !!");
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("You BROKE !!");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount [balance=" + balance + "]";
    }
}
