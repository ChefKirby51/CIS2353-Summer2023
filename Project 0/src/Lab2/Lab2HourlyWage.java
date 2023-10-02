package Lab2;

import java.util.Scanner;

public class Lab2HourlyWage {
    public static void main(String[] args) {
        System.out.println("Hey there, superstar! It's so good to see you!" +
                " I want to help you figure out your weekly pay!");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Could you tell me how many hours you worked" +
                " this week?");
        int hoursWorkedInAWeek = Integer.parseInt(keyboard.nextLine());
        System.out.println("Amazing! you worked " + hoursWorkedInAWeek + " hours!");
        System.out.println("Now, what is your hourly wage?");
        double hourlyWage = Double.parseDouble(keyboard.nextLine());
        System.out.println("So, you make $" + hourlyWage +
                " That's quite, something!");

        if (hoursWorkedInAWeek < 40){
            double grossPay = hourlyWage * hoursWorkedInAWeek;
            System.out.println("You made $" + grossPay + " this week!");
            double taxDeduction = grossPay * .1;
            System.out.println("You need to pay $" + taxDeduction + " in taxes.");
            double netPayment = grossPay - taxDeduction;
            System.out.println("What you actually made this week is: $" + netPayment);

        } else {
            double overTimePay = (hourlyWage * 0.5) + hourlyWage;
            double grossPay = 40 * hourlyWage + ((hoursWorkedInAWeek - 40 ) * overTimePay);
            System.out.println("You made $ " + grossPay + " this week!");
            double taxDeduction = grossPay * .1;
            System.out.println("You need to pay $" + taxDeduction + " in taxes.");
            double netPayment = grossPay - taxDeduction;
            System.out.println("What you actually made this week is: $" + netPayment);
        }

    }
}
