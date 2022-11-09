package Inheritance.BankAccount_Package;

public class CheckingAccounts extends BankAccount {
    private int numOfWithdrawals;

    public CheckingAccounts(double balance){
        super(balance);
    }

    @java.lang.Override
    public void withdraw(double amount) {
        //charges a $1 for every withdrawal if free withdrawals are exhausted
        super.withdraw(amount);
        numOfWithdrawals++;
        final int FREE_WITHDRAWALS = 3;
        int charges = 1;
//       while (numOfWithdrawals > FREE_WITHDRAWALS){
//           super.withdraw(charges);
//           break;
//       }
        if (numOfWithdrawals > FREE_WITHDRAWALS){
            super.withdraw(charges);
        }
    }
    @java.lang.Override
    public void monthEnd(){
        numOfWithdrawals = 0;
    }
}
