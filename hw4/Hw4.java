package hw4;


/**
 * @author jiahaoxian
 */

public class Hw4 {


    public static void main(String[] args) {
        
        //Question #1
        SavingsAccount joe = new SavingsAccount("Joe", 100);
        joe.annualInterestRate = 1;
        System.out.println(joe.owner +" have $ " + joe.balance + " and " + joe.annualInterestRate + " % annual interest rate.");
        
        //Question #2
        CheckingAccount emily = new CheckingAccount("Emily", 200);
        emily.insufficientFundsFee = 10;
        System.out.println(emily.owner +" have $ " + emily.balance + " and $ " + emily.insufficientFundsFee + " insufficient funds fee.");
        
        //Question #3
        emily.deposit(50);
        emily.balance();
        
        //Question #4
        joe.withdraw(25);
        joe.balance();
        
        //Question #5
        emily.processCheck(50);
        emily.balance();
        
        //Question #6
        emily.withdraw(100);
        joe.deposit(100);
        emily.balance();
        joe.balance();
        
        //Question #7
        SavingsAccount sam = new SavingsAccount("Sam", 250);
        sam.annualInterestRate = 0.5;
        System.out.println(sam.owner +" have $ " + sam.balance + " and " + sam.annualInterestRate + " % annual interest rate.");
        
        //Question #8
        joe.depositMonthlyInterest();
        sam.depositMonthlyInterest();
        joe.balance();
        sam.balance();
        
        //Question #9
        emily.withdrawChecking(500);
        emily.balance();
        
        //Question #10
        joe.withdrawSavings(500);
        joe.balance();
        
        //BONUS
    }
}
