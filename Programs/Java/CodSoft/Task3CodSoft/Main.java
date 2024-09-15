package CodeSoft.Task3CodeSoft;

public class Main {
  public static void main(String[] args) {
      // Initialize a BankAccount with an initial balance
      BankAccount account = new BankAccount(1000.00); // Initial balance of $1000

      // Create an ATM instance with the given account
      ATM atm = new ATM(account);

      // Display the ATM menu
      atm.displayMenu();
  }
}

