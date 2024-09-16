import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        // Variable to store user's guess
        int userGuess = 0;
        // Variable to store the number of attempts
        int attempts = 0;

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // Game loop
        while (userGuess != randomNumber) {
            // Prompt user for their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            // Provide hints to the user
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
