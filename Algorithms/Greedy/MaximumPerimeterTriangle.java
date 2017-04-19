import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }
           Arrays.sort(arr);
        for(int i = N-3; i >= 0; i--){
            if(arr[i] + arr[i+1] > arr[i+2]){
                System.out.print(arr[i] + " " +  arr[i+1] + " " + arr[i+2]);
                return;
            }
        }
        System.out.print(-1);
    }
}