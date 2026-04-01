import java.util.Scanner;

public class SeparatingDigitsExe5_21{
	
	//(a) Method to get quotient
	public static int quotient(int a, int b) {
		return a/b;
	}
	
	// (b) Method to get remainder
	public static int remainder(int a, int b) {
		return a % b;
	}
	
	// (c) Method to display digits
	public static void displayDigits(int number){
		
		// Ensure number is within range
		if(number < 1 || number > 99999){
			System.out.println("Number must be between 1 and 99999");
			return;
		}
		
		int divisor = 10000;
		
		while(divisor > 0) {
			int digit = quotient(number, divisor);
		if(digit != 0 || divisor <= number) {
			System.out.print(digit + " ");
		}
		
		number = remainder(number, divisor);
		divisor = divisor / 10;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer(1-99999): ");
		int number = input.nextInt();
		
		System.out.print("Digits: ");
		displayDigits(number);
		
	}
	
}