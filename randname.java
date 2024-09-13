import java.util.Scanner;

public class randname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int rand;
        int guess;
        int lives;
        int confirmation = 1;
        
        while (true) {
            System.out.println("\nWELCOME TO THE GUESSING GAME, PRESS 1 TO START OR ANY OTHER NUMBER TO EXIT");
            confirmation = input.nextInt();
            if (confirmation != 1) {
                System.out.println("Exiting the game...");
                System.exit(0);
            }
            
            // Initialize the game variables
            rand = (int) (Math.random() * 11) + 1;  // Random number between 1 and 11
            lives = 5;
            
            // Main game loop
            while (lives > 0) {
                System.out.println("You have " + lives + " lives remaining.");
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                
                if (guess < rand) {
                    System.out.println("YOUR GUESS IS LOWER");
                } else if (guess > rand) {
                    System.out.println("YOUR GUESS IS HIGHER");
                } else {
                    System.out.println("CONGRATS! YOU GUESSED THE NUMBER!");
                    System.out.println("The computer picked " + rand);
                    System.out.println("Starting a new game...\n");
                    
                    // Reset lives and generate a new random number for the new game
                    lives = 5;
                    rand = (int) (Math.random() * 11) + 1;
                    continue;  // Start the new game immediately
                }
                
                lives--;  // Decrease a life after each wrong guess
                
                if (lives == 0) {
                    System.out.println("YOU LOSE! The correct number was " + rand);
                    System.out.println("Would you like to try again? Press 1 for YES or any other number for NO.");
                    confirmation = input.nextInt();
                    
                    if (confirmation != 1) {
                        System.out.println("Exiting the game...");
                        input.close();
                        System.exit(0);
                    } else {
                        // Reset the game with new random number and lives
                        rand = (int) (Math.random() * 11) + 1;
                        lives = 5;
                        System.out.println("Starting a new game...\n");
                    }
                }
            }
        }
    }
}
