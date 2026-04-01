import java.util.Scanner;

public class EvenOddExe5_17{
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		if(isEven(num))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}