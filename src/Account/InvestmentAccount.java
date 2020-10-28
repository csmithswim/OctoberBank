package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 3;

    public InvestmentAccount((int balance, String owner, String accountNum, int dailyLimit){
        super(balance, owner, accountNum, "investment");
        this.investment = investment;
    }

    public void applyInvestment(){
        int amount = balance * (investment /100);
        balance += amount;
    }
}
