
import java.util.Vector;
import javafx.util.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chumba
 */
public class Base2 {
    
    public String integer_convert(int whole){
        int rem = 0;
        String binary = "";
        int index = 0;
        //Code for converting to binary
        while (whole > 0) {
            rem = whole % 2;
            binary = rem + binary;
            whole = whole / 2;
            index++;
            if((index % 4) == 0){
                binary = " " + binary;
            }
        }    
        if ((index % 4) != 0) {
            for (int i = 0; i < 4 - (index % 4); i++){
                binary = 0 + binary;
            }
        }    
        System.out.println(binary);
        return binary;    
    }
    
    public Pair<String, String> float_convert(float mixed_val){
        float fraction = mixed_val % 1;
        float whole = mixed_val - fraction;
        
        //Code for converting the integer part
        int rem = 0;        
        String floater = "";
        while ((int)whole > 0) {
            rem = (int)whole % 2;
            floater = rem + floater;
            whole = whole / 2;
            
        }
        
        floater = floater + ".";
        
        //Code for converting the fraction part
        
        float rem1 = 0;
        int counter = 0;
        String remark = "";
        while (counter < 5) {
           rem1 = fraction * 2;
           if (rem1 < 1) {
               floater = floater + 0;
               fraction = rem1;
           }
           else {
               floater = floater + 1;
               fraction = rem1 - 1;
               if (fraction == 0) {
                   remark = "Exactly";
                   break;
               }
               
            }
            counter++;            
        }
        System.out.println (floater);

        if ("".equals(remark)) {
            remark = "Approximate";
            System.out.println(remark);
        }
        else {
            System.out.println(remark);
        }
        return new Pair<String, String>(floater, remark);
    
    }
   
}

