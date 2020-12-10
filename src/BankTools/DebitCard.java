package BankTools;

import Account.Account;
import Account.CheckingAccount;
import Account.InvestmentAccount;
import Account.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class DebitCard {
    private CheckingAccount primary;
    private String securityCode;
    private String cardNum;
    private String pin;
    // private Calendar expDate;
    private String cardOwner;
    private List<Account> atmAccounts = new ArrayList<>();
//    private List<CheckingAccount> atmCheckingAccounts = new ArrayList<>();
//    private List<SavingAccount> atmSavingAccounts;
//    private List<InvestmentAccount> atmInvestmentAccounts = new ArrayList<>();

    public DebitCard(String cardNum, String pin, String securityCode, String cardOwner, CheckingAccount primary) {
        //array: atmCheckingAccounts[3]
        //array: atmCheckingAccounts.push() <- Does not exist!!!
        //list:  atmCheckingAccounts.get(3);
        //list:  atmCheckingAccounts.add() == .push()
        this.cardNum = cardNum;
        this.pin = pin;
        this.securityCode = securityCode;
        this.cardOwner = cardOwner;
        this.primary = primary;
    }

    public void addAccount(Account account) {
        atmAccounts.add(account);
    }

//    public void addCheckingAccount(CheckingAccount account) {
//        atmCheckingAccounts.add(account);
//    }
//
//    public void addSavingsAccount(SavingAccount account) {
//        atmSavingAccounts.add(account);
//    }

    public boolean charge(int amt, String pin) {
        if (this.pin.equals(pin) && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

    public void displayAccounts() {
        for (var account : atmAccounts) {
            System.out.println(account.toString());
        }
    }

    public void details() {
        System.out.println("Owner: " + cardOwner + "\tAccount Balance: " + primary.getBalance());
    }

}

