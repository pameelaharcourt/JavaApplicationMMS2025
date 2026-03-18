import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample{
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		
		System.out.println(date.format(formatter));
	}
}