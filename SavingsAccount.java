package Inheritance.BankAccount_Package;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    private double minBalance;

    public SavingsAccount(double balance,double rate){
        super(balance);
        this.interestRate = rate;
        this.minBalance = balance;
    }
    public void withdraw(double amount){
        super.withdraw(amount);
        double balance = getBalance();

        if (balance < minBalance){
            minBalance = balance;
        }
    }
    public void monthEnd(){
        double interest = minBalance*interestRate/100;
        deposit(interest);
        minBalance = getBalance();
    }
//    public double getBalance(){
//        return minBalance;
//    }
}
