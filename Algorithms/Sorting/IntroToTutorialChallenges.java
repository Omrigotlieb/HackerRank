import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i =0; i< size;i++){
            arr[i] = in.nextInt();
            if (arr[i] == value){
                System.out.print(i);
            }
        }
        in.close();
    }
}