public class Soal4 {
    /*
     * Dalam suatu kelas yang terdiri dari 10 siswa, 
     * mereka dibagi menjadi 5 kelompok dengan pembagian sebagai berikut
     * a. Rudi, Budi, Lila
     * b.Erika, Nina
     * c.Lisa, Anna
     * d.Didit, Resti, Hana
     * Jadikan pembagian kelompok tersebut menjadi array multidimensional
     */

    String[][] groups;

    public Soal4() {
        this.groups = new String[][] {
            {"Rudi", "Budi", "Lila"},
            {"Erika", "Nina"},
            {"Lisa", "Anna"},
            {"Didit", "Resti", "Hana"}
        };
    }

    public static void main(String[] args) {
        Soal4 group = new Soal4();

        for (int i = 0; i < group.groups.length; i++) {
            System.out.print("Kelompok " + (char)(i + 97) + ": ");
            for (int j = 0; j < group.groups[i].length; j++) {
                if (j == group.groups[i].length - 1)
                    System.out.print(group.groups[i][j] + "\n");
                else
                    System.out.print(group.groups[i][j] + ", ");
            }
        }
    }
}
