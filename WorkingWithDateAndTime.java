import java.time.LocalDate;
import java.time.LocalTime;

public class WorkingWithDateAndTime{
	public static void main(String[] args) {
		
		//now method
		LocalDate currentDate = LocalDate.now();
		//using off method
		LocalDate myDate = LocalDate.of(2014,5,17);
		// using parse method
		LocalDate resumptionDate = LocalDate.parse("2026-06-17");
		
		// using the time method
		
		if(myDate.equals(currentDate)) {
			System.out.println("Today is the day of your appointment");
		}
		else{
			System.out.println("Today is not the day of your appointment");
		}
		
		System.out.println("Working with date");
		System.out.printf("Today's date is %s%n", currentDate);
		System.out.printf("the wedding date is %s%n",myDate);
		System.out.printf("The resumption date is %s%n",resumptionDate);
		System.out.printf("the year is %s%n",currentDate.getYear());
		System.out.printf("the month is %s%n",currentDate.getMonth());
		System.out.printf("the day is %s%n",currentDate.getDayOfMonth());
		System.out.printf("My exams will be on the %s%n",currentDate.plusDays(7));
		System.out.printf("The year is %s%n",currentDate.plusYears(2));
		
		System.out.println("Working with time");
		LocalTime currentTime = LocalTime.now();
		LocalTime myTime = LocalTime.of(2,3,12);
		LocalTime resumptionTime = LocalTime.parse("03:55:17");
		
		
		System.out.printf("The time is %s%n", currentTime);
		System.out.printf("The time for my wedding date is %s%n",myTime);
		System.out.printf("The resumption time is %s%n",resumptionTime);
		System.out.printf("The hour is %s%n",currentTime.getHour());
		System.out.printf("The minute is %s%n",currentTime.getMinute());
		System.out.printf("The seconds is %s%n",currentTime.getSecond());
		System.out.printf("My exams time will be by %s%n",currentTime.plusHours(7));
		System.out.printf("The time is %s%n",currentTime.plusMinutes(60));
		
		
	}
}