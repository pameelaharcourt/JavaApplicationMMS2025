import java.util.Scanner;
import java.security.SecureRandom;

public class CAI_FatigueExe5_36{
	
	static SecureRandom random = new SecureRandom();
	
	// Method to display correct response
	public static void correctResponse(){
		
		int response = 1 + random.nextInt(4);
		
		switch(response){
			case 1:
				System.out.println("Very good!");
			break;
			
			case 2:
				System.out.println("Excellent!");
			break;
			
			case 3:
				System.out.println("Nice work!");
			break;
			
			case 4:
				System.out.println("Very good!");
			break;
			
		}
	}
	
	// Method to display incorrect response
	public static void incorrectResponse(){
		
		int response = 1 + random.nextInt(4);
		
		switch(response){
			case 1:
				System.out.println("No. Please try again.");
			break;
			
			case 2:
				System.out.println("Wrong. Try once more.");
			break;
			
			case 3:
				System.out.println("Don't give up!");
			break;
			
			case 4:
				System.out.println("Keep trying.");
			break;
			
		}
	}
	
	// Method to ask multiplication question
	public static void askQuestion(Scanner input){
		
		int num1 = 1 + random.nextInt(9);
		int num2 = 1 + random.nextInt(9);
		
		int correctAnswer = num1 * num2;
		
		int studentAnswer;
		
		do{
			
			System.out.print("How much is " + num1 + " times " + num2 + "? ");
			studentAnswer = input.nextInt();
			
			if(studentAnswer == correctAnswer){
				correctResponse();
				
			}else{
				incorrectResponse();
			}
			
		}while(studentAnswer != correctAnswer);
		
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Multiplication Practice!");
	
		
		while(true) {
			askQuestion(input);
		}
	}
}		