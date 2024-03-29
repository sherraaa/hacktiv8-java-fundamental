import java.util.Scanner;
import java.util.Arrays;

public class Soal2 {
    /*
     * Buatlah sebuah array untuk menampung list berikut dengan urutan yang sama:
     * a.Harry Potter
     * b.Lord of the Rings
     * c.The Hobbit
     * d.Pirates of the Caribbean
     * Bagaimana Anda bisa mengakses data Pirates of the Caribbean?
     */

    String[] movies;

    public Soal2() {
        this.movies = new String[] {
            "1. Harry Potter",
            "2. Lord of the Rings",
            "3. The Hobbit",
            "4. Pirates of the Caribbean"
        };
    }

    public static void main(String[] args) {
        Soal2 movie = new Soal2();

        System.out.println("Berikut adalah list film yang dimiliki:");
        for (int i = 0; i < movie.movies.length; i++) {
            System.out.println(movie.movies[i]);
        }

        // Alternatif menggunakan package Arrays untuk print Array
        // System.out.println(Arrays.toString(movie.movies));
        // tapi hasil print akan menjadi satu baris
        // [1. Harry Potter, 2. Lord of the Rings, ...]
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nomor film yang ingin diakses: ");
        int index = scan.nextInt();
        System.out.println("Film yang dipilih: " + movie.movies[index-1]);

        scan.close();
    }
}
