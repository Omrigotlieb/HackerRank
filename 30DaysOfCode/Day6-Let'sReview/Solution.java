//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
            for(int i=0; i<n ; i++){
                String s = in.nextLine();
                StringBuilder sbOdd = new StringBuilder("");
                StringBuilder sbEven = new StringBuilder("");
                for(int j=0; j<s.length(); j++){
                        if(j%2 == 0){
                            sbEven.append(s.charAt(j));
                        } else {
                            sbOdd.append(s.charAt(j));
                        }  
                }
                System.out.println(sbEven + " " + sbOdd);
            }
    }
}