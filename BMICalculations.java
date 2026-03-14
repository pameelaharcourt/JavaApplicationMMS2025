import java.util.Scanner;


public class BmiCalculations{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		int weight = input.nextInt();
		
		System.out.print("Enter height in inches: ");
		int height = input.nextInt();
		
		int bmi = (weight * 703) / (height * height);
		
		System.out.printf("your BMI is %d%n", bmi);
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal weight: 18.5 - 24.9");
		System.out.println("Overweight: 25 - 29.9");
		System.out.println("obesity: 30 or greater");
		
		
	}
}