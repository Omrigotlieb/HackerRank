//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }
        for(int j = size - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }
        in.close();
    }
}