public class Soal2 {
    /* Buatlah sebuah program untuk mencari jumlah semua 
     * angka yang ada di dalam array 2 dimensi. 
     * Print hasilnya kedalam terminal.
     */

     public static void main(String[] args) {
        int[][] numbers = {
            {1, 3, 4},
            {2},
            {3, 7, 10}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Sum: " + sum);
     }
}
