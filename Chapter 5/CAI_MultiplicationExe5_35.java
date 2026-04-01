import java.util.Scanner;
import java.security.SecureRandom;

public class CAI_MultiplicationExe5_35{
	
	static SecureRandom random = new SecureRandom();
	
	// Method to generate and ask a question
	public static void askQuestion(Scanner input){
		
		int num1 = 1 + random.nextInt(9); // 1-9
		int num2 = 1 + random.nextInt(9); // 1-9
		
		int correctAnswer = num1 * num2;
		
		int studentAnswer;
		
		do{
			
			System.out.print("How much is " + num1 + " times " + num2 + "? ");
			studentAnswer = input.nextInt();
			
			if(studentAnswer == correctAnswer){
				System.out.println("Very good!");
			}else{
				System.out.println("No.Pleases try again.");
			}
			
		}while(studentAnswer != correctAnswer);
			
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Multiplication Practice!");
		
		// keep asking questions forver (or until program is stopped)
		while(true){
			askQuestion(input);
			
		}
	}
}