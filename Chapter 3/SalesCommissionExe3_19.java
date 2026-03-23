import java.util.Scanner;

public class SalesCommissionExe3_19{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double sales = 0;
		double item;
		
		System.out.println("Enter sales amount(-1 to stop)");
		
		item = input.nextDouble();
		
		while(item != -1){
			sales += item;
			item = input.nextDouble();
			
		}
		
		double salary = 200 + (0.09 * sales);
		
		System.out.println("Total earnings = $" + salary);
	}
}