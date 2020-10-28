package com.csmithswim;

/* 1 a generic BankAccount class with 3 fields and 2 methods
2 2 child classes that inherit from the bankAccount class. 1 unique method and 1 unique field.
Class will start at 6pm get those tweets up still.
 */

import Account.BankAccount;
import Account.CheckingAccount;
import Account.SavingsAccount;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAcct = new BankAccount(100000, "Phil", "1234", "Account");
//        CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
        SavingsAccount mySavings = new SavingsAccount(100000, "Will", "3333", 5);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking);
        System.out.println(mySavings);
//        myAcct.deposit(1000);
//        myChecking.deposit(2000);
        mySavings.deposit(10000);
//        System.out.println(myAcct.toString());
//        myChecking.withdraw(10000);
//        myChecking.withdraw(5000);
        mySavings.withdraw(10000);
        System.out.println(mySavings);
//        System.out.println(myAcct.toString());
//        myAcct.withdraw(100000000);
//        System.out.println(myAcct.toString());

        
    }
}

