//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipPercentDouble = (double) tipPercent;
        double taxPercentDouble = (double) taxPercent;
        double sum = mealCost + ((tipPercentDouble/100) * mealCost) + ((taxPercentDouble/100)*mealCost);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(sum);
      
        // Print your result
        System.out.print("The total meal cost is " + totalCost + " dollars.");
    }
}