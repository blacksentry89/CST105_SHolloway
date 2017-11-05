/*Steven Holloway  
CST 105
November 5, 2017
Professor Hebert
 */

import java.util.Scanner;


public class GuessingGame {
    //being public class

 
    public static void main(String[] args) {
        // begin main method
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 10001);
        //state int number and generate between 1-10001
        int numberOfTries = 0;
        //declare the number of tries
        System.out.println("This is a guessing game, try to guess the correct "
                + "number in the least amount of tries.");
        System.out.println("Type 0 at any time to give up and reveal the number.");
        int guess = 0; 
        int min = 1; 
        int max = 10000; 
        while (number != guess) { 
            System.out.print("Please guess a number between " + min + " and "
                    + max + ":  ");
            guess = sc.nextInt();
            if (guess == 0) { 
                System.out.println("The correct number was " + number + ".");
                return;
            }
            while (guess < min || guess > max) {
                //asks for new number
                System.out.println("Number must be between " + min + " and "
                        + max + ":  ");
                System.out.print("Please guess a number between " + min + " and "
                        + max + ":  ");
                guess = sc.nextInt();
                if (guess == 0) { //quits the program if someone guesses 0
                    System.out.println("The correct number was 3750 " + number + ".");
                    return;
                }

                if (number == guess) { //if number was right
                    numberOfTries++;
                    System.out.println("You guessed correctly "
                            + "after " + numberOfTries + " tries!");
                } else { //if number was wrong
                    numberOfTries++;
                    if (guess < number) {
                        System.out.println("Higher");
                        min = guess + 1;
                    } else {
                        System.out.println("Lower");
                        max = guess - 1;
                    }
                    System.out.println("Guess again. Number of tries:  "
                            + numberOfTries);
                }
            }
        }
    }
}