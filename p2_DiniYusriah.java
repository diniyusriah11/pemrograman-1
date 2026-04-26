package tugas;

public class NilaiMahasiswa {

import java.util.Scanner;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== INPUT =====
        String nama;
        System.out.print("Input nama: ");
        nama = input.nextLine();

        // ===== PROSES =====
        String hasil;
        hasil = "Nama kamu: " + nama;

        // ===== OUTPUT =====
        System.out.println(hasil);
    }
}
    
}
