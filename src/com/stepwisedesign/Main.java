package com.stepwisedesign;

public class Main {

    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount();
        CheckingAccount myCheckingAccount = new CheckingAccount();
        SavingsAccount mySavingsAccount = new SavingsAccount();
        COD myCOD = new COD();

        myBankAccount.account = 5.00;
        myCheckingAccount.balance = 10000000;
        mySavingsAccount.account = 100000000;

    }
}
