package com.mycompany.basicprogrammingconcepts;

/**
*
* @author leahjoneskirwin
*/
public class SummativeSums {



   /**
     * @param args the command line arguments
     */
public static void main(String[] args) {      
int my_array[] = {1, 90, -33, -55, 67, -16, 28, -55, 15};
int sum = 0;
int my_array1[] = {999, -60, -77, 14, 160, 301};
int sum1 = 0;
int my_array2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
140, 150, 160, 170, 180, 190, 200, -99};
int sum2 = 0;



for (int i : my_array)
    sum += i;
System.out.println("#1 Array sum is " + sum);



for (int i : my_array1)
    sum1 += i;
System.out.println("#2 Array sum is " + sum1);



for (int i : my_array2)
    sum2 += i;
System.out.println("#3 Array sum is " + sum2);




}
}
