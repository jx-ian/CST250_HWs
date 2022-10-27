package hw4;

/**
 * @author jiahaoxian
 */

public class SavingsAccount extends BankAccount {

    double annualInterestRate;

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }
    
    public void depositMonthlyInterest() {
        annualInterestRate = annualInterestRate / 12;
        balance = balance + annualInterestRate;
    }
    
    public void withdrawSavings(double amount) {
        if (amount > balance) {
            System.out.println("ERROR: Attempted To Overdraw.");
            return;
        }
        balance = balance - amount;
    }
    
}
