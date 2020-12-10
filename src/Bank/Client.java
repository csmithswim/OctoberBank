package Bank;

import Account.Account;
import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String ssn;
    private String address;
    private String firstName;
    private String lastName;
    private List<Account> accounts = new ArrayList<>();
    private List<DebitCard> debitCards = new ArrayList<>();

    public Client(String firstName, String lastName, String ssn, String address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.name=firstName + " " + lastName;
        this.ssn=ssn;
        this.address=address;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void addDebitCard(String AccountNum){
        //accountNum list of accounts find the account.
        //Find the account and save it in an Account variable
        //Display the account details to the console.
    }



}
