package Account;

//Our contract
public interface Account {
    void withdraw(int amt);
    void deposit(int amt);
    String getAccountNum();
}
