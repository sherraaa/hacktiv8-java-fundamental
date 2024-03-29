import java.util.Scanner;

public class Soal5 {
    /*
     * 1. Buatlah sebuah variabel dengan nama minutes dengan tipe data number.
     * 2. Buatlah program untuk mengkonversi menit ke detik dan print-lah hasilnya ke dalam terminal.
     */

    float time;
    
    public Soal5() {
        this.time = 0;
    }

    public void minutesToSeconds(float minutes) {
        this.time = minutes * 60;
    }

    public static void main(String[] args) {
        Soal5 time = new Soal5();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan waktu dalam menit: ");
        float minutes = scanner.nextFloat();
        time.minutesToSeconds(minutes);
        System.out.println("Waktu dalam detik: " + time.time);

        scanner.close();
    }
}
