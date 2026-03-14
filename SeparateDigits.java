import java.util.Scanner;

public class SeparateDigits{
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number: ");
		int number = input.nextInt();
		
		System.out.printf("%d   %d   %d   %d   %d%n",
				number / 10000,
				(number % 10000) / 1000,
				(number % 1000) / 100,
				(number % 100) / 10,
				number % 10);
		

		
	}
	
}
	
	