public class BankAccount {
    private final String accountNumber;
    private final int PIN;
    private double cash = 0.0;
    private double credit = 0.0;

    public BankAccount(String accountNumber, int PIN, double cash, double credit) {
        this.accountNumber = accountNumber;
        this.PIN = PIN;
        this.setCash(cash);
        this.setCredit(credit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getPIN() {
        return PIN;
    }

    public double getCash() {
        return cash;
    }

    public double getCredit() {
        return credit;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public boolean verification(String accountNumber, int PIN) {
        return this.accountNumber.equals(accountNumber) && this.PIN == PIN;
    }
}
