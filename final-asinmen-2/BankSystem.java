public class BankSystem {
    public static void deposit(BankAccount account, double amount) {
        account.setCash(account.getCash() + amount);
        System.out.println("Deposit success!");
        System.out.println("Balance Anda sekarang: " + account.getCash());
    }

    public static void withdraw(BankAccount account, double amount) {
        if (account.getCash() >= amount) {
            account.setCash(account.getCash() - amount);
            System.out.println("Withdrawal success!");
            System.out.println("Balance Anda sekarang: " + account.getCash());
        } else {
            System.out.println("Withdrawal failed, not enough cash :(");
        }
    }

    public static void convertCreditToCash(BankAccount account, double amount) {
        int rate = 1000; // 1 credit = 1000 rupiah
        if (account.getCredit() >= amount) {
            account.setCredit(account.getCredit() - amount);
            account.setCash(account.getCash() + amount * rate);
            
            System.out.println("Credit conversion success!");
            System.out.println("Balance Anda sekarang: " + account.getCash());
            System.out.println("Credit Anda sekarang: " + account.getCredit());
        } else {
            System.out.println("Credit conversion failed, not enough credit :(");
        }
    }
}
