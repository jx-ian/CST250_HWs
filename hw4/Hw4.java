package hw4;

/**
 * @author jiahaoxian
 */

public class Hw4 {


    public static void main(String[] args) {
        
        //Question #1
        SavingsAccount joe = new SavingsAccount("Joe", 100, 1);
        joe.balance();
        
        //Question #2
        CheckingAccount emily = new CheckingAccount("Emily", 200, 10);
        emily.balance();
        
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
        SavingsAccount sam = new SavingsAccount("Sam", 250, 0.5);
        sam.balance(); 
        
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
