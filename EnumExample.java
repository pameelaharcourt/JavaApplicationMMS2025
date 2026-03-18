public class EnumExample{
	
	enum Day{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	public static void main(String [] args) {
		
		Day today; // declare enum variable
		today = Day.MONDAY;
		
		System.out.println("Today is: " + today);
		
		// using enum in switch statement
		switch(today){
			case MONDAY:
				System.out.println("Start of the work week.");
				break;
				
			case FRIDAY:
				System.out.println("Weekend is near!");
				break;
			case SATURDAY:
				System.out.println("Holy day.");
				break;
			case SUNDAY:
				System.out.println("Rest day.");
				break;
			
			default:
				System.out.println("Regular day.");
		}
	}
}