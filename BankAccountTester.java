package Inheritance.BankAccount_Package;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new SavingsAccount(90_000,10);
        accounts[1] = new SavingsAccount(15_000,5);
        accounts[2] = new SavingsAccount(7_000,1);
        accounts[3] = new SavingsAccount(80_000,15);
        accounts[4] = new SavingsAccount(20_000,8);

/***
 *  NB: Account number is associated with the
 *  position of the bank account in the array
 * 
 */
        Scanner in = new Scanner(System.in);
        boolean done = true;
        while (done)
        {
            System.out.print("D)eposit W)ithdraw M)onth end Q)uit: ");
            String input = in.next();
            if (input.toUpperCase().equals("D") || input.toUpperCase().equals("W")) // Deposit or withdrawal
            {
                System.out.print("Enter account number and amount: ");
                int num = in.nextInt();
                double amount = in.nextDouble();
                if (input.toUpperCase().equals("D")) { accounts[num].deposit(amount); }
                else { accounts[num].withdraw(amount); }
                System.out.println("Balance: " + accounts[num].getBalance());
            }
            else if (input.toUpperCase().equals("M")) // Month end processing
            {
                for (int n = 0; n < accounts.length; n++)
                {
                    accounts[n].monthEnd();
                    System.out.println("Account "+ (n+1) + ": " + accounts[n].getBalance());
                }
            }
            else if (input.toUpperCase().equals("Q"))
            {
                done = false;
            }
        }
    }
}
