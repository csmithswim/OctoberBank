package Account;

/* 1 a generic BankAccount class with 3 fields and 2 methods
2 2 child classes that inherit from the bankAccount class. 1 unique method and 1 unique field.
Class will start at 6pm get those tweets up still.
 */

import Account.*;
import Bank.Client;
import BankTools.DebitCard;


public class Main {

    public static void main(String[] args) {
//        BankAccount myAcct = new BankAccount(100000, "Phil", "1234", "Account");
        CheckingAccount myChecking = new CheckingAccount(20000, "Cliff", "9876", 10000);
        SavingsAccount mySavings = new SavingsAccount(100000, "Cliff", "3333", 5);
        InvestmentAccount myInvest = new InvestmentAccount(100000, "Will", "3289", 3);
        CDInvestment myCD = new CDInvestment(300000, "Cliff", "78457", 36);

        Client cliff = new Client("Cliff", "Choiniere", "123456789", "Chestnut St");

        cliff.addAccount(mySavings);
        cliff.addAccount(myCD);
        cliff.addAccount(myChecking);
        cliff.addAccount(myInvest);

        cliff.addDebitCard("9876");
        System.out.println(cliff.displayAccounts());

//        DebitCard myCard = new DebitCard("12345678", "1234", "555", "Cliff", myChecking);
//        myCard.addAccount(mySavings);
//        myCard.addAccount(myInvest);
//        myCard.addAccount(myCD);
//        myCard.displayAccounts();
//        myCard.details();
    }
}

