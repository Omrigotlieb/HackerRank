import java.io.*;
import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i = 0; i < t; i++){
            String line = in.nextLine();
            int len = line.length();
            if(len %2 ==1){
                System.out.println(-1);
                continue;
            }
            Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
            for(int k = len/2; k < len; k++){
                String temp = line.charAt(k) + "";
                if(!ht.containsKey(temp)){
                ht.put(temp,1);
                } else{
                    int n = ht.get(temp);
                    ht.put(temp,++n);
                }
            }
            int counter = 0;
            for(int j = 0; j < len/2 ; j++){
                String temp = line.charAt(j) + "";
                if(ht.containsKey(temp)){
                    if(ht.get(temp) == 1){
                        ht.remove(temp);
                    } else{
                       int n = ht.get(temp);
                       ht.put(temp,--n);
                    }
                } else{
                   counter++;
                }
            }
        System.out.println(counter);
        }
       
            
    }
}