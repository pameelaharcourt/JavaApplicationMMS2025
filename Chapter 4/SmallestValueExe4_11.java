import java.util.Scanner;

public class SmallestValueExe4_11{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of values: ");
		int count = input.nextInt();
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 1; i <= count; i++) {
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		if(num < smallest)
		smallest = num;
			
		}
		System.out.println("Smallest value: " + smallest);
	}
}