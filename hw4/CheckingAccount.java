package hw4;

/**
 * @author jiahaoxian
 */

public class CheckingAccount extends BankAccount {

    private double insufficientFundsFee;

    public CheckingAccount(String owner, double balance, double insufficientFundsFee) {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }

    public double getInsufficientFundsFee() {
        return insufficientFundsFee;
    }

    public void setInsufficientFundsFee(double insufficientFundsFee) {
        this.insufficientFundsFee = insufficientFundsFee;
    }


    public void processCheck(double checkAmount) {
        super.deposit(checkAmount);
    }

    public void withdrawChecking(double amount) {
        if (amount > super.getBalance()) {
            System.out.println("Cancelled: attempted to withdraw $ " + amount + ". Due to insufficient funds, $ " + insufficientFundsFee + " fee is collected.");
            setBalance(super.getBalance() - insufficientFundsFee);
            return;
        }
        setBalance(super.getBalance() - amount);
    }  
}
