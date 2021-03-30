package com.company;
import java.util.*;
import com.company.Hexa;
public class Main {

    public static void main(String[] args) {
        //we simulate user input
        Hexa hex = new Hexa();
        Scanner read =new Scanner(System.in);
        System.out.println("Please Enter the number you wish to convert");
        int input = read.nextInt();
        hex.hexNumber(input);
    }
}
