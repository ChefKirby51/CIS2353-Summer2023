package Chapter3;

import java.util.Scanner;
public class Notes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("Are you male or female?: ");
        String gender = keyboard.nextLine();


        // and &&
        // true && true == true
        // true && false == false
        // false && false == true


        if (age < 25 && gender.equalsIgnoreCase("m")){
            System.out.println("Your insurance rate is $250/month");
        }
        else if (age < 25){
            System.out.println("Your insurance rate is $200/month");
        }
        else {
            System.out.println("Your insurance rate is $250/month");
        }
        System.out.println("Please enter your annual income: ");
        int annualIncome = Integer.parseInt(keyboard.nextLine());

        // || OR - shift backslash key above the enter key - pipe
        // true || true == true
        // true || false == true
        //false || false == false

        System.out.println("Do you have any previous bankruptcies?: (Y/N)");
        String previousBankruptcies = keyboard.nextLine();

        if (annualIncome > 1_000_000 ||
                annualIncome > 50_000 &&
                        previousBankruptcies.equalsIgnoreCase("n")){
            System.out.println("Here is your loan.");
        }
        else{
            System.out.println("You get no loan.");
        }
        // not !
        // !true == false
        // !false == true

        System.out.println("Do you want to play again?: (y/n)");
        String playAgain = keyboard.nextLine();

        while (!playAgain.equalsIgnoreCase("n")){
            System.out.println("Do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();
        }

        System.out.println("Enter your favorite color: ");
        String favoriteColor = keyboard.nextLine().toLowerCase();

        switch (favoriteColor){
            case "blue":
                System.out.println("That's my favorite color.");
                break;
            case "red":
                System.out.println("That's my son's favorite color.");
                break;
            case "yellow":
                System.out.println("That's my daughter's favorite color.");
                break;
            default:
                System.out.println("I don't have a kid who likes that color");
        }

        System.out.println("What is your favorite number?: ");
        int favoriteNumber = Integer.parseInt(keyboard.nextLine());

        if (favoriteNumber > 0 && favoriteNumber < 10){
            System.out.println("You like single digits");
        } else if (favoriteNumber >= 10 && favoriteNumber < 1000){
            System.out.println("You like double digits");
        } else if (favoriteNumber < 0){
            System.out.println("You like negative numbers");
        } else {
            System.out.println("You like very big numbers");
        }
    }
}
