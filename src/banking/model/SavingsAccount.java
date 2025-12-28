package banking.model;

/**
 * Represents a savings account.
 */
public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Overrides withdraw method to enforce minimum balance rule.
     */
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
