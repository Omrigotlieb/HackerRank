import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int N = in.nextInt();
            int[] prices = new int[N];
            for(int prices_i=0; prices_i < N; prices_i++){
                prices[prices_i] = in.nextInt();
            }
            //int result = solve1(prices,0,0);
            long result = solve(prices);
            //if(result < 0) result = 0;
            System.out.println(result);
        }
    }
    
    // Linear Solution
    public static long solve(int[] prices){
        int len = prices.length;
        long result = 0L;
        int max = 0;
        for(int i = len -1; i >= 0; i--){
            if(prices[i] >= max){
                max = prices[i];
            }
            result += max - prices[i];
        }
        return result;
    }
    
    
    // DP Solution
    public static int solve1(int[] prices, int stocks, int money){
        int len = prices.length;
        if(len == 1){
          return prices[0]*stocks + money;
        } 
        int[] temp = new int[len-1];
        System.arraycopy(prices,1,temp,0,len-1);
        return Math.max(Math.max(solve1(temp,0,stocks*prices[0] + money),
                        solve1(temp,stocks+1,money - prices[0])),
                        solve1(temp,stocks,money));
    }
}
