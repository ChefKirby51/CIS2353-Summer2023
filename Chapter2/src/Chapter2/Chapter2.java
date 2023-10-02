package Chapter2;

import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {
        // Declaring a variable
        int yourNumber;

        //Assigning the value 15 to the variable yourNumber
        yourNumber = 15;

        // Declaring and assigning variable
        int myFavoriteNumber = 51;

        System.out.println("Your number is: " + yourNumber);
        System.out.println("My favorite number is: " + myFavoriteNumber);

        yourNumber = 13;
        // yourNumber's value is now changed
        System.out.println("Your number is: " + yourNumber);

        double numberWithDecimal = 7.7;

        System.out.println("A number with a decimal is: " + numberWithDecimal);

        numberWithDecimal = 14.6;

        System.out.println("Another number with a decimal is: " + numberWithDecimal);

        System.out.println("95% of people can't figure this one out: 9 / 3 * 3 + 2");
        System.out.println(9 / 3 * 3 + 2);
        myFavoriteNumber = 10 + 2;
        myFavoriteNumber = myFavoriteNumber + 10;

        myFavoriteNumber = yourNumber * 3 + 6;
        System.out.println("my favorite number is now: " + myFavoriteNumber);

        // Integer division gives integer results - % is the modulus operator, gives the remainder
        System.out.println("5 / 2 == " + 5 / 2 + " with the remainder of: " + 5 % 2);

        // to get a double result from division, one or oth need to be a double
        double answer = 5.0 / 2;
        System.out.println("5 / 2 with a decimal result is: " + answer);

        //To treat a value as a double, you can cast it as a double with (double)
        double myFavoriteNumberDividedByYourFavoriteNumber = (double)myFavoriteNumber / yourNumber;

        System.out.println(myFavoriteNumberDividedByYourFavoriteNumber);

        String firstName = "Nick ";
        String lastName = "Scribner";

        // we're not adding, we're concatenating
        System.out.println(firstName + lastName);

        String fullName = firstName + lastName;

        System.out.println(fullName);

        String nicksNameAndFavoriteNumber = fullName + " " + myFavoriteNumber;

        System.out.println(nicksNameAndFavoriteNumber);

        // The backslash is the 'escape' character - means the next letter is special
        System.out.println("My friend O' Shane said \"Hey Nick!\"");

        // \n new line - goes down a line
        System.out.println("New Line == \n \\n");

        // \t is a tab
        System.out.println("My Coffee Menu: ");
        System.out.println("$1\tCoffee");
        System.out.println("$2\tEspresso");
        System.out.println("$3\tLatte");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Hello there, " + name);

        System.out.println("How many coffees do you want to buy today?");
        // Don't use nextInt() - it causes problems later
        // Int coffeeForToday = keyboard.nextInt();

        // It is recommended to use Integer.parseInt rather than keyboard.nextInt
        int coffeeForToday = Integer.parseInt(keyboard.nextLine());
        System.out.println("How much does a coffee cost?");
        double costPerCoffee = Double.parseDouble(keyboard.nextLine());

        System.out.println("That will cost you $" + costPerCoffee * costPerCoffee);

    }
}
