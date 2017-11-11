/*Steven Holloway 
CST 105
November 9, 2017
Professor Hebert

/**
 *
 * @author Steven H
 */
//import classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {
        //begin main method

        char[] array; //creates array 
        char[][] multiArray = new char[20][45]; 
        String output = ""; 

        //method here
        String file = readFile("ArrayExercise.txt"); 
        array = file.toCharArray(); 

        
        for (int i = 0; i < multiArray.length - 2; i++) {
            for (int j = 0; j < multiArray[i].length - 2; j++) {
                multiArray[i][j] = '@';
            }
        }
        
        //loop here
        int count = 0;
        for (int row = 0; row < multiArray.length - 2; row++) {
            for (int column = 0; column < multiArray[row].length - 2; column++) {
                if (count == array.length) {
                    break;
                }
                multiArray[row][column] = array[count];
                count++;

            }
        }

        //loop here
        for (int column = 0; column < multiArray[0].length - 2; column++) {
            for (int row = 0; row < multiArray.length - 2; row++) {
                output = Character.toString(multiArray[row][column]);
                System.out.print(output);
            }
            
        
            System.out.println(output); 
        }

    }

    public static String readFile(String file) {
       
        String text = ""; 
        try { 
            Scanner scanner = new Scanner(new File(file));
            
            while (scanner.hasNext()) {
                text = text + scanner.nextLine() + " ";
                
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found, Sorry about that");
            //file not found and apologize
        }
        return text; //returns text string
    }
}