import java.util.Scanner;

public class RekapPenjualanCafe20 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Menu: ");
        int jumlahmenuh = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jumlahmenuh];

        System.out.println("\nMasukkan Nama Menu Anda: ");
        for (int i = 0; i < jumlahmenuh; i++) {
            System.out.print("Menu ke-" + (i + 1) + " = ");
            menu[i] = sc.nextLine();
        }

        System.out.print("\nMasukkan Jumlah Hari Penjualan = ");
        int jumlahdayz = sc.nextInt();

        int[][] penjualan = new int[jumlahmenuh][jumlahdayz];

        System.out.println("=====Input Penjualan =====");
        for (int i = 0; i < jumlahmenuh; i++) {
            System.out.println("\nmenu     : " + menu[i]);
            for (int h = 0; h < jumlahdayz; h++) {
                System.out.print("Hari ke-" + (h + 1) + ": ");
                penjualan[i][h] = sc.nextInt();
            }
        }

        System.out.println("\n===== Rekap Penjualan =====");
        System.out.print("Menu\t");
        for (int h = 1; h <= jumlahdayz; h++) System.out.print("H" + h + "\t");
        System.out.println();

        for (int i = 0; i < jumlahmenuh; i++) {
            System.out.print(menu[i] + "\t");
            for (int h = 0; h < jumlahdayz; h++) {
                System.out.print(penjualan[i][h] + "\t");
            }
            System.out.println();
        }

        int maxTotal = -1;
        String menuMax = "";
        for (int i = 0; i < jumlahmenuh; i++) {
            int total = 0;
            for (int h = 0; h < jumlahdayz; h++) total += penjualan[i][h];

            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }
        System.out.println("\nMenu Penjualan Tertinggi: " + menuMax + " (" + maxTotal + ")");

        System.out.println("\n===== Rata Rata Penjualan =====");
        for (int i = 0; i < jumlahmenuh; i++) {
            int total = 0;
            for (int h = 0; h < jumlahdayz; h++) total += penjualan[i][h];
            double avg = total / (double) jumlahdayz;
            System.out.println(menu[i] + " : " + avg);
        }
    }
}