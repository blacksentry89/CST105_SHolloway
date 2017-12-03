package nfldraftfx;

/**Program: DraftFinalProject
 * File: DefensivePlayers.java
 * Summary: Set defensive attributes for each player
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/

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
                + "   Team:  " + getTeam()
                + "   Position:  " + position
                + "   College:  " + college
                + "   40 Yard Dash Time:  " + dash40
                + "   Age:  " + age
                + "   Height:  " + feet + " foot " + inches + " inches"
                + "   Weight:  " + weight
                + "   BMI:  " + BMI
                + "\nYears College Experience:  " + experience
                + "   Tackles This Year:  " + tackles
                + "   Sacks This Year:  " + sacks
                + "   Forced Fumbles This Year:  " + Fumbles
                + "   Interceptions This Year:  " + interceptions;
    }
//end main method
        }


