import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int K = in.nextInt();
        StringBuilder sb = new StringBuilder("");
        for(int i =0 ; i<N;i++){
            char c = str.charAt(i);
            char temp = (char) (c + K);
            if(c >= 97 && c <= 122){
                while(temp > 122){
                    temp -= 26;
                }
            } else {
            if(c >= 65 && c <= 90){
                while(temp > 90){
                    temp -= 26;
                }
            } else {
            temp = c;
            }
            }
            sb.append(temp);
        }
        System.out.println(sb.toString());
        in.close();
    }
}