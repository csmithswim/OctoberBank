package com.csmithswim;

/* 1 a generic BankAccount class with 3 fields and 2 methods
2 2 child classes that inherit from the bankAccount class. 1 unique method and 1 unique field.
Class will start at 6pm get those tweets up still.
 */

public class Main {

    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount(100000, "Phil", "1234", "Account");
        CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
        System.out.println(myAcct.toString());
        myAcct.deposit(1000);
        myChecking.deposit(2000);
        System.out.println(myAcct.toString());
        myChecking.withdraw(10000);
        myChecking.withdraw(5000);
        System.out.println(myAcct.toString());
        myAcct.withdraw(100000000);
        System.out.println(myAcct.toString());
    }
}

