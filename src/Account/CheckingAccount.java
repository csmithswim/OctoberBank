package Account;

public class CheckingAccount extends BankAccount implements Account {
    private int dailyLimit;
    private int dailyWithdrawn = 0;

    public CheckingAccount(int balance, String owner, String accountNum, int dailyLimit) {
        super(balance, owner, accountNum, "Checking");
        this.dailyLimit = dailyLimit;
    }

    public void resetDailyWithdrawn() {
        dailyWithdrawn = 0;
    }

    @Override
    public void withdraw(int amt) {
        if (dailyWithdrawn + amt > dailyLimit) {
            System.out.println("Error over limit");
            return;
        }
        super.withdraw(amt);
    }

}