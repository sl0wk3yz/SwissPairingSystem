package swisspairings;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lwazinkoe@gmail.com
 */
public class SwissPairings {

    /**
     * @param args the command line arguments
     */

   public static void main(String[] args) {
        // Creating an ArrayList to store players
        ArrayList<Player> players = new ArrayList<>();

        // Adding players to the ArrayList
        int isTrue;
        do{
            isTrue = JOptionPane.showConfirmDialog(null, "would you like to add a player?");
            if(isTrue==JOptionPane.YES_OPTION){
                String playerName = JOptionPane.showInputDialog("Enter player name");
            int playerRating = Integer.parseInt(JOptionPane.showInputDialog("Enter player elo"));
            players.add(new Player(playerName, playerRating));
       
            }
        }while(isTrue == JOptionPane.YES_OPTION);

        // Accessing player information
        for (int i = 0; i < players.size(); i++) {
        Player player = players.get(i);
        System.out.println("Name: " + player.getName() + "\t Rating: " + player.getRating());
}

    }
}


    
    

