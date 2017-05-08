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
    

    public static int getSize(int[][]matrix, int row, int col){
        // System.out.println("Row is: "+ row +" and col is: " + col);
        if(row >= matrix.length || col >= matrix[0].length || col < 0 || row < 0) return 0;
        //System.out.println("And we got also here with Row is: "+ row +" and col is: " + col);
        if(matrix[row][col] == 0) return 0;
        int size = 1;
        matrix[row][col] = 0;
        for(int r = row-1; r<=row+1; r++){
           for(int c = col-1; c<=col+1; c++){
                    size += getSize(matrix,r,c);
           }
        }
        return size;
    }
    
    
    
    public static int getBiggestRegion(int[][] matrix) {
        int max = 0;
        for(int row = 0; row<matrix.length; row++){
           for(int col = 0; col<matrix[row].length; col++){
                if(matrix[row][col] == 1){
                    
                    max = Math.max(max,getSize(matrix,row,col));
                }            
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
