import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int result = 0;
        int counter = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            int luck = in.nextInt();
            int important = in.nextInt();
            if(important == 1){
                arr[counter] = luck;
                counter++;
            }else {
                result += luck;
            }
        }
        int[] temp = new int[counter];
        System.arraycopy(arr,0,temp,0,counter);
        Arrays.sort(temp);
        for(int j = 0; j < counter; j++){
            if(j<counter - K){
              result -= temp[j];  
            }else {
                result += temp[j];
            }
        }
        System.out.println(result);
        }
    }
