import java.util.Scanner;
import java.security.SecureRandom;

public class CAI_FinalExe5_39{
	
	static SecureRandom random = new SecureRandom();
	
	// correct responses
	public static void correctResponse() {
		int response = 1 + random.nextInt(4);
		
		
		switch(response){
			case 1: System.out.println("very good!"); break;
			case 2: System.out.println("Excellent!"); break;
			case 3: System.out.println("Nice work!"); break;
			case 4: System.out.println("Keep up the good work!"); break;
		}
	}
	
	// incorrect responses
	public static void incorrectResponse() {
		int response = 1 + random.nextInt(4);
		
		switch(response){
			case 1: System.out.println("No. Please try again."); break;
			case 2: System.out.println("Wrong. Try once more."); break;
			case 3: System.out.println("Don't give up!"); break;
			case 4: System.out.println("Keep trying."); break;
		}
	}
	// Generate random number based on difficulty level
	public static int generateNumber(int level){
		int max = (int) Math.pow(10, level) - 1;
		return 1 + random.nextInt(max);
	}
	
	// Ask a question based on type
	public static boolean askQuestion(Scanner input, int level, int type){
		
		int num1 = generateNumber(level);
		int num2 = generateNumber(level);
		
		int operation = type;
		
		// if random mix
		if(type == 5) {
			operation = 1 + random.nextInt(4);
		}
		
		int correctAnswer = 0;
		
		
		switch(operation){
			case 1: // Adition
				correctAnswer = num1 + num2;
				System.out.print("How much is " + num1 + " + " + num2 + "? ");
				break;
			
			case 2: // Subtraction
				correctAnswer = num1 - num2;
				System.out.print("How much is " + num1 + " - " + num2 + "? ");
				break;
			
			case 3: // Multiplication
				correctAnswer = num1 * num2;
				System.out.print("How much is " + num1 + " * " + num2 + "? ");
				break;
			
			case 4: // Division
				// Ensure clean division
				correctAnswer = num1;
				num1 = num1 * num2;
				System.out.print("How much is " + num1 + " / " + num2 + "? ");
				break;
				
		}
		
		int answer = input.nextInt();
		
		if(answer == correctAnswer){
			correctResponse();
			return true;
					
		} else {
			incorrectResponse();
			return false;
		}
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			
			System.out.print("Enter difficulty level(1, 2, 3, ...): ");
			int level = input.nextInt();
			
			System.out.println("Choose problem type:");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Random mix");
			System.out.println("Enter choice: ");
			int type = input.nextInt();
			
			
			int correct = 0;
			int total = 0;
			
			while(total < 10 ){
				if(askQuestion(input, level, type)){
					correct++;
				}
				total++;
				
			}
			
			// Calculate percentage
			double percentage = (correct / 10.0) * 100;
			
			System.out.println("\nScore: " + percentage + "%");
			
			if(percentage < 75){
				System.out.println("Please ask your teacher for extra help.");
			
			}else{
				System.out.println("Congratulations, you are ready to go to the next level!");
				
			}
			
			System.out.println("\n---New Student ---\n");
		}
	
	}	
}		