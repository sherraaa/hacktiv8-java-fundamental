import java.util.*;

public class Soal1 {
    /*
     * Buatlah sebuah program untuk mencari median dari sebuah array satu dimensi. 
     * Print hasilnya ke dalam terminal
     */

    public static double findMedian(int numbers[], int size) {
        Arrays.sort(numbers);

        if (size % 2 != 0) return (double) numbers[size/2];

        return (double) (numbers[(size-1)/2] + numbers[size/2]) / 2.0;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 5, 7, 9};
        int len = numbers.length;
        System.out.println(findMedian(numbers, len));
    }
}
