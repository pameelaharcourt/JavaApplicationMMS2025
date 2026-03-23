import java.util.Scanner;

public class FairTaxCalculatorExe4_31{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Variables for expenses
		double housing, food, clothing, transportation, education, healthcare, vacations;
		
		// Input from user
		System.out.print("Enter housing expenses: ");
		housing = input.nextDouble();
		
		System.out.print("Enter food expenses: ");
		food = input.nextDouble();
		
		System.out.print("Enter clothing expenses: ");
		clothing = input.nextDouble();
		
		System.out.print("Enter transportation expenses: ");
		transportation = input.nextDouble();
		
		System.out.print("Enter education expenses: ");
		education = input.nextDouble();
		
		System.out.print("Enter healthcare expenses: ");
		healthcare = input.nextDouble();
		
		System.out.print("Enter vacation expenses: ");
		vacations = input.nextDouble();
		
		// Total expenses
		double totalExpenses = housing + food + clothing + transportation 
							 + education + healthcare + vacations;
		
		// FairTax calculations
		double tax23 = totalExpenses * 0.23; // inclusive
		double tax30 = totalExpenses * 0.30; // exclusive
		
		//Output
		System.out.println("\nTotal Expenses: " + totalExpenses);
		System.out.println("Estimated FairTax (23% inclusive): " + tax23);
		System.out.println("Estimated FairTax (30% exclusive): " + tax30);
		
		input.close();
	}
}