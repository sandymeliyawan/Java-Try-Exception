import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Nama    : Sandy Meliyawan");
        System.out.println("NPM     : 2169700003  ");
        System.out.println("");

        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            int tambah = angka1 + angka2;
            int kurang = angka1 - angka2;
            int kali = angka1 * angka2;
            int bagi = angka1 / angka2;

            System.out.println("Hasil Penjumlahan: " + tambah);
            System.out.println("Hasil Pengurangan: " + kurang);
            System.out.println("Hasil Perkalian: " + kali);
            System.out.println("Hasil Pembagian: " + bagi);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan pembagian dengan nol: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program selesai. Aplikasi Ditutup Ya Gays.");
        }
        System.out.println("");
    }
}
