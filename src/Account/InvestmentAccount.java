package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 3;

    public InvestmentAccount(int balance, String owner, String accountNum, int dailyLimit){
        super(balance, owner, accountNum, "investment");
        this.investment = investment;
    }

    public InvestmentAccount(int balance, String owner, String accountNum, int investment, String type){
        super(balance, owner, accountNum, type);
    }

    public void applyInvestment(){
        int amount = balance * (investment /100);
        balance += amount;
    }

    @Override
    public void withdraw(int amt) {
        super.withdraw(amt+1000);
    }
}
