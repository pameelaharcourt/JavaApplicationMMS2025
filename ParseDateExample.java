// Parsing a String to Date

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDateExample{
	
	public static void main(String[] args) {
	
		String dateString = "16/03/2026";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date = LocalDate.parse(dateString, formatter);
		
		System.out.println(date);
	}
}