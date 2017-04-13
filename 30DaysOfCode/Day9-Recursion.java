import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }
    
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}