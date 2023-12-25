import java.util.Scanner;
public class PenggajianKaryawan {
	
	private static String nama;
	private static float gajiKaryawan;
	private static float pajakKaryawan;
	private static float tunjangan;
	private static float gajiK;
	public static void main(String args[]) {
		
		Scanner input1 = new Scanner(System.in);
		System.err.print("SIlahkan Input Nama Karyawan : ");
		nama = input1.nextLine();
		System.out.print("SIlahkan Input Gaji Karyawan : ");
		gajiKaryawan = input1.nextFloat();
		
		TunjanganKaryawan();
		pajakGaji();
		gajiBersih();
		
		if (gajiKaryawan >= 4500000) {
			System.out.println("Karyawan Golongan A");
		} else if (gajiKaryawan <= 4500000) {
			System.out.println("Karyawan Golongan B");
		} else {
			System.out.println("Karyawan Golongan C");
		}
	}
	
	public static void TunjanganKaryawan() {
		tunjangan = (float) (0.25 * gajiKaryawan);
		System.out.println("Nominal Tunjangan Karyawan : " + tunjangan);
		
	}
	public static void gajiBersih() {
		gajiK = gajiKaryawan + tunjangan - pajakKaryawan;
		System.out.println("Gaji Bersih yang di dapat Karyawan : " +gajiK);
	}
	
	public static void pajakGaji() {
		pajakKaryawan = (float) (0.15 * (gajiK + tunjangan));
		System.out.println("Pajak yang dikenakan Karyawan : " + pajakKaryawan);
	}
}
