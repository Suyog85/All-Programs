package CodeSoft.Task3CodeSoft;

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (account.deposit(amount)) {
            System.out.printf("Successfully deposited $%.2f. Your new balance is $%.2f%n", amount, account.getBalance());
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    private void withdraw() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.printf("Successfully withdrew $%.2f. Your new balance is $%.2f%n", amount, account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount. Please try again.");
        }
    }
}

