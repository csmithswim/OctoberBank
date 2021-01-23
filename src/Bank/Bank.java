package Bank;

import Account.Account;
import Account.CheckingAccount;
import BankTools.UI;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private int onHandCash;
    private String city;
    private List<Client> clients;
    private List<Account> accounts = new ArrayList<Account>();
    // list of accounts?

    //create the bank.
    public Bank(String name, String City) {
        this.name = name;
        this.city = city;
        this.onHandCash = 10000000;
        this.clients = new ArrayList<>();
    }

    //add client
    public void addClient(String firstName, String lastName, String ssn, String address){
        clients.add(createClient(firstName, lastName, ssn, address));
    }
    public void addClient(String firstName, String lastName, String ssn){
        clients.add(createClient(firstName, lastName, ssn, this.city));
    }
    private Client createClient(String firstName, String lastName, String ssn, String address){
        return new Client(firstName, lastName, ssn, address);
    }
    //display clients
    public String displayClients(){
        String output = "";
        //logic
        for (var client : clients) {
                output += client.getName() + client.displayAccounts() + "\n";
        }
        return output;
    }
    //Create Account
    private Account createAccount(int balance, String owner, String accountType){
        switch (accountType) {
            case "checking":
                return new CheckingAccount(balance, owner, Integer.toString(accounts.size() +1), UI.getNumber("What is this client's Daily limit?"));
            default:
                System.out.println("ERROR: Invalid Account Type");
                return null;
        }
    };

    //Add account to client
    //Close Account

}