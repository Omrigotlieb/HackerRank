import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        HashSet hs = new HashSet();
        for(int i =0; i<26 ; i++){
            hs.add((char) (i + 'a'));
        }
        for(int j = 0; j< N; j++){
            HashSet temp = new HashSet();
            String str = in.nextLine();
            for(int k =0; k<str.length(); k++){
                if(hs.contains(str.charAt(k))){
                    temp.add(str.charAt(k));
                }
            }
            hs = temp;
        }
        System.out.print(hs.size());
    }
}