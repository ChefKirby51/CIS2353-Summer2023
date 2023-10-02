package Lab1;

import java.util.Scanner;
public class CatLitter {
    public static void main(String[] args) {
        double litterCost;
        double daysPerMonth;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much do you pay for a bag of cat litter?: ");
        litterCost = Double.parseDouble(keyboard.nextLine());

        System.out.println("Ok, how many times during the month on average do you go and buy cat litter?: ");
        daysPerMonth = Double.parseDouble(keyboard.nextLine());

        double litterCalculation = litterCost * daysPerMonth;
        System.out.println("Ok, it seems that you spend " + litterCalculation + "$ per month.");
    }
}
