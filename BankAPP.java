public class BankAPP{
	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount("John Williams", "3108057815", "SAVINGS", 678.987);
		
		bankAccount1.displayAccountInfo();
		
		System.out.println("=================================================");
		
		BankAccount bankAccount2 = new BankAccount("Delight Jessy", "3108057886", "CURRENT", 66.99);
		bankAccount2.displayAccountInfo();
		
		bankAccount2.deposit(67.34);
		bankAccount2.displayAccountInfo();
	}
}