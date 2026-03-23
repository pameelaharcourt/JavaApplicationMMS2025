public class FacebookGrowthExe4_32{
	public static void main(String[] args) {
		
		double users = 1_000_000_000; // 1 billion
		double rate = 0.04; // 4%
		int months = 0;
		
		double target1 = 1_500_000_000; // 1.5 billion
		double target2 = 2_000_000_000; // 2 billion
		
		int monthsTo1_5B = 0;
		int monthsTo2B = 0;
		
		while (users < target2) {
			
			users = users * (1 + rate);// growth
			months++;
			
			if (users >= target1 && monthsTo1_5B == 0)
				monthsTo1_5B = months;
			
			if (users >= target2 && monthsTo2B == 0)
				monthsTo2B = months;
			
		}
		
		System.out.println("Months to reach 1.5 billion: " + monthsTo1_5B);
		System.out.println("Months to reach 2 billion: " + monthsTo2B);
	}
}