package q1ex2;

import java.util.Scanner;

public class Q1Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        
        while (isRunning) {
            String playerOption;
            
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("- Start Game");
            System.out.println("- Change Settings");
            System.out.println("- Close");
            
            playerOption = input.nextLine();
            
            if(playerOption.equalsIgnoreCase("Start Game")) {
                int randomNum = (int) Math.floor(Math.random()*10) + 1;
                boolean isGuessed = false;

                System.out.println(randomNum); // remove this line in future

                while(!isGuessed) {
                    int guess = Integer.parseInt(input.nextLine());       

                    if(guess == randomNum) {
                        /* 
                        TO-DO: 
                        - Add an option to play again
                        - Add text indicating higher or lower
                        - Add text indicating win or loss
                        */
                        isGuessed = true;
                    }
                }
            }
            else if(playerOption.equalsIgnoreCase("Change Settings")) {
                /*
                TO-DO:
                - Add settings options
                */
            }
            else if(playerOption.equalsIgnoreCase("Close")) {
                isRunning = false;
            }
            else {
                System.out.println("\nPlease enter a valid input.\n\n");
            }
        }
    }
    
}
