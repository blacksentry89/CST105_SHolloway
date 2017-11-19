/**Steven Holloway  
 * CST-105
 * November 19, 2017
 * Professor Hebert
 **/

package DraftFinalProject;

/**
 *
 * @author Steven H
 */

public class DraftFinalProject {

    public static void main(String[] args) {
        
        Manager manager = new Manager();
        manager.createPlayers(10);
        
        manager.printSpecificPlayer(0);
        
        
        manager.printAllPlayers();
        
    }

}