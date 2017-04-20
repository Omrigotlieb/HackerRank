import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i< T; i++){
            int N = in.nextInt();
            int K = in.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for(int j = 0; j< N; j++){
                A[j] = in.nextInt();
            }
            for(int j = 0; j< N; j++){
                B[j] = in.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            boolean flag = true;
            for(int j = 0; j< N; j++){
                if(A[j] + B[N-1-j] < K){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");                
            } else{
                System.out.println("NO");                
            }

    }
}
}