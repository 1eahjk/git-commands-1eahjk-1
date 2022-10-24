package InterestCalculator;
/**
 *
 * @author leahjoneskirwin
 */
import java.util.Scanner;
        
public class InterestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        double Investment;
        double InterestRate;
        double AnnualInvestment;
        double TotalInvestment;
        
        int yearsInvest;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Interest Calculator!");
        System.out.println("How much would you like to invest?");
        Investment = myScanner.nextDouble();
        System.out.println("What is the annual interest rate (%)?");
        InterestRate = myScanner.nextDouble();
        System.out.println("How many years would you like to invest for?");
        yearsInvest = myScanner.nextInt();
        
            for (int i = 0; i < yearsInvest; i++){
                
                AnnualInvestment = ((Investment/100)*InterestRate);
                TotalInvestment = Investment + AnnualInvestment;
                System.out.println("Year" + (i+1) + ":");
                System.out.println("Began with $" + Investment);
                System.out.println("Earned $" + AnnualInvestment);                
                System.out.println("Ended with $" + TotalInvestment);
                System.out.println();

                Investment = TotalInvestment;
                
            }
        }
    }