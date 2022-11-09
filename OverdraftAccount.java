package Inheritance.BankAccount_Package;

public class OverdraftAccount extends BankAccount{
    private double cumulativeBalance;

    public OverdraftAccount(double balance){
        super(balance);
    }

    public void withdraw(double amount){
        double overdraftCharge = 30;
        double balance = super.getBalance();
        if (amount > balance){
            super.withdraw(amount);

            cumulativeBalance = balance - (amount+overdraftCharge);
        }else {
            super.withdraw(amount);
            cumulativeBalance = balance - amount;
        }
    }

    public double getBalance(){
        return cumulativeBalance;
    }
    public void monthEnd(){
        cumulativeBalance = super.getBalance();
    }
}
