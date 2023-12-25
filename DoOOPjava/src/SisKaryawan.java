import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SisKaryawan {
	// Menggunakan Double daripada Float agar mendapatkan Hasil yang presisi.
    private static String nama;
    private static double gaji; 
    private static double total; 
    private static float jamKerja;
    private static double jamLembur; 
    private static double upah; 
    private static String golongan;

    public static void main(String args[]) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Silahkan Masukan Nama Karyawan : ");
        nama = input1.nextLine();
        golonganKaryawan();
        jamkerjaKaryawan();
        perhitunganGaji();  // Memanggil Method yang telah dibuat untuk menampilkan Hasil.
    }

    public static void golonganKaryawan() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Golongan Karyawan =  A | B | C | D |");
        System.out.print("Masukan Golongan Karyawan (Kapital) : ");
        golongan = input2.nextLine();
        switch (golongan) {
            case "A":
                upah = 20000;
                break;
            case "B":
                upah = 60000;
                break;
            case "C":
                upah = 75000;
                break;
            case "D":
                upah = 90000;
                break;
            default:
                System.out.println("Golongan Tidak Terdaftar di Database!");
                break;
        }
    }

    public static void jamkerjaKaryawan() {
        Scanner input3 = new Scanner(System.in);  
        System.out.print("Masukan Jam Kerja Karyawan : ");
        jamKerja = input3.nextFloat();  
        if (jamKerja >= 150) {
            jamLembur = (jamKerja - 150) * upah * 1.25;
            gaji = 150 * upah;
        } else {
            jamLembur = 0;
            gaji = jamKerja * upah;
        }
    }

    public static void perhitunganGaji() {
        total = gaji + jamLembur;

        // Format the currency using NumberFormat
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); // Menggunakan Lokal Indonesia
        String formattedTotal = currencyFormat.format(total);

        System.out.println("Gaji yang diterima sdr : " + nama + " adalah = " + formattedTotal);
    }
}
