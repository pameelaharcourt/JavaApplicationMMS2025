import java.util.Scanner;

public class UserInputValidationExe3_24{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice;
		
		System.out.print("Enter 1 or 2: ");
		choice = input.nextInt();
		
		while(choice != 1 && choice != 2){
			System.out.print("Invalid input. Enter 1 or 2: ");
			choice = input.nextInt();
		}
	}
}