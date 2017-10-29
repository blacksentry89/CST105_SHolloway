/*Program: Temperature conversion
Asks user for a temp in farenheit then converts to celsius
Author: Steven Holloway 
Date: October 29, 2017
*/

import java.util.Scanner;
//import scanner class from java.util package

public class Farenheittocelsius {
    //Begin public class

    public static void main(String[] args) {
        // Begin main method
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will convert farhenheit "
                + "to celsius, and then convert celsius temperature to "
                + "farhenheit.");
        String again;
        again = "Yes";
        while ((again.toUpperCase().equals("Yes"))) {
            System.out.print("Please enter a temperature in Farhenheit: ");

            //declare variable numbers, and prompt user for farhnheit number
            double farhenheit, celsius;
            farhenheit = sc.nextDouble();

            //convert farhenheit to celsius
            celsius = (farhenheit - 32) * (5.0 / 9);
            celsius = Math.round(celsius * 100.0) / 100.0;
            System.out.println(farhenheit + ("° Farhenheit is " + celsius)
                    + "° Celsius.");

            //prompt user for celsius and convert 
            System.out.print("Please enter a temperature in Celsius: ");
            celsius = sc.nextDouble();
            farhenheit = (celsius * 9.0 / 5) + (32);
            farhenheit = Math.round(farhenheit * 100.0) / 100.0;
            System.out.println(celsius + ("° Celsius is " + farhenheit)
                    + "° Farhenheit.");

            //prompt user to repeat if necessary or wanted
            System.out.print("Do you want to repeat the program? Type Yes or No. ");
            again = sc.next();

            //If any input other than Yes is entered, thank the user and end program
            if ("Yes".equals(again)) {
                System.out.println("Thank you.");
//end method 
            }
        }

    }

}