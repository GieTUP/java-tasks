import java.util.Scanner;

public class rand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int confirmation = 1;

        while (true){
            int rand = (int) (Math.random() * 11) + 1;
            int guess;
            int lives = 5;       
            System.out.println(" ");
            System.out.println("WELCOME TO GUESSING GAME, PRESS 1 TO START");
            confirmation = input.nextInt();
            if (confirmation == 1) {} 
            else if (confirmation != 1) {
                System.exit(0);
            }
            while (lives > 0) {
                System.out.println("You have " + lives + " lives remaining.");
                System.out.print("Enter guess: ");
                guess = input.nextInt();

                if (guess < rand) {
                    System.out.println("YOUR GUESS IS LOWER");
                } else if (guess > rand) {
                    System.out.println("YOUR GUESS IS HIGHER");
                } else if (guess == rand) {
                    System.out.println("CONGRATS YOU GUESSED THE NUMBER");
                    System.out.println("The computer picked " + rand + "\n");
                    System.out.println("Starting a new game...\n");
                    break;
                }

                lives--;

                if (lives == 0) {
                    System.out.println("YOU LOST");
                    System.out.println("THE CORRECT NUMBER WAS " + rand);
                    System.out.println("Starting a new game...\n");
                    }
                }
            }
       }
  }

