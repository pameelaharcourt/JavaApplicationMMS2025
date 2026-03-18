// Decryption part
import java.util.Scanner;

public class DecryptNumberExe3_38{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter encrypted four-digit number: ");
		int number = input.nextInt();
		
		int d1 = number / 1000;
		int d2 = (number / 100) % 10;
		int d3 = (number / 10) % 10;
		int d4 = number % 10;
		
			int temp1 = d3;
			int temp2 = d4;
			int temp3 = d1;
			int temp4 = d2;
			
			temp1 = (temp1 + 3) % 10;
			temp2 = (temp2 + 3) % 10;
			temp3 = (temp3 + 3) % 10;
			temp4 = (temp4 + 3) % 10;
			// the reason why 3 is used is because 7+3=10
			
			int decrypted = temp1 * 1000 + temp2 * 100 + temp3 * 10 + temp4;
			
			System.out.println("Original number: " + decrypted);
		}	
	
	}