package Account;

//Extends Investment
// has a private field string of timePeriod that uses "M", "Q"
//Can't be withdrawn from.

public class CDInvestment extends InvestmentAccount {
    private int timeFrame;
    public CDInvestment(int balance, String owner, String accountNum){
        super(balance, owner, accountNum, 5, "Certificate of Deposit");
        this.timeFrame = timeFrame;
    }

    public void checkIfInterest(int time){
        if (time <= timeFrame && balance > 0);
            applyInvestment();
    }

    @Override
    public void withdraw(int amt){
        return;
    }
}


