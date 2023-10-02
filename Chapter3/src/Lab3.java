import java.util.Random;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {

        String playAgain; //This will be used when we need to restart the program
        do {

            System.out.println("Welcome to the Game!");
            Scanner keyboard = new Scanner(System.in);
            String playerChoice;
            System.out.println("Choose Rock, Paper, Scissors, Lizard or Spock: ");
            playerChoice = keyboard.nextLine();

            // With only 5 choices, any other input will cause a loop.
            while (!playerChoice.equalsIgnoreCase("rock") &&
                    !playerChoice.equalsIgnoreCase("paper") &&
                    !playerChoice.equalsIgnoreCase("scissors") &&
                    !playerChoice.equalsIgnoreCase("lizard") &&
                    !playerChoice.equalsIgnoreCase("spock")) {
                System.out.println("Please choose from the list as stated above: ");
                playerChoice = keyboard.nextLine();
            }

            Random randomChoice = new Random();
            int randomNumber = randomChoice.nextInt(5);

            String pcChoice; // all choices revolve around the array, making the system easier to work with
            if (randomNumber == 0) {
                pcChoice = "rock";
            } else if (randomNumber == 1) {
                pcChoice = "paper";
            } else if (randomNumber == 2) {
                pcChoice = "scissors";
            } else if (randomNumber == 3) {
                pcChoice = "lizard";
            } else {
                pcChoice = "spock";
            }

            System.out.println("The Player chose " + playerChoice + "!");
            System.out.println("The PC chose " + pcChoice + "!");


            if (playerChoice.equals(pcChoice)) { // if the player chose the same as the PC, it would always lead to a tie
                System.out.println("It's a draw"); // The if else sequence is a bit big, but it shows all winning scenarios.
            } else if (playerChoice.equals("rock") && pcChoice.equals("scissors") || playerChoice.equals("rock") && pcChoice.equals("lizard")
                    || playerChoice.equals("paper") && pcChoice.equals("rock") || playerChoice.equals("paper") && pcChoice.equals("spock")
                    || playerChoice.equals("scissors") && pcChoice.equals("paper") || playerChoice.equals("scissors") && pcChoice.equals("lizard")
                    || playerChoice.equals("spock") && pcChoice.equals("scissors") || playerChoice.equals("spock") && pcChoice.equals("rock")
                    || playerChoice.equals("lizard") && pcChoice.equals("spock") || playerChoice.equals("lizard") && pcChoice.equals("paper")) {
                System.out.println("The player wins!");
            } else { // with the ties and winning scenarios out of the way, all other events lead to the PC winning the game
                System.out.println("The PC wins!");
            }

            System.out.println();
            // inputting y or Y will restart the program, allowing the user to continue playing the game. anything else will
            // result in the program ending.
            System.out.println("Would you like to play again? (Y/N)");
            playAgain = keyboard.nextLine();
        } while (playAgain.equals("Y") || playAgain.equals("y"));

        System.out.println("Thank You for playing");
    }
}
