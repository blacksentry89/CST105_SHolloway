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
//randomly generate

public class Manager {
        

    public String randomFirstNames() {
        String[] randomFirstNames = new String[]{"Tommy", "Lucas", "Tommen", "Jamie", "Bran", "Baron", "Donald",
            "Josh", "Ernie", "Rudolph", "Timothy", "Edward", "Rocky"};
        String randomFirstName = randomFirstNames[(int) Math.floor(Math.random() * randomFirstNames.length)];
        return randomFirstName;
    }

    public String randomLastNames() {
        String[] randomLastNames = new String[]{"Johnson", "Lionheart", "Stark", "Mason", "Buck", "Newton", "Rickard",
            "Brown", "Banzin", "Rory", "McCafree", "Tall", "Grim", "Maivia"};
        String randomLastName = randomLastNames[(int) Math.floor(Math.random() * randomLastNames.length)];
        return randomLastName;
    }

    public String randomPositions() {
        String[] positions = new String[]{"Offensive Guard", "Offensive Tackle", "Centerback", "Quarterback", "Running Back",
            "Wide Receiver", "Tight End", "Defensive End", "Defensive Tackler", "Line Backer", "Cornerback", "Kicker", " Safety Kicker"};
        String position = positions[(int) Math.floor(Math.random() * positions.length)];
        return position;
    }

    public int randomHeights() {
        int randomHeight = (int) ((Math.random() * 15) + 70);
        return randomHeight;
    }

    public int randomWeights() {
        int randomWeight = (int) ((Math.random() * 200) + 100);
        return randomWeight;
    }


    public int randomAges() {
        int randomAge = (int) (Math.random() * 3) + 20;
        return randomAge;
    }

    public double randomDash40() {
        double randomDash40 = (((Math.random() * 8) + 2));
        double roundDash40 = Math.round(randomDash40 * 100.0) / 100.0;
        return roundDash40;
    }

    public String randomColleges() {
        String[] colleges = new String[]{"Oregon", "Washington State", "Washington University", "Arizona", "Grand Canyon University",
            "No College", "Michigan", "Ohio University", "Duke", "Penn State", "Florida State", "UCONN", "University of Hawaii"};
        String college = colleges[(int) Math.floor(Math.random() * colleges.length)];
        return college;
    }

}