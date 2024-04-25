import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BankAccount account = new BankAccount("sherra", 123456, 1000000, 1000);

        System.out.println("WELCOME TO SIMPLE BANKING APP!!");
        System.out.println("Input account number:");
        String accountNumber = scan.nextLine();
        System.out.println("Input PIN:");
        int PIN = scan.nextInt();
        if (account.getPIN() != PIN || !accountNumber.equals(account.getAccountNumber())) {
            System.out.println("Verification failed!");
            return;
        }
        
        // at this point, verifikasi pasti sukses
        System.out.println("Verification success!");
        System.out.println("Your current balance is: " + account.getCash());
        System.out.println("Your current credit is: " + account.getCredit());
        
        System.out.println("What do you want to do?");
        System.out.println("A. Withdrawal");
        System.out.println("B. Deposit");
        System.out.println("C. Convert credit to cash");
        System.out.println("Input your choice: (A/B/C)");

        char choice = scan.next().charAt(0);
        switch (choice) {
            case 'A':
                System.out.println("Input amount to withdraw:");
                double amount = scan.nextDouble();

                if (amount < 0) {
                    System.out.println("Invalid amount!");
                    return;
                }

                BankSystem.withdraw(account, amount);
                break;
            case 'B':
                System.out.println("Input amount to deposit:");
                amount = scan.nextDouble();

                if (amount < 0) {
                    System.out.println("Invalid amount!");
                    return;
                }

                BankSystem.deposit(account, amount);
                break;
            case 'C':
                System.out.println("Input amount to convert:");
                amount = scan.nextDouble();

                if (amount < 0) {
                    System.out.println("Invalid amount!");
                    return;
                }
                
                BankSystem.convertCreditToCash(account, amount);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scan.close();
    }
}
