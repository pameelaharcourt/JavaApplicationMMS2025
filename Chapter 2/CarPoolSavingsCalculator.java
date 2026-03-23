import java.util.Scanner;

public class CarPoolSavingsCalculator{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total miles driven per day: ");
		double miles = input.nextDouble();
		
		System.out.print("ENter cost per gallon of gasoline: ");
		double costPerGallon = input.nextDouble();
		
		System.out.print("Enter avaerage miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter parking fees per day: ");
		double parkingFees = input.nextDouble();
		
		System.out.print("Enter tolls per day: ");
		double tolls = input.nextDouble();
		
		double fuelCost = (miles / milesPerGallon) * costPerGallon;
		double totalCost = fuelCost + parkingFees + tolls;
		
		System.out.printf("Your daily cost of driving to work is: $%.2f%n", totalCost);
	}
}