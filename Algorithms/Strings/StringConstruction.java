import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            HashSet hs = new HashSet();
            for(int i = 0; i < s.length(); i++){
                char temp = s.charAt(i);
                if(!hs.contains(temp)){
                    hs.add(temp);
                }
            }
            System.out.println(hs.size());
        }
    }
}
