package tugas;
import java.util.Scanner;

public class p5_DiniYusriah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Pemesanan Tiket ===");

        // INPUT
        System.out.print("Apakah Anda member? (true/false): ");
        boolean member = input.nextBoolean();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = input.nextInt();

        System.out.print("Pilih kelas (1 = Reguler, 2 = VIP): ");
        int kelas = input.nextInt();

        double hargaPerTiket = 0;
        double total;

        System.out.println("\nMemproses...\n");

        if (kelas == 1) {
            hargaPerTiket = 50000;
            System.out.println("Kelas Reguler dipilih.");
        }

        if (kelas == 2) {
            hargaPerTiket = 100000;
            System.out.println("Kelas VIP dipilih.");
        } else if (kelas != 1) {
            System.out.println("Kelas tidak valid!");
        }

        total = hargaPerTiket * jumlahTiket;

        double diskon = 0;

        if (member && total >= 200000) {
            diskon = total * 0.2;
            System.out.println("Diskon member 20%");
        } else if (member) {
            diskon = total * 0.1;
            System.out.println("Diskon member 10%");
        } else {
            System.out.println("Tidak ada diskon");
        }

        double bayar = total - diskon;

        System.out.println("\nTotal harga: Rp" + total);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total bayar: Rp" + bayar);

        input.close();
    }
}