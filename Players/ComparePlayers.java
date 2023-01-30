package Players;

// **********************************************************
// ComparePlayers
//
// Reads in two Player objects and tells whether they represent
// the same player.
//
// Name:
//
// Date:
//
// **********************************************************

public class ComparePlayers{
   public static void main(String[] args)
   {
      Player player1 = new Player();
      Player player2 = new Player();
   
   //Prompt for and read in information for player 1 - using the method from the Player class
    System.out.println("please enter player 1 information:");
      player1.readPlayer();
   
   //Prompt for and read in information for player 2 - using the method from the Player class
    //System.out.println("please enter player 2 information:");
      //player2.readPlayer();

   //Compare player1 to player 2 and print a message saying


    System.out.print(player1.toString());
   
   }

}
	    
