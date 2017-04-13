import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int num = in.nextInt();
          String s = Integer.toBinaryString(num);
          int result = 0;  
          int counter = 0;
          for(int i = 0; i<s.length(); i++){
              if(s.charAt(i) == '1'){
                  counter++;
                  if (counter > result){
                  result = counter;
                  }
             } else {
                  counter = 0;
              }
            }   
        System.out.println(result);    
    }
}