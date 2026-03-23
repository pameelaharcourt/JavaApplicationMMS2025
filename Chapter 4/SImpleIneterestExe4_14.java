public class SImpleIneterestExe4_14{
	
	public static void main(String[] args) {
		
		double principal = 1000;
		for(int rate = 5; rate <= 10; rate++){
		
		System.out.println("Interest Rate: " +rate + "%");
		
		for (int year = 1; year <= 10; year++){
		double amount = principal * Math.pow(1 + rate/100.0, year);
		
		System.out.println(year + " " + amount);
		}
		}
	}
}