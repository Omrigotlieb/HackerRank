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
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.print(((n + n%2) * (m + m%2))/4);
    }
}
