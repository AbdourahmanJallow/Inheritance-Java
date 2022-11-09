package Inheritance.BankAccount_Package;

public class BasicAccount extends BankAccount{
    private double minBalance;

    public BasicAccount(double balance){
        super(balance);

    }
    @java.lang.Override
    //can't withdraw more than available Balance
//    public void withdraw(double amount)
//            throws IllegalArgumentException {
//        double balance = getBalance();
//        try {
//            if (amount > balance) {
//                throw new IllegalArgumentException();
//            } else super.withdraw(amount);
//        } catch (IllegalArgumentException err) {
//            System.out.println("Insufficient balance");
//        }
//    }
    // charges a $30 penalty for every overdraft withdrawal
    public void withdraw(double amount){
        super.withdraw(amount);
        minBalance = getBalance();
        if (amount > minBalance){
            double charges = 30;
            super.withdraw(charges);
        }
    }

    @java.lang.Override
    public void monthEnd(){
        minBalance = getBalance();
    }
}
