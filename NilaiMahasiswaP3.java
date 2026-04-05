package tugas;

import java.util.Scanner;

public class NilaiMahasiswaP3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== INPUT =====
        double kehadiran, realisasi;
        double tugas, uts, uas;

        System.out.print("Input kehadiran: ");
        kehadiran = input.nextDouble();

        System.out.print("Input realisasi: ");
        realisasi = input.nextDouble();

        System.out.print("Input nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Input nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Input nilai UAS: ");
        uas = input.nextDouble();

        // ===== PROSES =====
        double presensi = (kehadiran / realisasi) * 10;
        double nilaiTugas = tugas * 20 / 100;
        double nilaiUTS = uts * 30 / 100;
        double nilaiUAS = uas * 40 / 100; // ini diperbaiki ya

        double hasil = presensi + nilaiTugas + nilaiUTS + nilaiUAS;

        // ===== OUTPUT =====
        System.out.println("Nilai Presensi: " + presensi);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Total Nilai: " + hasil);
    }
}