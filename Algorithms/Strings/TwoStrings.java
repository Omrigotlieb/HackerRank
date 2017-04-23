import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for(int k = 0; k < T; k++){
        String result = "NO";
        String a = in.nextLine();
        String b = in.nextLine();
        int counter = 0;
        int[] letters = new int[26];
        for(int i =0; i < 26; i++){
            letters[i] = 0;
        }
        for(int j =0; j < a.length(); j++){
            letters[a.charAt(j)-'a']++;
        }
            for(int j =0; j < b.length(); j++){
                if(letters[b.charAt(j)-'a'] != 0){
                    result = "YES";
                    break;
              }
        }
        System.out.println(result);
        }
    }
}