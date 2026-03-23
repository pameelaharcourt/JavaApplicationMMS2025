public class WorldPopulationGrowthExe3_39{
	
	public static void main(String[] args) {
		
		double population = 8000000000.0;
		double growthRate = 0.01;
		
		double initialPopulation = population;
		int yearDouble = 0;
		
		System.out.println("Year\tPopulation\tIncrease");
		
		for(int year = 1; year <= 75; year++){
			
		
			double increase = population * growthRate;
			population = population + increase;
			
			System.out.printf("%d\t%.0f\t%.0f%n", year, population, increase);
			
			if(population >= 2 * initialPopulation && yearDouble == 0) {
				yearDouble = year;
			}
		}
		
		System.out.println("\nPopulation will double in year: " + yearDouble);
		
	}	
}