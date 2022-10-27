package hw4;

/**
 * @author jiahaoxian
 */

public class CheckingAccount extends BankAccount {

    double insufficientFundsFee;

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    public void processCheck(double checkAmount) {
        balance = balance + checkAmount;
    }

    public void withdrawChecking(double amount) {
        if (amount > balance) {
            System.out.println("Cancelled: attempted to withdraw $ " + amount + ". Due to insufficient funds, $ " + insufficientFundsFee + " fee is collected.");
            balance = balance - insufficientFundsFee;
            return;
        }
        balance = balance - amount;
    }  
}
