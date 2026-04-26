import java.util.Scanner;

public class LATIHAN3DINI 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int nilai;
        char ulang;

        do 
        {
            System.out.print("Masukkan nilai Mahasiswa80: ");
            nilai = input.nextInt();

            total += nilai;

            System.out.print("Tambah lagi? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total nilai: " + total);
    }
}
