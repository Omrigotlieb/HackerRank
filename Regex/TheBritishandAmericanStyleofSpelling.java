import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class British {

    public static void main(String[] args) throws FileNotFoundException {
       Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i< N; i++){
            sb.append(in.nextLine());
        }
       int T = in.nextInt();
       
        
         for(int i = 0; i< T; i++){
             int count = 0;
             String s = in.next();
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(sb.toString());
            while(m.find()){
            count += 1;
           }
            s = s.replace(s.charAt(s.length()-2),'s');
            p = Pattern.compile(s);
            Matcher m1 = p.matcher(sb.toString());
            while(m1.find()){
            count += 1;
           }
            System.out.println(count);
        }
        
       
        in.close();
    }

}