package banking;

import banking.model.Account;
import banking.model.CheckingAccount;
import banking.model.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Account savings = new SavingsAccount(1000);
        Account checking = new CheckingAccount(500);

        savings.withdraw(200);
        checking.withdraw(600);

        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Checking balance: " + checking.getBalance());
    }
}
