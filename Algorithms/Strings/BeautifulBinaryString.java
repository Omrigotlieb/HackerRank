import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
    //One line solution is:
    static void minSteps1(int n, String B){
    System.out.println((B.length() - B.replaceAll("010", "").length())/3);
    }

    
    static int minSteps(int n, String B){
        char[] temp = B.toCharArray();
        int counter = 0;
        for(int i = 0; i < n-2; i++){
            String str = temp[i]+"" + temp[i+1]+ "" + temp[i+2]+ "";
            if(str.equals("010")){
                counter++;
                temp[i+2] = '1';
            }
        }
        return counter;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
