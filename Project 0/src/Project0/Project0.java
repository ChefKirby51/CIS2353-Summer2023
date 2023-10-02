package Project0;

import java.util.Scanner;
public class Project0 {
    public static void main(String[] args) {
        double length, width;
        double fenceParam;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("You are creating a new fence for your farm, but we need some information in order to" +
                "build it. What is the Length and Width of your fence?: ");
        length = Double.parseDouble(keyboard.nextLine());
        width = Double.parseDouble(keyboard.nextLine());
        fenceParam = ((length * 2) + (width * 2)); // This will be used to determine post spacing

        double postSpace;
        System.out.println("Now that we have our length and width of our fence, we need posts." +
                " How far apart do we want each post to be?: ");
        postSpace = Double.parseDouble(keyboard.nextLine());
        if(fenceParam % postSpace != 0){
            System.out.println("The spacing of the posts is not evenly divisible. Try a different length, width " +
                    "and/or post spacing.");
        }
        double postsReq = fenceParam / postSpace; //This will show the amount of posts required for the fence.

        double boardSize;
        System.out.println("Now that we have the posts, we need boards to fill in those gaps." +
                "How long are the boards going to be?");

        boardSize = Double.parseDouble(keyboard.nextLine());
        if (boardSize < postSpace){
            System.out.println("Those boards are too small, they won't be able to connect. Try a larger size.");
        }

        double oneBoard = fenceParam / boardSize;
        System.out.println("If we were to build the fence with a single board across each post," +
                "we would need " + oneBoard + " many boards for the fence.");
        System.out.println();

        double boardReq; // How many boards do you want?
        System.out.println("Given that information, how many boards do you want to run across each post?: ");
        boardReq = Double.parseDouble(keyboard.nextLine());

        double postCost, boardCost;
        System.out.println("How much does each posts cost?: ");
        postCost = Double.parseDouble(keyboard.nextLine());
        postCost *= postCost;
        System.out.println("How much does each board cost?: ");
        boardCost = Double.parseDouble(keyboard.nextLine());
        boardCost *= boardReq;
        double costTotal = postCost + boardCost;

        System.out.println("With all that info, The total amount of posts needed is " + postsReq);
        System.out.println("The total amount of boards needed is " + boardReq);
        System.out.println("The cost of all the posts is $" + postCost + "." +
                " And the cost for all the boards is $" + boardCost + " coming out with a total of $" + costTotal);


    }
}
