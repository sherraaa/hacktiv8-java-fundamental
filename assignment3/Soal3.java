import java.util.Scanner;

public class Soal3 {
    /* Buatlah sebuah method untuk mendapatkan nilai terbesar dari sebuah array. 
     * Parameter dari methodnya adalah array of integers dan 
     * output dari methodnya adalah integer (yang merupakan angka paling besar)
     */    

    private int[] numbers;

    public Soal3(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMax() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        numbers[i] = scanner.nextInt();
    }
    Soal3 soal3 = new Soal3(numbers);
    System.out.println("The maximum value is " + soal3.getMax());
    scanner.close();
}