import java.util.Scanner;
import java.security.SecureRandom;

public class CAI_DifficultyExe5_38{
	
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
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			
			System.out.print("Enter difficulty level(1, 2, 3, ...): ");
			int level = input.nextInt();
			
			int correctCount = 0;
			int totalCount = 0;
			
			while(totalCount < 10) {
				int num1 = generateNumber(level);
				int num2 = generateNumber(level);
			
				int correctAnswer = num1 * num2;
				
			
				System.out.print("How much is " + num1 + " times" + num2 + "? ");
				int answer = input.nextInt();
			
				if(answer == correctAnswer){
					correctResponse();
					correctCount++;
					
				} else {
					incorrectResponse();
				}
				
				totalCount++;			
				
			}
			// Calculate percentage
			double percentage = (correctCount / 10.0) * 100;
			
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