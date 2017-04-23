import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i = 0; i < t; i++){
            String line = in.nextLine();
            int len = line.length();
            int counter = 0;
            for(int j = 0; j < len/2 ; j++){
                counter += Math.abs(line.charAt(j)-line.charAt(len-1-j));
            }
        System.out.println(counter);
        }
       
            
    }
}