package Chapter3;

import java.util.Random;
import java.util.Scanner;
public class PartnerLab3 {
    public static void main(String[] args) {
        System.out.println("Hi! My name is Beatrice! Lets play Rock," +
                " paper, scissors, spock, lizard!");
        Scanner keyboard = new Scanner(System.in);
        String playAgain;
        do {
            System.out.println("On three we shout our answer, ready? One..." +
                    " two... three!");
            String signChoice = keyboard.nextLine();
            while (!signChoice.equalsIgnoreCase("rock") &&
                    !signChoice.equalsIgnoreCase("paper") &&
                    !signChoice.equalsIgnoreCase("scissors") &&
                    !signChoice.equalsIgnoreCase("spock") &&
                    !signChoice.equalsIgnoreCase("lizard")) {
                System.out.println("Oh, please pick from one of the five" +
                        " options I said.");
                signChoice = keyboard.nextLine();
            }
            Random RNG = new Random();
            int randomNumber = RNG.nextInt(5);
            String beatriceAnswer = "";

            if (randomNumber == 0) {
                beatriceAnswer = "rock";
            } else if (randomNumber == 1) {
                beatriceAnswer = "paper";
            } else if (randomNumber == 2) {
                beatriceAnswer = "scissors";
            } else if (randomNumber == 3) {
                beatriceAnswer = "spock";
            } else {
                beatriceAnswer = "lizard";
            }
            System.out.println(beatriceAnswer);
            if (signChoice.equalsIgnoreCase(beatriceAnswer)) {
                System.out.println("Its a draw!");
            } else if (signChoice.equalsIgnoreCase("rock") && beatriceAnswer.equalsIgnoreCase("scissors")
                    || signChoice.equalsIgnoreCase("rock") && beatriceAnswer.equalsIgnoreCase("lizard") ||
                    signChoice.equalsIgnoreCase("paper") && beatriceAnswer.equalsIgnoreCase("rock") ||
                    signChoice.equalsIgnoreCase("paper") && beatriceAnswer.equalsIgnoreCase("spock") ||
                    signChoice.equalsIgnoreCase("scissors") && beatriceAnswer.equalsIgnoreCase("lizard") ||
                    signChoice.equalsIgnoreCase("scissors") && beatriceAnswer.equalsIgnoreCase("paper") ||
                    signChoice.equalsIgnoreCase("spock") && beatriceAnswer.equalsIgnoreCase("scissors") ||
                    signChoice.equalsIgnoreCase("spock") && beatriceAnswer.equalsIgnoreCase("rock") ||
                    signChoice.equalsIgnoreCase("lizard") && beatriceAnswer.equalsIgnoreCase("spock") ||
                    signChoice.equalsIgnoreCase("lizard") && beatriceAnswer.equalsIgnoreCase("paper")) {
                System.out.println("Hey! You win! Did you cheat?");
            } else {
                System.out.println("Aw, you lose. Better luck next time.");
            }
            System.out.println("Say, do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();
        }while (!playAgain.equalsIgnoreCase("n"));
        System.out.println("Okay then, I had fun! See you around!");
    }
}
