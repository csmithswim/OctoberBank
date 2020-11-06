package Account;

public class DebitCard {
    private CheckingAccount primary;
    private String securityCode;
    private String cardNum;
    //private Calendar expDate;
    private String pin;
    private String cardOwner;
    private List<CheckingAccount> atmCheckingAccounts;
    private List<SavingAccount> atmSavingAccounts;
    private List<InvestmentAccount> atmInfestmentAccounts = new ArrayList<>();

    public DebitCard(String cardNum, String pin, String securityCode, String cardOwner, CheckingAccount primary){
        this.cardNum = cardNum;
        this.pin = pin;
        this.securityCode=securityCode;
        this.cardOwner=cardOwner;
        this.primary=primary;
        this.atmSavingAccounts = new ArrayList<>();
    }

    public void addCheckingAccount(CheckingAccount account){
        atmCheckingAccounts.add(account);
    }

    public void addSavingsAccount(savingAccount account){
        atmSavingAccounts.add(account);
    }

    public boolean charge(int amt, String pin){
        if (this.pin.equals(pin) && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }
}


