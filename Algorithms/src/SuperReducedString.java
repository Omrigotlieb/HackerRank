import java.io.*;
import java.util.*;

public class SuperReducedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        boolean flag = true;
        while(flag){
            flag = false;
            for (int i = 0; i < sb.length() - 1; i++) {
        	if (sb.charAt(i) == sb.charAt(i + 1)) {
        	    sb.replace(i, i+2, "");
        	    flag = true;
        	    continue;
        	}
            }
        }
        String result = (sb.length() == 0)?"Empty String":sb.toString();
        System.out.println(result);
        in.close();
    }
}