import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            int temp = in.nextInt();
            switch (temp){
                case 1:     int num = in.nextInt();
                            max = Math.max(max,num);                              
                            st.push(num);
                            break;
                case 2:     int tempPeek = st.pop();
                            if(max == tempPeek){
                                max = Integer.MIN_VALUE;
                                for(int j = 0; j < st.size(); j++){
                                 max = Math.max(max,st.get(j));                              
                                }
                            }
                            break;
                case 3:    System.out.println(max);
            }
        }
    }

}