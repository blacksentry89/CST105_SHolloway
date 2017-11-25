/*Steven Holloway  
CST 105
November 19, 2017
Professor Hebert
 */
package DraftFinalProject;

public class NFLPlayer {

    
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

   
    public void setFirstName(String n2) {
        firstName = n2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String n2) {
        lastName = n2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPosition(String p) {
        position = p;
    }

    public String getPosition() {
        return position;
    }

    public void setDash40(double d) {
        dash40 = d;
    }

    public double getDash40() {
        return dash40;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

  
    public void setBMI(int weight, int height) {
        BMI = (weight * .65) / ((height * .055) * 2);
        BMI = Math.round(BMI * 100.0) / 100.0;
    }

    public double getBMI() {
        return BMI;
    }

    
    public void setExperience(int age) {
        experience = age - 20;
    }

    public int getExperience() {
        return experience;
    }

    public void setCollege(String c) {
        college = c;
    }

    public String getCollege() {
        return college;
    }
        
    @Override
    public String toString() {
        
        
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
                        
    }
}