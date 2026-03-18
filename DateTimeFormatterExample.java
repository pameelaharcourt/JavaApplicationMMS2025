import java,time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample{
	
	public static void main(String[] args){
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyy HH:mm:ss");
		
		String formattedDate = now.format(formatter);
		
		System.out.println("Formatted Date and Time: " + formattedDate);
	}
}