import java.util.Scanner;

public class CoinTossExe5_29{
	
	enum Coin {HEADS, TAILS}
	
	public static Coin flip() {
		if(Math.random() < 0.5)
			return Coin.HEADS;
		else
			return Coin.TAILS;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int heads = 0, tails = 0;
		int choice;
		
		do{
			System.out.println("1. Toss Coin");
			System.out.println("2. Exit");
			choice = input.nextInt();
			
			if(choice == 1){
				Coin result = flip();
				
				System.out.println("Result: " + result);
				
				if(result == Coin.HEADS)
					heads++;
				else
					tails++;
			}
			
			
		}while(choice != 2);
		
		System.out.println("Heads: " + heads);
		System.out.println("tails: " + tails);
	}
}