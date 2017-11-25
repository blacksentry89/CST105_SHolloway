/**Program:PalindromicPrimeNumber
 * File: PalindromicPrimeNumber.java
 * Summary: Run Palindromic Prime numbers between 1 and 100,000
 * Author: Steven Holloway
 * Date: November 25,2017
 **/

import java.util.ArrayList;
//begin main class PalindromicPrimeNumber
public class PalindromicPrimeNumber {

    static int i = 1;
    static String string;
    public static void main(String[] args) {
        ArrayList<String> primePalindromic = new ArrayList<>();

        for (i = 1; i <= 100000; i++) {
            if (isPrime(i) == true && isPalindrome(i) == true) {
                string = Integer.toString(i);
                primePalindromic.add(string);
            }
        }
        //print prime numbers between 1 and 100,000
        System.out.println("Palindromic Primes between 1 and 100,000");
        System.out.println("----------------------------------------");

        int count = 0;
        for (i = 0; i < primePalindromic.size() - 1; i++) {
            System.out.printf("%7s", primePalindromic.get(i));
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
    public static boolean isPrime(int integer) {
     //<2 return as false 
        if (integer < 2) {
            return false;
        }
       // ==2 return as true
        if (integer == 2) {
            return true;
        }
        //%2 == 0 return as false
        if (integer % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= integer; i += 2) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int integer) {
//string length 1-5
        String toString = Integer.toString(integer);
        if (toString.length() == 1) {
            return true;
        }
        if (toString.length() == 2) {
            return toString.charAt(0) == toString.charAt(1);
        }
        if (toString.length() == 3) {
            return toString.charAt(0) == toString.charAt(2);
        }
        if (toString.length() == 4) {
            if (toString.charAt(0) == toString.charAt(3) && toString.charAt(1) == toString.charAt(2)) {
                return true;
            }
        }
        if (toString.length() == 5) {
            if (toString.charAt(0) == toString.charAt(4) && toString.charAt(1) == toString.charAt(3)) {
                return true;
            }
        }
        return false;
    }
    //end main method
}