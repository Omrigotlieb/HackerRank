import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int counter = 0;
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
           int temp = in.nextInt();
            height[height_i] = temp;
            if (max <= temp){
                if (max == temp){
                counter++;
                } else {
                    max = temp;
                    counter = 1;
                }
            }  
        }
        System.out.print(counter);
    }
}
