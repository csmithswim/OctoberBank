package BankTools;

import Account.Account;

import java.util.ArrayList;
import java.util.List;

public class DebitCard {
    private CheckingAccount primary;
    private String securityCode;
    private String cardNum;
    //private Calendar expDate;
    private String pin;
    private String cardOwner;
    private List<Account> atmAccounts = new ArrayList<>();
//    private List<CheckingAccount> atmCheckingAccounts;
//    private List<SavingAccount> atmSavingAccounts;
//    private List<InvestmentAccount> atmInfestmentAccounts = new ArrayList<>();

    public DebitCard(String cardNum, String pin, String securityCode, String cardOwner, CheckingAccount primary){
        this.cardNum = cardNum;
        this.pin = pin;
        this.securityCode=securityCode;
        this.cardOwner=cardOwner;
        this.primary=primary;
//        this.atmSavingAccounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        atmAccounts.add(account);
    }

//    public void addCheckingAccount(CheckingAccount account){
//        atmCheckingAccounts.add(account);
//    }
//
//    public void addSavingsAccount(savingAccount account){
//        atmSavingAccounts.add(account);
//    }

    public boolean charge(int amt, String pin){
        if (this.pin.equals(pin) && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

    public void displayAccounts() {
        //Ok to use var in for each loops
        for (var account : atmAccounts) {
            System.out.println(account.toString());
        }
    }
    //try to resolve this
        public void details(){
            System.out.println("Owner: " + cardOwner + "\tAccount Balance: " + primary.getBalance());
        }
    }
}


