import java.util.Scanner;

public class RoundingExe5_9{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		double x = input.nextDouble();
		
		double y = Math.floor(x + 0.5);
		
		System.out.println("Original: " + x);
		System.out.println("Rounded: " + y);
	}
}