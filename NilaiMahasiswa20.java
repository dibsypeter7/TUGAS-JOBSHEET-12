import java.util.Scanner;

public class NilaiMahasiswa20 {

    // A. FUNGSI ISIAN ARRAY
    static void isianArray(double[] arrayNilai, Scanner input) {
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa absen ke-" + (i + 1) + " : ");
            arrayNilai[i] = input.nextDouble();
        }
    }

    // B. FUNGSI TAMPIL ARRAY
    static void tampilArray(double[] arrayNilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("- Nilai absen ke-" + (i + 1) + " : " + arrayNilai[i]);
        }
    }

    // C. FUNGSI HITHOT
    static double hitTot(double[] arrayNilai) {
        double total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        return total;
    }

    // D. FUNGSI MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        double[] arrayNilai = new double[N];

        isianArray(arrayNilai, input);
        tampilArray(arrayNilai);

        double totalNilai = hitTot(arrayNilai);
        System.out.println("\nTotal seluruh nilai mahasiswa: " + totalNilai);
    }
}
