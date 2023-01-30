package Players;
// **********************************************************
// Player.java -- Resource Class
//
// Defines a Player class that holds information about an athlete.
//
// **********************************************************

import java.util.Scanner;

public class Player
{
   private String name;
   private String team;
   private int jerseyNumber;


//-----------------------------------------------------------
 // default constructor
 // instance data Strings are set to null
 // instance data ints are set to 0
  //-----------------------------------------------------------
   public Player()
   {
      name = null;
      team = null;
      jerseyNumber = 0;
   }

 //-----------------------------------------------------------
 // Prompts for and reads in the player's name, team, and 
 // jersey number.
 //-----------------------------------------------------------
   public void readPlayer()
   {
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Name: ");
      name = keyboard.nextLine();
      System.out.print("Team: ");
      team = keyboard.nextLine();
      System.out.print("Jersey number: ");
      jerseyNumber = keyboard.nextInt();
   }

   @Override
   public boolean equals(Object obj){
        String p = obj.toString();
        String q = this.toString();
        return(q == p);
   }
   


}
