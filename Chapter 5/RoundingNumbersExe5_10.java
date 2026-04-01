import java.util.Scanner;

public class RoundingNumbersExe5_10{
	
	public static double roundToInteger(double x) {
		return Math.floor(x +0.5);
	}
	
	public static double roundToTenths(double x) {
		return Math.floor (x * 10 + 0.5) / 10;
	}
	public static double roundToHundredths(double x) {
		return Math.floor(x * 100 + 0.5) / 100;
	
	}
	public static double roundToThousandths(double x) {
		return Math.floor(x *1000 + 0.5) / 1000;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		double num = input.nextDouble();
		
		System.out.println("Integer: " + roundToInteger(num));
		System.out.println("Tenths: " + roundToTenths(num));
		System.out.println("Hundredths: " + roundToHundredths(num));
		System.out.println("Thousandths: " + roundToThousandths(num));
	}
	
}