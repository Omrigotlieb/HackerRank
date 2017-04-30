//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

         /* Declare second integer, double, and String variables. */
        int num; 
        double dInput;
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        num = scan.nextInt();
        dInput = scan.nextDouble();
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + num);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+ dInput);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		System.out.println(s + str + str1);

		  scan.close();
    }
}