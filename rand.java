import java.util.Scanner;

public class rand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
while(true){ //PRE ADD NI
        int rand = (int) (Math.random() * 11);
        int guess;

       do { 
            System.out.print("Enter guess: ");
            guess = input.nextInt();

            if (guess < rand) {
                System.out.println("YOUR GUESS IS LOWER");
            } else if (guess > rand) {
                System.out.println("YOUR GUESS IS HIGHER");
            } else if (guess == rand) {
                System.out.println("CONGRATS YOU GUESSED THE NUMBER");
            }
            
            
        } while (guess != rand);
        if (guess == rand) {
            System.out.println("The computer picked " + rand);
            System.out.println("Starting a new game...\n");
        }
    }
}
}
//ikaw mapakot sang rand