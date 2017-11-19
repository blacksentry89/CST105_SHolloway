/**Steven Holloway  
 * CST-105
 * November 19, 2017
 * Professor Hebert
 **/

package DraftFinalProject;

/**
 *
 * @author Steven H
 */
public class DraftFinalProject {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        
        playerDriver();
        playerDriver();

    }

    /**
     *
     */
    public static void playerDriver() {

       
        NFLPlayer player4 = new NFLPlayer();

      
        Manager fName2 = new Manager();
        String randomFirstName2 = fName2.randomFirstNames();
        player4.setFirstName(randomFirstName2);

        
        Manager lName4 = new Manager();
        String randomLastName4 = lName4.randomLastNames();
        player4.setLastName(randomLastName4);

        
        Manager height3 = new Manager();
        int randomHeight3 = height3.randomHeights();
        player4.setHeight(randomHeight3);

        
        Manager weight1 = new Manager();
        int randomWeight1 = weight1.randomWeights();
        player4.setWeight(randomWeight1);

       
        Manager position6 = new Manager();
        String randomPosition6 = position6.randomPositions();
        player4.setPosition(randomPosition6);

        
        Manager dash40_1 = new Manager();
        double randomDash40_1 = dash40_1.randomDash40();
        player4.setDash40(randomDash40_1);


        Manager age10 = new Manager();
        int randomAge10 = age10.randomAges();
        player4.setAge(randomAge10);

  
        Manager college2 = new Manager();
        String randomCollege2 = college2.randomColleges();
        player4.setCollege(randomCollege2);
        

       
        player4.setExperience(randomAge10);

        
        player4.setBMI(randomWeight1, randomHeight3);

	//print out
        System.out.println(player4.toString());

        System.out.println();

    }

}