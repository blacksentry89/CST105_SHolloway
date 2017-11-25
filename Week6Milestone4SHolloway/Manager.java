/**Program: DraftFinalProject
 * File: Manager.java
 * Summary: Insert random names here and generate players
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/
package DraftFinalProject;

//randomly generate
import java.util.ArrayList;
import java.util.Random;

public class Manager {

    ArrayList<NFLPlayer> availablePlayers = new ArrayList<>();
    Random random = new Random();
    int offenseOrDefense = random.nextInt(2);

    public void createPlayers(int howMany) {
        for (int cnt = 0; cnt < howMany; cnt++) {

            DefensivePlayers defense = new DefensivePlayers();
            OffensivePlayers offense = new OffensivePlayers();

            if (offenseOrDefense == 0) {
                defense.setTeam("Defense");
            } else {
                offense.setTeam("Offense");

            }
//sets random first names 
            String[] randomFirstNames = new String[]{"Tommy", "Lucas", "Tommen", "Jamie", "Bran", "Baron", "Donald",
                "Josh", "Ernie", "Rudolph", "Timothy", "Edward", "Rocky"};
            String randomFirstName = randomFirstNames[(int) Math.floor(Math.random() * randomFirstNames.length)];
            if (offenseOrDefense == 0) {
                defense.setFirstName(randomFirstName);
            }
            offense.setFirstName(randomFirstName);
//sets random last names
            String[] randomLastNames = new String[]{"Johnson", "Lionheart", "Stark", "Mason", "Buck", "Newton", "Rickard",
                "Brown", "Banzin", "Rory", "McCafree", "Tall", "Grim", "Maivia"};
            String randomLastName = randomLastNames[(int) Math.floor(Math.random() * randomLastNames.length)];
      if (offenseOrDefense == 0) {
                defense.setLastName(randomLastName);
            }
            offense.setLastName(randomLastName);
            String[] positions = new String[]{"Offensive Guard", "Offensive Tackle", "Centerback", "Quarterback", "Running Back",
                "Wide Receiver", "Tight End", "Defensive End", "Defensive Tackler", "Line Backer", "Cornerback", "Kicker", " Safety Kicker"};
            String position = positions[(int) Math.floor(Math.random() * positions.length)];
//random height and weight set
            int randomHeight = (int) ((Math.random() * 15) + 70);
      if (offenseOrDefense == 0) {
                defense.setHeight(randomHeight);
            }
            offense.setHeight(randomHeight);
            int randomWeight = (int) ((Math.random() * 200) + 100);
      if (offenseOrDefense == 0) {
                defense.setWeight(randomWeight);
            }
            offense.setWeight(randomWeight);
            int randomAge = (int) (Math.random() * 3) + 20;
      if (offenseOrDefense == 0) {
                defense.setAge(randomAge);
            }
            offense.setAge(randomAge);
            double randomDash40 = (((Math.random() * 8) + 2));
            double roundDash40 = Math.round(randomDash40 * 100.0) / 100.0;
      if (offenseOrDefense == 0) {
                defense.setDash40(roundDash40);
            }
            offense.setDash40(roundDash40);
            String[] colleges = new String[]{"Oregon", "Washington State", "Washington University", "Arizona", "Grand Canyon University",
                "No College", "Michigan", "Ohio University", "Duke", "Penn State", "Florida State", "UCONN", "University of Hawaii"};
            String college = colleges[(int) Math.floor(Math.random() * colleges.length)];
                  if (offenseOrDefense == 0) {
                defense.setCollege(college);
            }
            offense.setCollege(college);
             //college and experience set here
            if (offenseOrDefense == 0) {
                defense.setExperience(randomAge);
            }
            offense.setExperience(randomAge);
         
            if (offenseOrDefense == 0) {
                defense.setBMI(randomWeight, randomHeight);
            }
            offense.setBMI(randomWeight, randomHeight);
          if (offenseOrDefense == 0) {
                //sets random defense position
                String[] randomDefensePositions = new String[]{"Defensive Tackle", "Defensive End", "Line Backer", "Cornerback", "Safety"};
                String defensePosition = randomDefensePositions[(int) Math.floor(Math.random() * randomDefensePositions.length)];
           
                defense.setDefensePosition(defensePosition);

                int randomTackles = (int) (Math.random() * 30) + 15;
                defense.setTackles(randomTackles);

                int randomSacks = (int) (Math.random() * 10) + 2;
                defense.setSacks(randomSacks);

                int randomForcedFumbles = (int) (Math.random() * 15) + 1;
                defense.setForcedFumbles(randomForcedFumbles);

                int randomInterceptions = (int) (Math.random() * 10) + 6;
                defense.setInterceptions(randomInterceptions);
           
                //adds defensive players
                availablePlayers.add(defense);
            }

            //sets all offensive variables
            if (offenseOrDefense == 1) {
                //sets random offense position
                String[] randomOffensePositions = new String[]{"Center", "Offensive Guard", "Offensive Tackle", "Quarterback", "Running Back",
                    "Wide Receiver", "Tight End"};
                String offensePosition = randomOffensePositions[(int) Math.floor(Math.random() * randomOffensePositions.length)];
            
                offense.setOffensePosition(offensePosition);

                //sets quarterback stats
                if ("Quarterback".equals(offensePosition)) {
                    int randomInterceptions = (int) (Math.random() * 15) + 5;
                    offense.setInterceptions(randomInterceptions);

                    int randomPassingYards = (int) (Math.random() * 3000) + 500;
                    offense.setPassingYards(randomPassingYards);

                    double randomQBRating = (Math.random() * 132.6);
                    randomQBRating = Math.round(randomQBRating * 100.0) / 100.0;
                    offense.setQBRating(randomQBRating);
                }

                //sets back end stats
                if ("Running Back".equals(offensePosition) || "Wide Receiver".equals(offensePosition)
                        || "Tight End".equals(offensePosition)) {
                    int randomReceivingYards = (int) (Math.random() * 1500) + 300;
                    offense.setReceivingYards(randomReceivingYards);
                }

                int randomRushingYards = (int) (Math.random() * 1000) + 100;
                offense.setRushingYards(randomRushingYards);

                int randomFumbles = (int) (Math.random() * 5);
                offense.setFumbles(randomFumbles);

                int randomTouchdowns = (int) (Math.random() * 20) + 1;
                offense.setTouchdowns(randomTouchdowns);
            }
            //adds offensive players
            availablePlayers.add(offense);
        }
    }


    public void printAllPlayers() {
        //loop players here
        NFLPlayer playerX;
        for (NFLPlayer availablePlayer : availablePlayers) {
            playerX = availablePlayer;
            System.out.println(playerX);
            System.out.println("----------------------------------");
        }
    }

   
    public void printSpecificPlayer(int whichPlayerIndex) {
        NFLPlayer playerX = availablePlayers.get(whichPlayerIndex);
        System.out.println(playerX);
        System.out.println("----------------------------------");
//end method
    }

}
    

