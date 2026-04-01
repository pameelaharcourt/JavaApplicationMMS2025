import java.util.Scanner;

public class ParkingChargesExe5_8{
	
	public static double calculateCharges(double hours) {
		double charge = 2.0;
		
		if(hours > 3) {
			charge += Math.ceil(hours -3)* 0.5;
		}
		if(charge > 10.0) {
			charge = 10.0;
		}
		
		return charge;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("Enter hours parked: ");
			double hours = input.nextDouble();
			
			double charge = calculateCharges(hours);
			total += charge;
			
			System.out.println("Charges: $" + charge);
		}
		System.out.println("Total receipts: $" + total);
	}
}