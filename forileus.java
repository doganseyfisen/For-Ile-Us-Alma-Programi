import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int n, p;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssü alınacak sayıyı girin: ");
		n = input.nextInt();
		
		System.out.print("Üs değerini girin: ");
		p = input.nextInt();
		
		int total = 1;
		int i = 1;
		
		for(; i <= p; i++) {
			total *= n;
		}
		
		System.out.println("Sonuç: " + total);
		
	}	
}		
