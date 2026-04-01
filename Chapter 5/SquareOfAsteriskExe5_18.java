import java.util.Scanner;

public class SquareOfAsteriskExe5_18{
	
	public static void square(int side) {
		for(int i = 0; i < side; i++) {
			for(int j = 0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int side = input.nextInt();
		
		square(side);
	}
}