import java.util.Scanner;

public class TwoLargestNumbersExe3_23{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.print("Enter number: ");
			int num = input.nextInt();
			
			if(num > largest){
				secondLargest = largest;
				largest = num;
			}
			else if(num > secondLargest){
				secondLargest = num;
			}
		}
		
		System.out.println("Largest = " + largest);
		System.out.println("Second Largest = " + secondLargest);
		
	}
}