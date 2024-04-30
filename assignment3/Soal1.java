import java.util.Scanner;

public class Soal1 {
    /*
     * Buatlah method yang membedakan angka genap dan ganjil. 
     * Parameter dari method tersebut adalah sebuah angka (integer) 
     * Output dari method tersebut adalah string (“ganjil” dan “genap”)
     */
    private int number;

    public Soal1(int number) {
        this.number = number;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    Soal1 soal1 = new Soal1(number);
    if (soal1.isOdd()) {
        System.out.println(number + " is an odd number.");
    } else {
        System.out.println(number + " is an even number.");
    }
    scanner.close();
}