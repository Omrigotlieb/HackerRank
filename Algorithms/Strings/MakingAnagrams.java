import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();         
        String B = in.nextLine();         
        int result = solve(A,B);
        System.out.println(result);
    
    }

    //Shortet Solution
    public static int solve1(String A, String B){
    int arr[]=new int[26];
    for(int i = 0; i < A.length(); i++) {
        arr[A.charAt(i)-97]++;
    }
    for(int i = 0; i < B.length(); i++){
        arr[B.charAt(i)-97]--;
    }
    int counter = 0;
    for(int i=0;i<26;i++){
        count+=Math.abs(arr[i]);
    }
    System.out.println(count);
    }
    
    public static int solve(String A, String B){
        int counter = 0;
        Hashtable<Character,Integer> htA = new Hashtable<Character,Integer>();
        for(int i = 0; i<A.length(); i++){
            char temp = A.charAt(i);
            if(htA.containsKey(temp)){
        	htA.put(temp,htA.get(temp)+1);
            } else{
        	htA.put(temp,1);
            }
        }
        for(int i = 0; i<B.length(); i++){
            char temp = B.charAt(i);
            if(htA.containsKey(temp)){
                if(htA.get(temp) == 1){
                    htA.remove(temp);
                } else{
                    htA.put(temp,htA.get(temp)-1);
                }
            } else{
                counter++;
            }
         }
        for (Object key : htA.keySet()) {
	    counter += htA.get(key);
	}
        return counter;
}
}