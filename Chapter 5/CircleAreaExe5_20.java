import java.util.Scanner;

public class CircleAreaExe5_20{
	
	public static double circleArea(double r) {
		return Math.PI * r * r;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double r = input.nextDouble();
		
		System.out.println("Area = " + circleArea(r));
	}
}