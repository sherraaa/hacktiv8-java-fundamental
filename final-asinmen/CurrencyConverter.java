import java.util.Scanner;

public class CurrencyConverter {
    private float rate;
    private float amount;
    private float convertedAmount;
    private String currency;

    public CurrencyConverter(char option, float amount) {
        this.amount = amount;
        this.setRate(option);
        this.convertedAmount = this.amount * this.rate;
        this.setCurrency(option);
    }

    public float getRate() {
        return rate;
    }

    public float getAmount() {
        return amount;
    }

    public float getConvertedAmount() {
        return convertedAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setRate(char option) {
        if (option == 'A') { // USD
            this.rate = 0.000062f; // 1 IDR = 0.000062 USD
        } else if (option == 'B') { // SGD
            this.rate = 0.000084f; // 1 IDR = 0.000084 SGD
        } else { // JPY
            this.rate = 0.0096f; // 1 IDR = 0.0096 JPY
        }
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setConvertedAmount(float convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public void setCurrency(char option) {
        if (option == 'A') { // USD
            this.currency = "USD";
        } else if (option == 'B') { // SGD
            this.currency = "SGD"; 
        } else { // JPY
            this.currency = "JPY"; 
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO CURRENCY CONVERSION APP!!");
        System.out.println("Input amount (in IDR)");
        float amount = scan.nextFloat();
        System.out.println("Choose currency to convert to:");
        System.out.println("A. USD");
        System.out.println("B. SGD");
        System.out.println("C. JPY");
        System.out.println("Input the conversion currency (Choose A/B/C):");
        char option = scan.next().charAt(0);

        CurrencyConverter converter = new CurrencyConverter(option, amount);
        System.out.println("Conversion result to " +  converter.getCurrency() + " is " + converter.getConvertedAmount());
        
        scan.close();
    }
}
