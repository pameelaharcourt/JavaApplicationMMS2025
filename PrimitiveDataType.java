public class PrimitiveDataType{
	public static void main(String[] args) {
		//whole number primitive data type
		byte age = 30;
		System.out.printf("i am %d Year Old%n",age);
		
		short quantityOfBags = 10000;
		System.out.printf("The quantity of bags ordered is %d%n", quantityOfBags);
		
		
		int nigeriaPopulation = 2000000000;
		System.out.printf("The population of Nigeria is %d%n",nigeriaPopulation);
		
		long worldsPopulation = 9000000000000000L;
		System.out.printf("The worlds Population is %d",worldsPopulation);
		
		//float-point primitive data type
		float myBalance = 6945.6000057F;
		System.out.printf(" My Account balance is %.2f%n",myBalance);
		
		double cBNBalance = 9874466464.904;
		System.out.printf("CBN account balance is %f%n",cBNBalance);
		
		// single character primitive dataype
		char symbol = '$';
		System.out.printf("My account balnce is %c%.2f%n",symbol,myBalance);
		
		//boolean primitive data type
		boolean isJavaFun = true;
		System.out.printf("Do you love learning Java? %b%n",isJavaFun);
	}
}