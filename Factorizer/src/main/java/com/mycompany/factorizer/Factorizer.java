package com.mycompany.factorizer;
/**
 *
 * @author leahjoneskirwin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 

public class Factorizer {
/**
 * Java Program - Print Factors of Number
 */
    public void factors(){
        
    Scanner input = new Scanner( System.in );
    int n;

    System.out.println( "What number would you like to factor?");
    n = input.nextInt();
      
        //Storing factors into list
        List<Integer> factors = new ArrayList<>();
         
        for(int i = 1; i <= n/i; ++i) {
            if(n % i == 0) {
                // - if i is a factor, num/i is also a factor
                factors.add(i);
                factors.add(n/i);
            }
        }
         
        //Sorting factors
        Collections.sort(factors);                
         
        //print the factors
        System.out.println("The factors of " + n + " are: "); 
        factors.forEach(factor -> System.out.println(factor+" "));
        System.out.println(n + " " + "has" + " " + factors.size() + " " + "factors.");
               
        
        // Call isPerfect function to check if number is perfect or not. 
        if (isPerfect(n)) 
            System.out.println(n + " is a perfect number"); 
        else
            System.out.println( 
                n + " is not a perfect number");
        
    //Prime number?    
    boolean flag = false;
    for (int i = 2; i <= n / 2; ++i) {
      
      if (n % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
    }      
        

    // Returns true if n is perfect 
    static boolean isPerfect(int n) 
    { 
        // 1 is not a perfect number 
        if (n == 1) 
            return false; 
  
        // Sum stores sum of proper divisors initialised sum with 1 (as 1 is a proper divisor for all numbers)
        int sum = 1; 
  
        // Looping through the numbers to check if they are 
        // divisors or not 
        for (int i = 2; i < n; i++) { 
            
            if (n % i == 0) { 
                sum += i; 
            } 
            
        } 
  
        // If sum of divisors is equal to n, it is a perfect number 
        if (sum == n) 
            return true; 
  
        return false; 
    } 
    
} 