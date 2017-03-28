/**
 * 
 */

/**
 * @author omrigotlieb
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            int temp = in.nextInt();
            height[height_i] = temp;
            if (temp > max) {
        	max = temp;
            }
        }
        
        System.out.println((max - k) > 0? (max-k): 0);
    }
}