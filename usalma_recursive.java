import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	static void power(int x) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kuvvet girin: ");
		int pow = input.nextInt();
		int sum = 1;
		for(int i = 1; i <= pow; i++) {
			sum *= x;
		}
		System.out.println("Sonuç: " + sum);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı girin: ");
		int num = input.nextInt();
		
		power(num);
		}  
}
