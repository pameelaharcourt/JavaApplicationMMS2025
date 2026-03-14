import java.util.Scanner;

public class WorldPopulationGrowthCalculator{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter current world population: ");
		double population = input.nextDouble();
		
		System.out.print("Enter annual population growth rate (in%): ");
		double growthRate = input.nextDouble();
		
		growthRate = growthRate /100; 
		
		// convert percent to decimal
		
		System.out.printf("Population after 1 year: %.0f%n", population * (1 + growthRate));
		System.out.printf("Population after 2 year: %.0f%n", population * Math.pow(1 + growthRate, 2));
		System.out.printf("Population after 3 year: %.0f%n", population * Math.pow(1 + growthRate, 3));
		System.out.printf("Population after 4 year: %.0f%n", population * Math.pow(1 + growthRate, 4));
		System.out.printf("Population after 5 year: %.0f%n", population * Math.pow(1 + growthRate, 5));
		
		
		
		
		
	}
}