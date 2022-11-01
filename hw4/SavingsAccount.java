package hw4;

/**
 * @author jiahaoxian
 */

public class SavingsAccount extends BankAccount {

    private double annualInterestRate;

    public SavingsAccount(String owner, double balance, double annualInterestRate) {
        super(owner, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    
    public void depositMonthlyInterest() {
        annualInterestRate = annualInterestRate / 12;
        super.deposit(annualInterestRate);
    }
    
    public void withdrawSavings(double amount) {
        if (amount > super.getBalance()) {
            System.out.println("ERROR: Attempted To Overdraw.");
            return;
        }
        setBalance(super.getBalance() - amount);
    }
    
}
