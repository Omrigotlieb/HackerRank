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
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i <N ; i++){
            int px = in.nextInt();
            int py = in.nextInt();
            int qx = in.nextInt();
            int qy = in.nextInt();
            int rx = 2*qx - px;
            int ry = 2*qy - py;
            System.out.println(rx + " " + ry);
        }
        
    }
}