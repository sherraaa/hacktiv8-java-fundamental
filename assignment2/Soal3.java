public class Soal3 {
    /*
     * Buatlah sebuah program untuk menentukan apakah suatu array adalah deret geometri atau bukan. 
     * Print hasilnya ke dalam terminal.
     */

     public static boolean isGeometricSeries(int[] numbers) {
        if (numbers.length <= 1) return true;

        double ratio = (double) numbers[1] / array[0];

        for (int i = 1; i < numbers.length; i++) {
            if ((double) numbers[i] / numbers[i-1] != ratio)
                return false;
        }

        return true;
     }

     public static void main(String[] args) {
        int[] numbers = {1, 3, 9, 27, 81};
        if (isGeometricSeries(numbers)) {
            System.out.println("Array merupakan deret geometri.");
        } else {
            System.out.println("Array bukan merupakan deret geometri.");
        }
     }
}