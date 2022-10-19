package com.mycompany.basicprogrammingconcepts;

/**
*
* @author leahjoneskirwin
*/
import java.util.Scanner;
import java.util.Random;



public class DogGenetics {



   public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random rGen = new Random();



       String dogName;
        int startPercent = 100;
        int breedPercent = 0;



       System.out.println("What is your dogs name?");
        dogName = inputReader.nextLine();



       String[] breeds = {"Maltese", "Sausage dog", "Labrador", "Poodle", "Chihuahua"};



       System.out.println("Your dog " + dogName + " is a mix of: ");



       for (int i = 0; i < 5; i++) {
            String breed = "";
            breed = breeds[i];
            if (i != 4) {
                breedPercent = rGen.nextInt(startPercent);
                startPercent -= breedPercent;
            } else {
                breedPercent = startPercent;



           }
            System.out.println(breed + ":" + breedPercent + "%");



       }
        System.out.println("WOW, that is QUITE the dog!!");
    }



}
