import java.util.Scanner;

public class GlobalWarmingQuizExe4_30{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int score = 0;
		int answer;
		
		// Question 1
		System.out.println("1. What is the primary greenhouse gas produced by human activities?");
		System.out.println("1. Oxyegen");
		System.out.println("2. Carbon dioxide");
		System.out.println("3. Nitrogen ");
		System.out.println("4. Hydrogen");
		answer = input.nextInt();
		
		if(answer == 2)
			score++;
		
		// Question 2
		System.out.println("\n2. Which human activity contributes most to increased CO2 levels?");
		System.out.println("1. Breathing");
		System.out.println("2. Burning fossil fuels");
		System.out.println("3. Planting trees ");
		System.out.println("4. Recycling");
		answer = input.nextInt();
		
		if(answer == 2)
			score++;
		
		// Question 3
		System.out.println("\n3. What do some global warming skeptics argue?");
		System.out.println("1. Climate change is entirely natural");
		System.out.println("2. The Earth is cooling rapidly");
		System.out.println("3. Humans have no impact at all ");
		System.out.println("4. The Sun does not affect climate");
		answer = input.nextInt();
		
		if(answer == 1)
			score++;
		
		// Question 4
		System.out.println("\n4. Which organisation provides scientific reports on climate change?");
		System.out.println("1. FIFA");
		System.out.println("2. WHO");
		System.out.println("3. IPCC");
		System.out.println("4. NASA only");
		answer = input.nextInt();
		
		if(answer == 3)
			score++;
		
		// Question 5
		System.out.println("\n5. What is one possible effect of global warming?");
		System.out.println("1. Decrease in sea levels");
		System.out.println("2. Increase in sea levels");
		System.out.println("3. Permanent winter ");
		System.out.println("4. No weather changes");
		answer = input.nextInt();
		
		if(answer == 2)
			score++;
		
		// Display result
		System.out.println("\nYour score: " + score);
		
		if(score == 5)
			System.out.println("Excellent");
		else if (score == 4)
			System.out.println("Very good");
		else{
			System.out.println("Time to brush up on your knowledge of global warming");
			System.out.println("\nUseful websites:");
			System.out.println("- https://climate.nasa.gov/");
			System.out.println("-https://www.ipcc.ch/");
			System.out.println("- https://www.noaa.gov/");
			System.out.println("- https://www.bbc.com/news/science_and_environment");
		}
		
		input.close();
		
	
		
		
		
	}
}