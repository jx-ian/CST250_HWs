package hw4;

/**
 * @author jiahaoxian
 */

public class BankAccount {

    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    
    public void balance() {
    System.out.println(owner +" have $ " + balance + " in the bank account.");
    }
}
