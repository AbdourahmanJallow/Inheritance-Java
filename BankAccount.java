package Inheritance.BankAccount_Package;

import Interfaces.Meas;
import Interfaces.Measurable;

import java.util.Arrays;
// implements Measurable,Meas adn Comparable
public class BankAccount implements Measurable{
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void monthEnd(){
    }
    public double getBalance(){
        return balance;
    }
    public double getMeasure(Object obj){
        BankAccount bankAccount = (BankAccount)obj;
        return bankAccount.balance;
    }


      public static Meas largest(Meas obj1,Meas obj2){
          return (obj1.getMeas() > obj2.getMeas()) ? obj1 : obj2;
    }
}
