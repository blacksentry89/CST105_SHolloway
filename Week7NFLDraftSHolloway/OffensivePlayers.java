package nfldraftfx;

/**Program: DraftFinalProject
 * File: OffensivePlayers.java
 * Summary: Set offensive attributes for each player
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/


public class OffensivePlayers extends NFLPlayer {

    //String position;
    int interceptions;
    int passingYards;
    double QBRating;
    int receivingYards;
    int fumbles;
    int rushYards;
    int touchdowns;

    public OffensivePlayers() {

    }

    public OffensivePlayers(String position, int interceptions, int passingYards, double QBRating,
            int receivingYards, int fumbles, int rushYards) {
    }

    //all methods and variables set here
    public void setOffensePosition(String p) {
        position = p;
    }

    public String getOffensePosition() {
        return position;
    }

    public void setInterceptions(int i) {
        interceptions = i;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setPassingYards(int p) {
        passingYards = p;
    }

    public int getPassingYards() {
        return passingYards;
    }

    public void setQBRating(double q) {
        QBRating = q;
    }

    public double getQBRating() {
        return QBRating;
    }

    public void setReceivingYards(int r) {
        receivingYards = r;
    }

    public int getReceivingYards() {
        return receivingYards;
    }

    public void setFumbles(int f) {
        fumbles = f;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setRushingYards(int r) {
        rushYards = r;
    }

    public int getRushingYards() {
        return rushYards;
    }

    public void setTouchdowns(int t) {
        touchdowns = t;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    @Override
    public String toString() {

        int feet = height / 10;
        int inches = height % 10;
//generates position and stats information here
        if ("Quarterback".equals(position)) {
            return "Name:  " + firstName + " " + lastName
                    + "   Team:  " + team
                    + "   Position:  " + position
                    + "   College:  " + college
                    + "   40 Yard dash time:  " + dash40
                    + "   Age:  " + age
                    + "   Height:  " + feet + " foot " + inches + " inches"
                    + "   Weight:  " + weight
                    + "   BMI:  " + BMI
                    + "\nYears College Experience:  " + experience
                    + "   Interceptions this year:  " + interceptions
                    + "   Passing Yards this year:  " + passingYards
                    + "   Rushing Yards this year:  " + rushYards
                    + "   Touchdowns this year:  " + touchdowns
                    + "   Quarterback Rating this year:  " + QBRating
                    + "   Fumbles this year:  " + fumbles;
        } else if ("Running Back".equals(position) || "Wide Receiver".equals(position)
                || "Tight End".equals(position)) {
            return "Name:  " + firstName + " " + lastName
                    + "   Team:  " + team
                    + "   Position:  " + position
                    + "   College:  " + college
                    + "   40 Yard dash time:  " + dash40
                    + "   Age:  " + age
                    + "   Height:  " + feet + " foot " + inches + " inches"
                    + "   Weight:  " + weight
                    + "   BMI:  " + BMI
                    + "\nYears College Experience:  " + experience
                    + "   Rushing Yards this year:  " + rushYards
                    + "   Receiving Yards this year:  " + receivingYards
                    + "   Touchdowns this year:  " + touchdowns
                    + "   Fumbles this year:  " + fumbles;
        } else if ("Center".equals(position) || "Offensive Guard".equals(position)
                || "Offensive Tackle".equals(position)) {
            return "Name:  " + firstName + " " + lastName
                    + "   Team:  " + team
                    + "   Position:  " + position
                    + "   College:  " + college
                    + "   40 Yard dash time:  " + dash40
                    + "   Age:  " + age
                    + "   Height:  " + feet + " foot " + inches + " inches"
                    + "   Weight:  " + weight
                    + "   BMI:  " + BMI
                    + "   Years College Experience:  " + experience;
        }
        return "";
    }
//end method
}