/**Steven Holloway  
 * CST-105
 * November 19, 2017
 * Professor Hebert
 **/


package DraftFinalProject;

public class DraftFinalProject {

    public static void main(String[] args) {

        NFLPlayer player = new NFLPlayer();
        
        player.setFirstName("Brett");
        
        player.setLastName("Favre");
        
        player.setPosition("Quarterback");
                   
        player.setAge(26);
        
        player.setWeight(200);
       
        player.setHeight(68);
        
        player.setDash40(4.50);
        
        player.setCollege("Southern Miss");
        
        player.setExperience(player.getAge()); 
                
        player.setBMI(player.getWeight(), player.getHeight());
     
        
        System.out.println(player.toString());
        
    }

}
