package com.mycompany.basicprogrammingconcepts;
/**
*
* @author leahjoneskirwin
*/



import java.util.Random;
import java.util.Scanner;



public class RockPaperScissors {
    
    public  void rpsgame(){
        
        int numPlays;
        String player;
        String computer;
    
        // Counters//   
        int playerW = 0;
        int computerW = 0;
        int ties = 0;
    
        //Scanner + random classes
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
    
        // Array of possible options
        String[] options = {"Rock", "Paper", "Scissors"};
        int randomIndex = rnd.nextInt(options.length);
        computer = options[randomIndex];
    
    
        System.out.println("Welcome to Rock-Paper-Scissors! How many rounds would you like to play?");
    
        numPlays = scanner.nextInt();
    
        if (numPlays < 1 || numPlays > 10) {
            System.out.println("Error!");
        }
    
        int i = 0;
        while (numPlays >= 1 && numPlays <= 10 && i < numPlays) {
    
            System.out.println("Please enter Rock/Paper/Scissors");
            player = scanner.next();
    
            if (player.equals(computer)){
                System.out.println("TIE");
                ties++;
                
            } else if (player.equals("Rock") && computer.equals("Paper")){
                System.out.println("COMPUTER WINS");
                computerW++;
        
            } else if (player.equals("Paper") && computer.equals("Rock")){
                System.out.println("YOU WIN +1 POINT");
                playerW++;        
        
            } else if (player.equals("Rock") && computer.equals("Scissors")){
                System.out.println("YOU WIN +1 POINT");
                playerW++;        

            } else if (player.equals("Scissors") && computer.equals("Paper")){
                System.out.println("YOU WIN +1 POINT");
                playerW++;          
        
            } else if (player.equals("Scissors") && computer.equals("Rock")){
                System.out.println("COMPUTER WINS");
                computerW++;  
        
            } else if (player.equals("Paper") && computer.equals("Scissors")){
                System.out.println("COMPUTER WINS");
                computerW++;   
        
            }    
              
            i++; 
    
        }   
    
        System.out.println("I won" + " " + computerW + " " + "times");
        System.out.println("You won" + " " + playerW + " " + "times");
        System.out.println("Its a draw!" + " " + ties + " " + "times");
    
        Winner(playerW, computerW);
    
        }
    
    
        public static void Winner(int playerW, int computerW){
            if(playerW > computerW){
                System.out.println("WELL DONE! YOU WIN");
            } else if(computerW > playerW){
                System.out.println("OH NO! YOU LOST");
            } else {
                System.out.println("NEITHER OF US WON... PLAY AGAIN? \\\"Yes\\\" or \\\"No\\\"\"");
                Scanner YN = new Scanner(System.in);

            String YN_String = YN.next();   // Need to get this to work.
            if(YN_String.equals("Yes") || YN_String.equals("yes")){
            }
            if(YN_String.equals("No") || YN_String.equals("no")) {
                System.out.println ("Goodbye!");

            }
                          
                
        }
        
    }
    
}
