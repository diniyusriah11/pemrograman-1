package tugas;
import java.util.Scanner;

public class p7_DiniYusriah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("\n=== SISTEM EVALUASI AKADEMIK MAHASISWA ===");

            System.out.print("Masukkan Nama Mahasiswa           : ");
            String nama = input.nextLine();

            System.out.print("Masukkan Total Pertemuan          : ");
            int realisasi = input.nextInt();

            System.out.print("Masukkan Jumlah Hadir             : ");
            int absen = input.nextInt();

            System.out.print("Masukkan Nilai Tugas              : ");
            double tugas = input.nextDouble();

            System.out.print("Masukkan Nilai UTS                : ");
            double uts = input.nextDouble();

            System.out.print("Masukkan Nilai UAS                : ");
            double uas = input.nextDouble();

            // Bersihin buffer biar ga bug pas input string lagi
            input.nextLine();

            // Hitung kehadiran
            double persentaseAbsen = ((double) absen / realisasi) * 100;

            // Bobot nilai
            double totalNilai = (persentaseAbsen * 0.10) +
                                (tugas * 0.20) +
                                (uts * 0.30) +
                                (uas * 0.40);

            String grade;

            // Validasi kehadiran
            if (persentaseAbsen < 75) {
                System.out.println("\n[!] Kehadiran kurang dari 75% (kena penalti)");

                if (totalNilai >= 55) {
                    totalNilai = 55;
                    grade = "D";
                } else {
                    grade = "E";
                }
            } else {
                if (totalNilai >= 80) grade = "A";
                else if (totalNilai >= 70) grade = "B";
                else if (totalNilai >= 60) grade = "C";
                else if (totalNilai >= 55) grade = "D";
                else grade = "E";
            }

            // Output
            System.out.println("\n=== HASIL AKHIR ===");
            System.out.println("Nama Mahasiswa      : " + nama);
            System.out.printf("Kehadiran           : %.2f%%\n", persentaseAbsen);
            System.out.printf("Nilai Akhir         : %.2f\n", totalNilai);
            System.out.println("Grade               : " + grade);
            System.out.println("===============================");

            // Ulang program
            System.out.print("\nInput data lagi? (y/n): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nProgram selesai. Terima kasih!");
        input.close();
    }
}