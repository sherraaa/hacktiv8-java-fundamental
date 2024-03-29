public class Soal3 {
    /*
     * Buatlah sebuah array yang menampung data-data berikut: 1, 2, 10, 12
     * Hitunglah rata-rata dari angka-angka dalam array tersebut. 
     * Akseslah angka-angka di dalam array tersebut menggunakan indeks dan 
     * manfaatkan function length untuk mengetahui panjang array.
     */

    int[] numbers;
    
    public Soal3() {
        this.numbers = new int[] {1, 2, 10, 12};
    }

    public static void main(String[] args) {
        Soal3 number = new Soal3();
        int sum = 0;

        for (int i = 0; i < number.numbers.length; i++) {
            sum += number.numbers[i];
        }

        System.out.println("Rata-rata dari angka-angka dalam array tersebut: " + (sum / number.numbers.length));
    }
}
