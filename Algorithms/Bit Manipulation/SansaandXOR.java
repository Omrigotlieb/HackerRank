import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0 ; i < T; i++){
            int N = in.nextInt();
            int[] arr = new int[N];
               for(int j = 0 ; j < N; j++){
                   arr[j] = in.nextInt();
                }
            if(N % 2 == 0){
                System.out.println(0);
            } else {
                int result = 0;
                for(int k = 0; k < N; k = k+2){
                    result ^= arr[k];
                }
                System.out.println(result);
        }
        }
    }
}