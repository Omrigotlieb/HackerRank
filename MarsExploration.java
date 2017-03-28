import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int counter = 0;
        for (int i = 0; i < S.length(); i = i+3) {
	    if (S.charAt(i) != 'S') {
		counter++;
	    }
	    if (S.charAt(i+1) != 'O') {
		counter++;
	    }
	    if (S.charAt(i+2) != 'S') {
		counter++;
	    }
	}
        System.out.println(counter);
    }
}
