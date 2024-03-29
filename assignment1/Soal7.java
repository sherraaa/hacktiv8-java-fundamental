public class Soal7 {
    /*
     * Berdasarkan  array  multidimensional  di  samping, 
     * akseslah  semua  elemen  yang  merupakan  angka genap (sebutkan indeksnya saja)
     * 
     * Array multidimensional:
     * {
     *  {1, 4, 10},
     *  {10, 8, 7, 11, 14},
     *  {3, 5, 7},
     *  {12, 90, 98, 7, 3, 5},
     *  {3, 9, 10, 5, 1}
     * }
     */

    public static void main(String[] args) {
        int[][] numbers = {
            {1, 4, 10},
            {10, 8, 7, 11, 14},
            {3, 5, 7},
            {12, 90, 98, 7, 3, 5},
            {3, 9, 10, 5, 1}
        };

        System.out.println("Indeks dari angka genap:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println("Indeks: [" + i + "][" + j + "]");
                }
            }
        }
    }
}