import java.util.Scanner;

public class Soal5 {
    /*
     * Tentukan angka terbesar dari sebuah array dan print hasilnya ke dalam terminal.
     */

     public static int findMaxElement(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        return max;
     }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang array: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println("Masukkan elemen array");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = findMaxElement(numbers);
        System.out.println("Angka terbesar dalam array tsb adalah: " + max);

        scanner.close();
     }
}