/**Program: DraftFinalProject
 * File: DraftFinalProject.java
 * Summary: Set attributes for each player
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/

package DraftFinalProject;

public class DraftFinalProject {
//enter manager information and create players
    public static void main(String[] args) {
        

        Manager manager = new Manager();
        manager.createPlayers(10);
        
        manager.printAllPlayers();
        
    }

}