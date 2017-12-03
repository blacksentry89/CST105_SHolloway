package nfldraftfx;

/**Program: DraftFinalProject
 * File: NFLPlayer.java
 * Summary: Sets attributes and randomly generates players
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/


public abstract class NFLPlayer {
//sets information
    String team;
    String firstName;
    String lastName;
    String college;
    String position;
    double dash40;
    int height;
    int weight;
    int age;
    double BMI;
    int experience;
  

   
    public NFLPlayer() {
    }

    
    public NFLPlayer(String firstName, String lastName, String position, String college, double dash40,
            int age, int height, int weight, double BMI, int experience) {

    }

   //insert information about player here
    public void setFirstName(String n2) {
        this.firstName = n2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String n2) {
        this.lastName = n2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPosition(String p) {
        this.position = p;
    }

    public String getPosition() {
        return position;
    }

    public void setDash40(double d) {
        this.dash40 = d;
    }

    public double getDash40() {
        return dash40;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int w) {
        this.weight = w;
    }

    public int getWeight() {
        return weight;
    }

  
    public void setBMI(int weight, int height) {
        this.BMI = (weight * .65) / ((height * .055) * 2);
        this.BMI = Math.round(BMI * 100.0) / 100.0;
    }

    public double getBMI() {
        return BMI;
    }

    
    public void setExperience(int age) {
        this.experience = age - 20;
    }

    public int getExperience() {
        return experience;
    }

    public void setCollege(String c) {
        this.college = c;
    }

    public String getCollege() {
        return college;
    }
    public void setTeam(String t) {
this.team = t;
}
public String getTeam() {
 return team;
}

        
    @Override
    public String toString() {
        
      //insert height
        int feet = height / 12;
        int inches = height % 12;
        
        return "Name:  " + firstName + " " + lastName
                        + "\nPosition:  " + position
                        + "\nCollege:  " + college
                        + "\n40 Yard dash time:  " + dash40
                        + "\nAge:  " + age
                        + "\nHeight:  " + feet + " foot " + inches + " inches"
                        + "\nWeight:  " + weight
                        + "\nBMI:  " + BMI
                        + "\nYears College Experiennce:  " + experience;
      //end method                  
    }
}