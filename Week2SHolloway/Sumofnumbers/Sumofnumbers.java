///* Program Exercise: Sum of Numbers
/* File: Sumofnumbers.java
*Author: Steven Holloway
*Date: October 29, 2017
/**
 *
 * @author Steven H
 */
import java.util.Scanner;
    //import scanner class from java.util package

public class Sumofnumbers {
    //Begin public class
    
    public static void main(String[] args) {
        // Begin main method
        Scanner sc = new Scanner(System.in);
        
        System.out.println("This program will output the sum of a 5 digit "
                + "positive integer.");
        System.out.print("Please enter a 5 digit positive integer now:  ");
        
        //declare variable number, and prompt user for number
        int number;
        number = sc.nextInt();
        
        /**Create a loop only using / and % for assignment
        **/
        
        int sum = 0; 
        //declare sum variable, starting at 0
        int remainingNumber = number; 
        //declare remainingNumber so number can be output at a later date
        while (remainingNumber > 0) {
            int lastDigit = remainingNumber %  10;
            sum = sum + lastDigit;
            remainingNumber = remainingNumber / 10;
        }
        System.out.println("Sum of the digits of " + number + " is " + sum);

    }

    
}
