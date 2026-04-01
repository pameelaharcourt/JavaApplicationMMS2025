import java.util.Scanner;

public class MultipleCheckExe5_16{
	
	public static boolean isMultiple(int a, int b) {
		return b % a == 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		
		System.out.print("Enter Second number: ");
		int b = input.nextInt();
		
		if(isMultiple(a, b))
			System.out.println("Multiple");
		else
			System.out.println("Not a multiple");
	}
}