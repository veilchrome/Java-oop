import java.util.Scanner;

public class Pyramid {
	
	public static int inputUser;

	public static void main(String args[]) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Selamat Datang di Program Membuat Bentuk Unik :");
		System.out.println("Silahkan Pilih Menu Di bawah");
		System.out.println("[1] Untuk Membuat Piramida.");
		System.out.println("[2] Untuk Membuat Bintang");
		System.out.print("Tentukan Pilihan : ");
		inputUser = input1.nextInt();
		
		if (inputUser == 1) {
			Pyramid();
		} else if (inputUser == 2) {
			Star();
		} else {
			System.out.println("Input Salah");
		}
	}
	
	public static void Pyramid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Silahkan Masukkan Baris Untuk Piramida");
		int rows = scanner.nextInt();
		
		// looping
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public static void Star() {
		Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows1 = scanner1.nextInt();

        // Loop to iterate through rows
        for (int i = 1; i <= rows1; i++) {
            // Loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
