package q1ex2;

import java.util.Scanner;

public class Q1Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameRun = true;
        int defaultGuessesNum = 5;
        int defaultLowerLimit = 1;
        int defaultUpperLimit = 10;
                
        while(gameRun) {
            String playerMainMenuOption;
            
            System.out.println("\n\n--------------\n\nWelcome to Higher or Lower! What will you do?");
            System.out.println("- Play");
            System.out.println("- Settings");
            System.out.println("- Close");
            
            playerMainMenuOption = input.nextLine();
            
            if(playerMainMenuOption.equalsIgnoreCase("Play")) {
                boolean isGamePlaying = true;
                
                while(isGamePlaying) {
                    int randomNum = (int) Math.floor(Math.random()*defaultUpperLimit) + defaultLowerLimit;
                    boolean isGuessed = false;
                    boolean isLost = false;
                    int guessesLeft = defaultGuessesNum;

                    while(!isGuessed && !isLost) {
                        System.out.printf("\n> Enter a number between %d to %d: ", defaultLowerLimit, defaultUpperLimit);
                        
                        String guessString = input.nextLine();
                        int guess;

                        // Baeldung's checker if a string is numeric for int parsing
                        // https://www.baeldung.com/java-check-string-number
                        try {
                            guess = Integer.parseInt(guessString);
                        } catch(NumberFormatException nfe) {
                            System.out.println("\nPlease enter a valid integer.");
                            continue;
                        }
                        
                        if(guess < defaultLowerLimit || guess > defaultUpperLimit) {
                            System.out.printf("\nPlease enter a number between %d and %d.\n", defaultLowerLimit, defaultUpperLimit);
                            continue;
                        }
                        
                        guessesLeft--;

                        if(guess == randomNum) {
                            System.out.println("\nYOU WON!\n");
                            isGuessed = true;
                        }

                        else if(guessesLeft <= 0) {
                            System.out.println("\nYou lost.\n");
                            isLost = true;
                        }

                        else if(guess < randomNum) {
                            System.out.printf("\nHIGHER! %d guess(es) left.\n", guessesLeft);
                        }

                        else if(guess > randomNum) {
                            System.out.printf("\nLOWER! %d guess(es) left.\n", guessesLeft);
                        }
                    }
                    
                    boolean keepPlayingQuestion = true;
                    
                    while(keepPlayingQuestion) {
                        System.out.println("Do you want to keep playing? (y/n)");

                        String keepPlayingAnswer = input.nextLine();

                        switch(keepPlayingAnswer) {
                            case "n":
                                isGamePlaying = false;
                            case "y":
                                keepPlayingQuestion = false;
                                break;
                            default:
                                System.out.println("Please enter a valid input (y/n).");
                        }
                    }
                }
            }
            else if(playerMainMenuOption.equalsIgnoreCase("Settings")) {
                boolean isChangingSettings = true;
                
                while(isChangingSettings) {
                    int temp1, temp2, temp3;
                    
                    try {
                        System.out.print("\n- LOWER limit of the random number? (default: 1): ");
                        temp1 = Integer.parseInt(input.nextLine());

                        System.out.print("\n- UPPER limit of the random number? (default: 10): ");
                        temp2 = Integer.parseInt(input.nextLine());
                        
                        if(temp1 >= temp2) {
                            System.out.println("Your lower limit is equal to/higher than the upper limit. Please try again.");
                            continue;
                        }
                        
                        if(temp1 < 0 || temp2 < 0) {
                            System.out.println("Your lower/upper limit is negative. Please try again.");
                            continue;
                        }

                        System.out.print("\n- Number of GUESSES allowed? (default: 5): ");
                        temp3 = Integer.parseInt(input.nextLine());
                        
                        if(temp3 <= 0) {
                            System.out.println("Your number of guesses allowed is less than 0. Please try again.");
                            continue;
                        }
                        
                        defaultLowerLimit = temp1;
                        defaultUpperLimit = temp2;
                        defaultGuessesNum = temp3;
                        isChangingSettings = false;
                    } catch(NumberFormatException nfe) {
                        System.out.println("You entered an invalid input. Please try again.");
                    }
                }
            }
            else if(playerMainMenuOption.equalsIgnoreCase("Close")) {
                System.out.println("\n\n\nThanks for playing!");
                
                gameRun = false;
            }
            else {
                System.out.println("\nPlease enter a valid input.\n\n");
            }
        }
    }
    
}
