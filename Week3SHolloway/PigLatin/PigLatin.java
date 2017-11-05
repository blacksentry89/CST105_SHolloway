/*Steven Holloway
*CST 105
November 5, 2017
Professor Hebert
 */

import java.io.FileReader; 
import java.io.BufferedReader;

public class PigLatin {
//Main class initiated

    public static void main(String[] args) throws Exception {
        //begin main method

        FileReader file = new FileReader("PigLatin.txt");
        //Ensure PigLatin.txt and PigLatin.java in same folder
        BufferedReader reader = new BufferedReader(file);
       
        String[] words;
        String input = reader.readLine();
        words = input.split(" "); 
        String upperWord;
        String lowerWord;

        System.out.printf("%-20s%-20s\n", "Original", "PIG LATIN");
        System.out.println();
        //Prints collumns to designate PigLatin words
        //Prints blank line so it will be easier to read

        for (String word : words) {
            lowerWord = word.toLowerCase(); 
            upperWord = word.toUpperCase(); 
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                System.out.printf("%-20s%-20s\n", word, upperWord + "WAY ");
            
            } else if (lowerWord.startsWith("bl") || lowerWord.startsWith("br") || lowerWord.startsWith("ch") || lowerWord.startsWith("cl")
                    || lowerWord.startsWith("cr") || lowerWord.startsWith("dr") || lowerWord.startsWith("fl") || lowerWord.startsWith("fr")
                    || lowerWord.startsWith("gl") || lowerWord.startsWith("gr") || lowerWord.startsWith("ph") || lowerWord.startsWith("pl")
                    || lowerWord.startsWith("pr") || lowerWord.startsWith("qu") || lowerWord.startsWith("sc") || lowerWord.startsWith("sh")
                    || lowerWord.startsWith("sk") || lowerWord.startsWith("sl") || lowerWord.startsWith("sm") || lowerWord.startsWith("sn")
                    || lowerWord.startsWith("sp") || lowerWord.startsWith("st") || lowerWord.startsWith("sw") || lowerWord.startsWith("th")
                    || lowerWord.startsWith("tr") || lowerWord.startsWith("tw") || lowerWord.startsWith("wh") || lowerWord.startsWith("wr")
                    || lowerWord.startsWith("sch") || lowerWord.startsWith("scr") || lowerWord.startsWith("spl") || lowerWord.startsWith("squ")
                    || lowerWord.startsWith("str") || lowerWord.startsWith("thr")) {
                //ensures common english and PigLatin combine
                System.out.printf("%-20s%-20s\n", word, upperWord.substring(2) + upperWord.substring(0, 2) + "AY ");
               
            } else {
             
                System.out.printf("%-20s%-20s\n", word, upperWord.substring(1) + upperWord.substring(0, 2) + "AY ");
            //end program exercise
            }
        }
    }

}