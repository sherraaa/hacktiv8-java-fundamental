import java.util.Scanner;

public class Soal1 {
    /*
     * Buatlah program untuk mengkonversi suhu dari Celcius ke Fahrenheit. 
     * Buatlah variabel untuk menampung data suhu dan silakan masukkan valuenya 
     * ke dalam variabel tersebut dan print hasilnya ke terminal.
     */

    float temperature;

    public Soal1() {
        this.temperature = 0;
    }

    public void celciusToFahrenheit(float celcius) {
        this.temperature = (celcius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Soal1 temperature = new Soal1();

        System.out.print("Masukkan suhu dalam Celcius: ");
        float celcius = scanner.nextFloat();
        temperature.celciusToFahrenheit(celcius);
        System.out.println("Suhu dalam Fahrenheit: " + temperature.temperature);
        scanner.close();
    }
} 