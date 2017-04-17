import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
       public static BigInteger[] arr;

       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = in.nextBigInteger();
        BigInteger  t2 = in.nextBigInteger();
        int n = in.nextInt();
        arr = new BigInteger[n];
        arr[0] = t1;
        arr[1] = t2;
        BigInteger result = solve(n-1);
        System.out.print(result);
        in.close();
    }
    
    public static BigInteger solve(int n) {
    if(arr[n] == null){
        arr[n] =  solve(n-1).pow(2).add(solve(n-2));
    }
    return arr[n];
    }
}