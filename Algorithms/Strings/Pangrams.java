import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashSet<Character> hs = new HashSet<Character>();
        char[] abc = {'a','b','c','d','e','f','g','h','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char c : abc){
            hs.add(c);
        }
        str = str.toLowerCase();
        for(int i =0; i< str.length();i++){
            hs.remove(str.charAt(i));
        }
        if(hs.isEmpty()){
            System.out.print("pangram");
        } else {
            System.out.print("not pangram");
        }
    }
}