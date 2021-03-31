package com.company;
import java.util.*;
import java.text.DecimalFormat;
public class Randomizer {

    public static void main (String[] arg){

        //Used the Random Class
        Random rand = new Random();

        // This will set the max number of float points to three decimal places
        DecimalFormat final_val  =  new DecimalFormat("#.###");

        //Then used a simple for loop to loop it to 30
for(int count = 1; count <= 30; count++) {

            //Set a starting point for the Randomization
        float min = 1;

            // Set a maximum for the Randomization
        float max = 100;

            //The Logic for the Randomizing value.
            //Since the nextFloat Class will get values from 0.0 to 1
            // Hence multiplying the value from the max - min

            float random = min + rand.nextFloat() * (max-min);

            // then using the parseFloat class will format it to the desired value
            float fin = Float.parseFloat(final_val.format(random));

        System.out.println(fin);
    }


    }
}
