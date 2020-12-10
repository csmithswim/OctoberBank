package Account;

/* 1 a generic BankAccount class with 3 fields and 2 methods
2 2 child classes that inherit from the bankAccount class. 1 unique method and 1 unique field.
Class will start at 6pm get those tweets up still.
 */

import Account.*;
import BankTools.DebitCard;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAcct = new BankAccount(100000, "Phil", "1234", "Account");
        CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
        SavingsAccount mySavings = new SavingsAccount(100000, "Will", "3333", 5);

        DebitCard myCard = new DebitCard("12345679", "1234", "555", "Cliff", myChecking);
        myCard.addAccount(mySavings);
        myCard.addAccount(myChecking);
        myCard.displayAccounts();
        myCard.details();


    }
}

