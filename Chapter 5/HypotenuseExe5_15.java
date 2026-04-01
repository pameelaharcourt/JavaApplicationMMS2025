import java.util.Scanner;

public class HypotenuseExe5_15{
	
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side1: ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter side2: ");
		double side2 = input.nextDouble();
		
		System.out.println("Hypotenuse = " + hypotenuse(side1, side2));
	}
}