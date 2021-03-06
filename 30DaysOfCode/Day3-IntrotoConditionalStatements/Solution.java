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
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         if (n>= 2 && n<=5){
             ans = "Not Weird";
         }
          if (6 <= n && n<= 20){
             ans = "Weird";
         }
          if (n> 20){
             ans = "Not Weird";
         }
      }
      System.out.println(ans);
   }
}
