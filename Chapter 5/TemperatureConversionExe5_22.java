import java.util.Scanner;

public class TemperatureConversionExe5_22{
	
	// (a) Fahrenheit to Celsius
	public static double celsius(double fahrenheit){
		return 5.0 / 9.0 * (fahrenheit - 32);
	}
	
	// (b) Celsius to Fahrenheit
	public static double fahrenheit(double celsius){
		return 9.0 /5.0 * celsius + 32;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Temperature Conversion");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("chose option(1 or 2): ");
		
		int choice = input.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter temperature in Fahrenheit: ");
			double f = input.nextDouble();
			
			double c = celsius(f);
			System.out.println("Celsius = " + c);
		}
		
		else if(choice == 2) {
			System.out.print("Enter temperature in Celsius: ");
			double c = input.nextDouble();
			
			double f = fahrenheit(c);
			
			System.out.println("Fahrenheit = " + f);
		}
		
		else {
			System.out.println("Invalid choice!");
			
		}
		
		
		
		
	}
	
}