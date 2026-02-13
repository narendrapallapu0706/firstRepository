
// Java Program to demonstrates the Number guessing game
import java.util.Scanner;

public class project1 {
    
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 20
        int number = 1 + (int)(20 * Math.random()); 
        // math.random() is range in b/w 0 to 1 i.e 0.1,0.2,...0.9 ex is 5*0.9=4.5 after converting to int is 4
        // Number of attempts
        int K = 5;

        System.out.println(
            "A number is chosen between 1 and 20.");
        System.out.println(
            "You have " + K
            + " attempts to guess the correct number.");

        // Loop for K attempts
        for (int i = 0; i < K; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            // Check conditions
            if (guess == number) {
                System.out.println(
                    " Congratulations! You guessed the correct number.");
                sc.close(); // Exit function if guessed correctly
                return;
            }
            else if (guess < number) {
                System.out.println(
                    " The number is greater than " + guess);
            }
            else {
                System.out.println(
                    " The number is less than " + guess);
            }
        }

        // If the user runs out of attempts
        System.out.println(
            "You've exhausted all attempts. The correct number was: "
            + number);
        sc.close(); // Exit function 
    }

    public static void main(String[] args)
    {
        guessingNumberGame();
    }
}