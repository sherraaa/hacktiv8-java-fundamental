import java.util.Scanner;

public class Soal6 {
    /*
     * 1. Buatlah variabel dengan ketentuan sebagai berikut:
     * a.Distance (in meter): memiliki tipe data number. 
     * Misalkan data yang dimasukkan adalah 5, maka data jaraknya berarti 5 meter.
     * b.Duration (in minutes): memiliki tipe data number. 
     * Misalkan data yang dimasukkan adalah 10, maka data durasinya adalah 10 menit
     * 
     * 2.Print lah ke dalam terminal“Kecepatan kendaraan adalah [kecepatan] km/jam”
     * Perhatikan satuannya dan buatlah program untuk mengkonversi distance ke km dan duration ke jam dan hitung kecepatannya. 
     */

    float distance; // dalam meter
    float duration; // dalam menit
    float speed; // dalam km/jam

    public Soal6() {
        this.distance = 0;
        this.duration = 0;
        this.speed = 0;
    }

    public void calculateSpeed(float distance, float duration) {
        this.distance = distance / 1000;
        this.duration = duration / 60;
        this.speed = this.distance / this.duration;
    }

    public static void main(String[] args) {
        Soal6 vehicle = new Soal6();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh kendaraan (meter): ");
        float distance = scanner.nextFloat();
        System.out.print("Masukkan durasi perjalanan kendaraan (menit): ");
        float duration = scanner.nextFloat();
        vehicle.calculateSpeed(distance, duration);
        System.out.println("Kecepatan kendaraan adalah " + vehicle.speed + " km/jam");

        scanner.close();
    }
}
