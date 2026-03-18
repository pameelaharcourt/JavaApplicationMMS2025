import java.util.Scanner;

public class GasMileage_Exercise3_17{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int miles;
		int gallons;
		
		int totalMiles = 0;
		int totalGallons = 0;
		
		System.out.print("Enter miles driven (-1 to quit): ");
		miles = input.nextInt();
		
		while (miles != -1) {
			
			System.out.print("Enter gallons used: ");
			gallons = input. nextInt();
			
			double mpg = (double) miles / gallons;
			
		System.out.println("Miles per gallon = " +mpg);
		
		totalMiles += miles;
		totalGallons += gallons;
		
		double totalMPG = (double) totalMiles / totalGallons;
		
		System.out.println("Combined MPG = " + totalMPG);
		
		System.out.print("Enter miles driven (-1 to quit): ");
		miles = input.nextInt();
		}
	}
}