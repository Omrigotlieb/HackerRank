//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i = 0; i < N; i++){
            String temp = in.next();
            if(hm.containsKey(temp)){
                int val = hm.get(temp);
                val++;
                hm.put(temp,val);
            } else {
                hm.put(temp,1);
            }
        }
        int queries = in.nextInt();
        for(int i = 0; i < queries; i++){
           String query = in.next();
            int counter = 0;
            if(hm.get(query) != null){
               counter = hm.get(query); 
            }
           System.out.println(counter);
        }
        in.close();
    }
}