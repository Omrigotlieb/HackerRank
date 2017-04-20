import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            long largestInt = 4294967295L;
            long temp = in.nextLong();
            long result = largestInt - temp;
            System.out.println(result);
        }
    }
}