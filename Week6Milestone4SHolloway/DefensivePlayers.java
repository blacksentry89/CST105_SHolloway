/**Program: DraftFinalProject
 * File: DefensivePlayers.java
 * Summary: Set defensive attributes for each player
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/
package DraftFinalProject;
  //begin main method      
public class DefensivePlayers extends NFLPlayer {
    
    //String position;
    int tackles;
    int sacks;
    int Fumbles;
    int interceptions;
    
    public DefensivePlayers(){

    }
    
    public DefensivePlayers(String Team, String position, int tackles, int sacks, int forcedFumbles, int interceptions){
    
    }
    //sets defensive getters and setters    
    public void setDefensePosition(String p) {
        position = p;
    }

    public String getDefensePosition() {
        return position;
    }

    public void setTackles(int t) {
        tackles = t;
    }

    public int getTackles() {
        return tackles;
    }

    public void setSacks(int s) {
        sacks = s;
    }

    public int getSacks() {
        return sacks;
    }

    public void setForcedFumbles(int f) {
        Fumbles = f;
    }

    public int getForcedFumbles() {
        return Fumbles;
    }
 
    public void setInterceptions(int i) {
        interceptions = i;
    }

    public int getInterceptions() {
        return interceptions;
    }
    
    @Override
        public String toString() {

        //converts height into feet/inches
        int feet = height / 12;
        int inches = height % 12;

       //sets information
        return "Name:  " + firstName + " " + lastName
                + "\nTeam:  " + getTeam()
                + "\nPosition:  " + position
                + "\nCollege:  " + college
                + "\n40 Yard Dash Time:  " + dash40
                + "\nAge:  " + age
                + "\nHeight:  " + feet + " foot " + inches + " inches"
                + "\nWeight:  " + weight
                + "\nBMI:  " + BMI
                + "\nYears College Experiennce:  " + experience
                + "\nTackles This Year:  " + tackles
                + "\nSacks This Year:  " + sacks
                + "\nForced Fumbles This Year:  " + Fumbles
                + "\nInterceptions This Year:  " + interceptions;
    }
//end main method
        }


