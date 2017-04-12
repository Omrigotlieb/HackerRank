import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for(int i =0; i<N; i++){
            solve(in.nextLine());
        }
    }
    
    
    public static void solve(String str) {
        int len = str.length();
        for(int i=0; i< len/2 ; i++){
            if(Math.abs(str.charAt(i+1) - str.charAt(i)) != Math.abs(str.charAt(len - i - 1) - str.charAt(len - i -2))){
                System.out.println("Not Funny");
                return;
            }
        }
        System.out.println("Funny");
    }
}