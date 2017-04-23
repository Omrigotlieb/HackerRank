import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int counter = 0;
        int[] letters = new int[26];
        for(int i =0; i < 26; i++){
            letters[i] = 0;
        }
        for(int j =0; j < s.length(); j++){
            letters[s.charAt(j)-'a']++;
        }
        for(int i =0; i < 26; i++){
            if(letters[i]%2 != 0){
                counter++;
            }
        }
        String result = (counter > 1)?"NO":"YES";
        System.out.println(result);
    }
}