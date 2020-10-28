package Account;

public class BankAccount {
    protected int balance;
    private String owner;
    private String accountNum;
    private String type;

    public BankAccount(int balance, String owner, String accountNum, String type){
        this.balance = balance;
        this.owner = owner;
        this.accountNum = accountNum;
        this.type = type;
    }
    public void deposit(int amt){
        if (amt > 0) {
            balance += amt;
        }
    }
    public void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
        }
    }

    @Override //Friendly method to get a string version of the object.
    public String toString() {
        return "type: " + type + "\tAccountNum: "+ "\tOwner: " + owner + "\tbalance: " + balance;
    }
}