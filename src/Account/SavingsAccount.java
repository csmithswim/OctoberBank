package Account;

public class SavingsAccount extends BankAccount {
    //Try to store numbers as integers and then use the appropriate math later
    private int interest;

    public SavingsAccount(int balance, String owner, String accountNum, int interest){
        super(balance, owner, accountNum, "Savings");
        this.interest = interest;
    }

    //Something else will be applying this method, not necessarily the SavingsAccount
    public void applyInterest(){
        int amount = balance * (interest/100);
    }

}
