import java.util.Scanner;

public class CandidateTestCheck{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter candidateName: ");
		String candidateName = input.nextLine();
		
		System.out.print("Please enter your English score: ");
		int English = input.nextInt();
		
		System.out.print("Please enter your Mathematics score: ");
		int Mathematics = input.nextInt();
		
		System.out.print(" Please enetr your ICT score: ");
		int ICT = input.nextInt();

		double average = (English + Mathematics + ICT)/3;
		
		if(English > 75 && average >= 80) {
			System.out.printf("Emplpyment letter sent");
		}
		else{
			System.out.println("Rejected letter sent");
		}
	}
}
		