package Project1;
/*
Nick Scribner
Project 1
Intro to Java 2023FA-CIS-1500-01536
 */

import java.util.Scanner;
public class Project1LunarLander {
    static int distance = 10;
    static int lunarXTilt = ((int) (-10 + (Math.random() * (10 - (-10))) + 1));
    static int lunarYTilt = ((int) (-10 + (Math.random() * (10 - (-10))) + 1));
    static int Thrust;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Copy Pilot, You're just about to land on the asteroid, check your alignment and " +
                "get ready for landing. You are about " + distance + " clicks from surface.");
        System.out.println("If my chance a self destruct sequence is engaged. The code for deactivation is 5151. Don't forget!");
        System.out.println();
        System.out.println("Your controls are as followed:");
        System.out.println("one: Turn +1 X axis");
        System.out.println("two: Turn -1 X axis");
        System.out.println("Three: Turn +1 Y axis");
        System.out.println("Four: Turn -1 Y axis");
        System.out.println("Five: Use Thrusters +2 distance");
        System.out.println("six: Do Nothing");
        System.out.println("!!SELF DESTRUCT!!");

        String lunarInput = lunarGameOptions();
        do {
            System.out.println("Your Lunar lander is near the surface at " + distance + " clicks");
            System.out.println("Your x axis alignment is at " + lunarXTilt);
            System.out.println("and your y axis is at" + lunarYTilt);

            if (lunarInput.equalsIgnoreCase("one")) {
                System.out.println("X axis has increased by 1");
                lunarXTilt++;
                distance--;
            } else if (lunarInput.equalsIgnoreCase("two")) {
                System.out.println("X axis has decreased by 1");
                lunarXTilt--;
                distance--;
            } else if (lunarInput.equalsIgnoreCase("three")) {
                System.out.println("Y axis has increased by 1");
                lunarYTilt++;
                distance--;
            } else if (lunarInput.equalsIgnoreCase("four")) {
                System.out.println("Y axis has decreased by 1");
                lunarYTilt--;
                distance--;
            } else if (lunarInput.equalsIgnoreCase("five")) {
                System.out.println("Thrusters have been used, distance from surface has increased by 2");
                Thrust = distance + 2;
                distance--;

            } else if (lunarInput.equalsIgnoreCase("six")) {
                System.out.println("Awaiting orders");
                distance--;
            } else if (lunarInput.equalsIgnoreCase("seven")) {
                SELFDESTRUCTSEQUENCE();
                distance--;
            } else {
                distance--;
            }
            lunarInput = lunarGameOptions();
        } while (distance != 0);
        if (lunarXTilt == 0 && lunarYTilt == 0 && distance == 0) {
            System.out.println("Good job pilot. That's a safe landing. Take a break and wait for further instructions.");
        } else {
            System.out.println("...Come in pilot...ome in! ...ere must h... a crash. Damnit!");
            System.out.println("Game Over!");
        }
    }

    public static String lunarGameOptions() {
        Scanner keyboard = new Scanner(System.in);
        String lunarInput = keyboard.nextLine();
        while (!lunarInput.equalsIgnoreCase("one") && (!lunarInput.equalsIgnoreCase("two")
        && (!lunarInput.equalsIgnoreCase("three") && (!lunarInput.equalsIgnoreCase("four")
        && (!lunarInput.equalsIgnoreCase("five") && (!lunarInput.equalsIgnoreCase("six")
        && (!lunarInput.equalsIgnoreCase("seven")))))))) {
            System.out.println("Wrong Input. Please Try again");
            lunarInput = keyboard.nextLine();
        }
        return lunarInput;
    }
    public static void SELFDESTRUCTSEQUENCE() {
        Scanner keyboard = new Scanner(System.in);
        int codeInputAttempt = 5;
        System.out.println("--SELF DESTRUCT SEQUENCE HAS BEEN AUTHORIZED!--");
        System.out.println("--TO CANCEL SELF DESTRUCT, PLEASE TYPE CANCELLATION CODE!--");
        int cancellationCode = Integer.parseInt(keyboard.nextLine());
        do {
            if (cancellationCode == 5151) {
                System.out.println("--Self Destruction Sequence has been deactivated--");
                System.out.println("--Thank you for your self preservation :)--");
            } else {
                System.out.println("--YOU HAVE ENTERED THE WRONG CODE: " + codeInputAttempt + "ATTEMPTS REMAINING--");
                codeInputAttempt--;
                cancellationCode = Integer.parseInt(keyboard.nextLine());
                if (codeInputAttempt == 0) {
                    System.out.println("--MAIN SYSTEM FAILURE--");
                    System.out.println("--CORE OVERLOAD--");
                    System.out.println("-----------------------------------");
                    System.out.println("-----------------------------------");
                    System.out.println("Game Over");
                    System.exit(0);
                }
            }
        } while (cancellationCode != 5151);
    }
}

