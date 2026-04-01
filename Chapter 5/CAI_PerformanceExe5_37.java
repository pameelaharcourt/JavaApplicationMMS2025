import java.util.Scanner;
import java.security.SecureRandom;

public class CAI_PerformanceExe5_37{
	
	static SecureRandom random = new SecureRandom();
	
	// correct response messages
	public static void correctResponse() {
		int response = 1 + random.nextInt(4);
		
		switch(response){
			case 1: System.out.println("very good!"); break;
			case 2: System.out.println("Excellent!"); break;
			case 3: System.out.println("Nice work!"); break;
			case 4: System.out.println("Keep up the good work!"); break;
		}
	}
	
	// incorrect reponse messages
	public static void incorrectResponse() {
		int response = 1 + random.nextInt(4);
		
		switch(response){
			case 1: System.out.println("No. Please try again."); break;
			case 2: System.out.println("Wrong. Try once more."); break;
			case 3: System.out.println("Don't give up!"); break;
			case 4: System.out.println("Keep trying."); break;
		}
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while(true){  // allow new students to try
		
			int correctCount = 0;
			int totalCount = 0;
			
			while(totalCount < 10) {
				int num1 = 1 + random.nextInt(9);
				int num2 = 1 + random.nextInt(9);
			
				int correctAnswer = num1 * num2;
				int studentAnswer;
			
				System.out.print("How much is " + num1 + " times" + num2 + "? ");
				studentAnswer = input.nextInt();
			
				if(studentAnswer == correctAnswer){
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