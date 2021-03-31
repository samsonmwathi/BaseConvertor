package com.company;
import java.util.*;
import com.company.Hexa;
public class Main {

    public static void main(String[] args) {
        //we simulate user input
//        Hexa hex = new Hexa();
//        Scanner read =new Scanner(System.in);
//        System.out.println("Please Enter the number you wish to convert");
//        int input = read.nextInt();
//        hex.hexNumber(input);

        final String[] header = {"Column 0", "Column 1", "Column 2", "Column 3"};
        final String[][] data = {{"Cell [0][0]", "Cell [0][1]", "Cell [0][2]", "Cell [0][3]"}, {"Cell [1][0]", "Cell [1][1]", "Cell [1][2]", "Cell [1][3]"}};
        Table table = new Table(header, data, Alignment.RIGHT);
        table.render();
    }
}
