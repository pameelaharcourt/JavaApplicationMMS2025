import java.util.Scanner;

public class CreditLimitCalculatorExe3_18 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number(-1 to quit): ");
		int account = input.nextInt();
		
		while(account != -1) {
			
			System.out.print("Beginning balance: ");
			int balance = input.nextInt();
			
			System.out.print("Total charges: ");
			int charges = input.nextInt();
			
			System.out.print("Total credits: ");
			int credits = input.nextInt();
			
			System.out.print("Total credit limit: ");
			int limit = input.nextInt();
			
			int newBalance = balance + charges - credits;
			
			System.out.println("New balance = " + newBalance);
			
			if(newBalance > limit)
				System.out.println("Credit limit exceeded");
			
			System.out.print("Enter account number (-1 to quit): ");
			account = input.nextInt();
			
			
			
		}
	}
}