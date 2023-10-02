package Chapter3Notes;

import java.util.Scanner;

public class Chapter3Notes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        while (number <= 10){
            System.out.println(number);
            number++;
        }
        int anotherNumber = 0;
        do {
            System.out.println(anotherNumber);
            anotherNumber++;
        } while (anotherNumber <= 10);

        // validation loop - only ends when we have a valid input
        String pillColor = "";

        // Red and Blue are the only inputs allowed, the program will loop until the required input is done
        while (!pillColor.equalsIgnoreCase("blue") &&
                !pillColor.equalsIgnoreCase("red")){
            System.out.println("Do you want the blue pull or the red pill?: ");
            pillColor = keyboard.nextLine();
        }
        System.out.println("Enter the width of a rectangle: ");
        int width = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the height of a rectangle: ");
        int height = Integer.parseInt(keyboard.nextLine());

        for ( int currentRow = 0; currentRow < height; currentRow++){
            for (int currentColumn = 0; currentColumn < width; currentColumn++){
                //System.out.print doesn't add a newline after printing
                System.out.print("*");
            }
            System.out.println();
        }

        //declaration; test; update;
        for (int value = 0; value < 10; value++){
            System.out.println(value);
        }
    }
}
