import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        long miles = 0;
        int len = calories.length;
        for(int i = 0; i < len; i++){
               int temp = calories[len - 1 - i];
               miles += Math.pow(2,i)*temp; 
        }
        System.out.print(miles);
    }
}
