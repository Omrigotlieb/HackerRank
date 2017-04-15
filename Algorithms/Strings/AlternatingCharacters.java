import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i = 0; i < t; i++){
            String line = in.nextLine();
            int counter = 0;
            char cache = line.charAt(0);
            for(int j = 1; j<line.length() ; j++){
                if(cache == line.charAt(j)){
                    counter++;
                } else {
                    cache = line.charAt(j);
                }
            }
        System.out.println(counter);
        }
       
            
    }
}