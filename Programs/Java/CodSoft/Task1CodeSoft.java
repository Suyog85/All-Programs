package CodeSoft;
import java.util.Random;
import java.util.Scanner;

public class Task1CodeSoft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalRounds = 0;
        int totalAttempts = 0;

        while (true) {
            // Start a new round
            int attempts = playRound(random, scanner);
            totalRounds++;
            totalAttempts += attempts;

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
        }

        // Display the user's score
        if (totalRounds > 0) {
            double averageAttempts = (double) totalAttempts / totalRounds;
            System.out.printf("\nGame Over! You played %d rounds.%n", totalRounds);
            System.out.printf("Your average number of attempts per round: %.2f%n", averageAttempts);
        } else {
            System.out.println("No rounds played.");
        }

        scanner.close();
    }

    private static int playRound(Random random, Scanner scanner) {
        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("\nI'm thinking of a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess;
            
            // Validate user input
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            attempts++;

            // Provide feedback
            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.printf("Congratulations! You've guessed the number %d in %d attempts.%n", targetNumber, attempts);
                return attempts;
            }
        }

        System.out.printf("Sorry, you've used all %d attempts. The correct number was %d.%n", maxAttempts, targetNumber);
        return attempts;
    }
}

