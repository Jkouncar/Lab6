public class SavingsAccount extends BankAccount {
    private static double rate = 0.025;
    private static int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialAmount) {
        super(name, initialAmount);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double initialAmount) {
        super(oldAccount, initialAmount);
        savingsNumber++;
        accountNumber = oldAccount.getAccountNumber() + "-" + savingsNumber;
    }
}
