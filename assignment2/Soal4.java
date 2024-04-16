import java.util.Scanner;

public class Soal4 {
    /*
     * Seorang pengajar sedang memeriksa ujian mahasiswa dan akan memberikan desc nilai dari A-E dengan ketentuan sebagai berikut:
     * - Nilai 80 - 100: A
     * - Nilai 65 - 79: B
     * - Nilai 50 - 64: C
     * - Nilai 35 - 49: D
     * - Nilai 0 - 34: E
     * Tampilkan desc nilai dan nama siswa saat pengajar tersebut memasukkan nilai dan nama yang dia inginkan.
     * 
     * Contoh 1:
     * String nama = “Andhika”
     * int nilai = 100
     * 
     * output yang diharapkan
     * nama: Andhika; score: A
     */

    int score;

    public Soal4(int score) {
        this.score = score;
    }

    public String checkGrade() {
        if (this.score >= 80) return "A";
        if (this.score >= 65) return "B";
        if (this.score >= 50) return "C";
        if (this.score >= 35) return "D";
        return "E";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = scanner.nextInt();
        Soal4 score = new Soal4(nilai);
        
        System.out.println("nama: " + nama + "; score: " + score.checkGrade());
    }
}