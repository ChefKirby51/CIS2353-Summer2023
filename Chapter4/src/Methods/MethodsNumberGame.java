package Methods;

import java.util.Scanner;
public class MethodsNumberGame {
    public static void main(String[] args) {
        String play = askUserIfTheyWantToPlay();

        while (play.equalsIgnoreCase("y")) {

            int highestNumber =  askHowHighToGuess();

            int randomNumber = (int) (Math.random() * highestNumber);

            int guess = askForAGuess(highestNumber);
            int numberOfGuesses = 1;

            while (guess != randomNumber) {
                printTooHighOrTooLow(guess, randomNumber);
                guess = Integer.parseInt(askUserIfTheyWantToPlay());
                numberOfGuesses++;
            }
            System.out.println("Great guessing, you got it in " + numberOfGuesses + " Guesses");
            System.out.println("Do you want to play again?: (y/n)");

            play = askUserIfTheyWantToPlay();
        }

        printHaveANiceDay();
    }

    //Void methods don't return values, they just run.
    public static void printHaveANiceDay(){
        System.out.println("Have a great day.");
        System.out.println("Enjoy the Sunshine.");
    }

    // If it isn't void, tell java what type of value is going to be returned
    public static String askUserIfTheyWantToPlay() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play a game?: (y/n)");
        String play = keyboard.nextLine();
        return play;
    }

    public static int askHowHighToGuess() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How high of a number do you want to guess?: ");
        int highestNumber = Integer.parseInt(keyboard.nextLine());
        return highestNumber;
    }

    // Values defined to be passed are parameters
    public static int askForAGuess(int highestNumber) { //We need the highest number, so we call Int highestNumber to use
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number 1 - " + highestNumber);
        int guess = Integer.parseInt(askUserIfTheyWantToPlay());
        return guess;
    }

    // if your have more than 1 parameter, just comma separate them
    public static void printTooHighOrTooLow(int guess, int randomNumber) {
        if (guess < randomNumber) {
            System.out.println("Too Low");
        } else {
            System.out.println("Too High");
        }
    }
}
