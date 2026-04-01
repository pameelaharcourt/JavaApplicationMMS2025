
package composition;


public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890");

        acc.deposit(5000);
        acc.withdraw(2000);

        acc.showTransactions();
    }
}
   
