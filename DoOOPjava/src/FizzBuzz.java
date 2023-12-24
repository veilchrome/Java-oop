import java.util.Scanner;
public class FizzBuzz {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Silahkan Masukan Angka :");
		
		int n = scan.nextInt();
		System.out.println("The Fizz, Buzz, and FizzBuzz numbers are:");
		
		for (int i = 1; i<=n; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FIzzBuzz");
			} else if (i%3==0) {
				System.out.println("Fizz");
				
			} else if (i%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.print(i);
			}
			
			System.out.print(","+" ");
		}
		
	scan.close();	
	}
}
