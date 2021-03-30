package com.company;

import java.util.Stack;

public class Hexa {
    public void hexNumber(int i){
        //to hold the remainder values we use a stack
        Stack <Integer> hex = new Stack();
        //to check the number of numbers in the stack uncomment line 18
        int flags=0;
        //successive division is done pushing the remainders into hex
        do {
            int mod = i%16;
            hex.push(mod);
            i=i/16;
            flags++;
        }while(i!= 0);
        //System.out.println("Numbers in the stack are: "+flags+"\n");
        //we alert the user of their answer
        System.out.println("Your HEX Number is: ");

        //keeps track of the number of pops outputted for spacing
        int writes = 1;
        //we loop the poping of hex
        do{
            int pop=hex.pop();
            // To represent the alphabetical values we use an array

            if(pop>=10){
                //the value of y is equal to the corresponding index in arr
                String[] arr={"A","B","C","D","E","F"};
                int y = pop-10;
                System.out.print(arr[y]);
                writes++;
                //creates spaces after every 4 digits
                if(writes==4){
                    System.out.print(" ");
                    writes = writes-4;
                }
            }else{
                //outputs digits lower than 10
                System.out.print(pop);
                writes++;
                if(writes==4){
                    System.out.print(" ");
                    writes = writes-4;
                }
            }
        }while(!hex.isEmpty());
    }
}
