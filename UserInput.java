import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your address: ");
		String address = scan.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter your gender(Male/Female): ");
		String gender = scan.next();
		
		System.out.printf("Are you happy to learn Java?(true/False): ");
		boolean isHappy = scan.nextBoolean();
		
		System.out.println("");
		System.out.println("");
		
		System.out.printf("Hello %s, How are you today?%n", fullName);
		System.out.printf("Nice meeting you, you are living in %s%n", address);
		System.out.printf("%s, you are %d%n years old",fullName,age);
		System.out.printf("You are a %s%n ",gender);
		System.out.printf("Are you happy to learn Java? %b%n ",isHappy);
	}
}