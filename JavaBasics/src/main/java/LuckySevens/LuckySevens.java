package LuckySevens;
/**
 *
 * @author leahjoneskirwin
 */
import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
   public static void main (String [] args) {

      Scanner reader = new Scanner(System.in);
      Random generator = new Random();

      int die1, die2,       // dice
          dollars,          // input (initial number of dollars)
          countMax,         // count when maximum is achieved
          count,            // number of rolls to reach 'broke'
          maxDollars;       // maximum amount held




      // Input
      System.out.print("How many dollars do you have? ");
      dollars = reader.nextInt();

      // Initialising variables
      maxDollars = dollars;
      countMax = 0;
      count = 0;

      // Loop until the money is gone
      while (dollars > 0){
         count++;

         // Roll dice
         die1 = generator.nextInt (6) + 1; // 1-6
         die2 = generator.nextInt (6) + 1; // 1-6

         // Calculating  winnings / losses
         if (die1 + die2 == 7)
            dollars += 4;
         else
            dollars -= 1;

         // New max for optimum number rolls
         if (dollars > maxDollars){
            maxDollars = dollars;
            countMax = count;
         }
         
      }

      // Results
      System.out.println
         ("You went broke after " + count + " rolls.\n" +
          "You should have quit after " + countMax +
          " rolls when you had $" + maxDollars + ".");
   }
}