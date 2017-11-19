/*Steven Holloway  
CST 105
November 19, 2017
Professor Hebert
 */
package DraftFinalProject;

/**
 *
 * @author Steven H
 */



import java.util.ArrayList;

public class Manager {


    ArrayList<NFLPlayer> availablePlayers = new ArrayList<>();


    public void createPlayers(int x) {
        for (int cnt = 0; cnt < x; cnt++) {

           
            NFLPlayer player = new NFLPlayer();

          
            String[] randomFirstNames = new String[]{"Tommy", "Lucas", "Tommen", "Jamie", "Bran", "Baron", "Donald",
                "Josh", "Ernie", "Rudolph","Timothy","Edward","Rocky"};
            String randomFirstName = randomFirstNames[(int) Math.floor(Math.random() * randomFirstNames.length)];
            player.setFirstName(randomFirstName);

    
            String[] randomLastNames = new String[]{"Johnson", "Lionheart", "Stark", "Mason", "Buck", "Newton", "Rickard",
            "Brown", "Banzin", "Rory", "McCafree", "Tall", "Grim", "Maivia"};
            String randomLastName = randomLastNames[(int) Math.floor(Math.random() * randomLastNames.length)];
            player.setLastName(randomLastName);

  
            String[] randomPositions = new String[]{"Offensive Guard", "Offensive Tackle", "Centerback", "Quarterback", "Running Back",
            "Wide Receiver", "Tight End", "Defensive End", "Defensive Tackler", "Line Backer", "Cornerback", "Kicker", " Safety Kicker"};
            String position = randomPositions[(int) Math.floor(Math.random() * randomPositions.length)];
            player.setPosition(position);

           
            int randomHeight = (int) ((Math.random() * 15) + 70);
            player.setHeight(randomHeight);

     
            int randomWeight = (int) ((Math.random() * 200) + 100);
            player.setWeight(randomWeight);

      
            int randomAge = (int) (Math.random() * 3) + 20;
            player.setAge(randomAge);

        
            double randomDash40 = (((Math.random() * 8) + 2));
            double roundDash40 = Math.round(randomDash40 * 100.0) / 100.0;
            player.setDash40(roundDash40);

      
            String[] randomColleges = new String[]{"Oregon", "Washington State", "Washington University", "Arizona", "Grand Canyon University",
            "No College", "Michigan", "Ohio University", "Duke", "Penn State", "Florida State", "UCONN", "University of Hawaii"};
           
            String randomCollege = randomColleges[(int) Math.floor(Math.random() * randomColleges.length)];
            player.setCollege(randomCollege);

            player.setExperience(randomAge);

 
            player.setBMI(randomWeight, randomHeight);

 
            availablePlayers.add(player);

        }
    }


    public void printAllPlayers() {
    
        NFLPlayer playerX;
        for (NFLPlayer availablePlayer : availablePlayers) {
            playerX = availablePlayer;
            System.out.println(playerX);
            System.out.println("----------------------------------");
        }
    }

   
    public void printSpecificPlayer(int x) {
        NFLPlayer playerX = availablePlayers.get(x);
        System.out.println(playerX);
        System.out.println("----------------------------------");

    }

}