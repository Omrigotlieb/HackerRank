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
        int[] arr = new int[N];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i =0; i < N; i++){
            arr[i] = in.nextInt();
            hm.put(arr[i],i);
        }    
        int swapCounter = 0;
        int current = 0;
        int maxNum = N;
        while(swapCounter < K && current < N){
            if(arr[current] != maxNum){
                int tempInt = arr[current];
                int tempLocation = hm.get(maxNum);
                arr[current] = arr[tempLocation];
                arr[tempLocation] = tempInt;
                swapCounter++;
                hm.put(tempInt,tempLocation);
            }    
            current++;
            maxNum--;
        }
       for(int i =0; i < N; i++){
            System.out.print(arr[i] + " ");
        }    

    }
}