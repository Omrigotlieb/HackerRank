import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
    static boolean isPalindrom(String str){
        int len =  str.length();
        for(int i = 0; i <len/2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)){
                    return false;
            }
            }
        return true;
    }
    
    
    static int solve(String str){
        StringBuilder sb = new StringBuilder("");
        int len =  str.length();
        int index = -1;
        for(int i = 0; i <len/2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)){
                sb.append(str.substring(0,i));
                sb.append(str.substring(i+1,len));
                if(isPalindrom(sb.toString())){
                    return i;
                } else {
                    return len - 1 - i;
                } 
                
            }
            }
        return index;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i =0; i < n; i++){
        String B = in.nextLine();         
        int result = solve(B);
        System.out.println(result);
        }
    }
}
