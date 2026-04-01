import java.util.Scanner;

public class GuessGameExe5_31{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = 1 + (int) (Math.random() * 1000);
		int guess, count = 0;
		
		do{
			System.out.print("Guess: ");
			guess = input.nextInt();
			count++;
			
			
			if(guess > number)
				System.out.println("Too high");
			else if (guess < number)
				System.out.println("Too low");
		}while(guess != number);
		
		System.out.println("Correct in " + count + " tries!");
		
		if(count <= 10)
			System.out.println("Good job!");
		else
			System.out.println("You should do better!");
	}
}