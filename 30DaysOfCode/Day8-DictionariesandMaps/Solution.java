//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap hm = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(hm.get(s) != null){
                System.out.println(s + "=" + hm.get(s));
            } else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}