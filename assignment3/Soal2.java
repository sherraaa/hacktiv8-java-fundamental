import java.util.Scanner;

public class Soal2 {
    /*
     * Buatlah method untuk menentukan apakah sebuah string palindrom atau tidak. 
     * Parameter dari method tersebut adalah string dan return dari method tersebut adalah boolean (true jika palindrom dan false jika bukan palindrom)
     */

    private String text;

    public Soal2(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a text: ");
    String text = scanner.nextLine();
    Soal2 soal2 = new Soal2(text);
    if (soal2.isPalindrome()) {
        System.out.println(text + " is a palindrome.");
    } else {
        System.out.println(text + " is not a palindrome.");
    }
    scanner.close();
}