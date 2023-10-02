package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class HourlyWage {
    public static void main(String[] args) {
        // variables and imports
        double hourlyWages; //This will prompt how much the user gets paid
        double workHours; //How many hours are worked per week
        double overtimeHours; //How many hours are worked past 40 hours per week.
        double grossPay; //How much money is made by how many hours are worked per week.
        double taxes; //How much taxes are owed based on gross pay.
        double netPay; // How much money is paid after taxes are processed.
        Scanner keyboard = new Scanner(System.in); //used for input
        DecimalFormat numberFormat = new DecimalFormat("#.00"); // limits the amount of decimals in printed the results

        System.out.println("In the job that you work at, what is your hourly wage?: ");
        hourlyWages = Double.parseDouble(keyboard.nextLine());
        System.out.println("Next, How many hours do you work in a week?: ");
        workHours = Double.parseDouble(keyboard.nextLine());

        overtimeHours = (hourlyWages * workHours) * 1.5;

        //math calculations
        if (workHours <= 40 ){
            grossPay = hourlyWages * workHours;
        }
        else {
            grossPay = ((workHours - 40) * overtimeHours) + (40 * hourlyWages);
        }

        taxes = grossPay * .1;
        netPay = grossPay - taxes;

        // results
        System.out.println("Here are the results of your weekly pay: ");
        System.out.println("Gross pay: $" + numberFormat.format(grossPay));
        System.out.println("Taxes: $" + numberFormat.format(taxes));
        System.out.println("Net pay: $" + numberFormat.format(netPay));
    }
}
