package banking.model;

/**
 * Represents a checking account with overdraft support.
 */
public class CheckingAccount extends Account {

    private static final double OVERDRAFT_LIMIT = -500.0;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Overrides withdraw method to allow overdraft.
     */
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
