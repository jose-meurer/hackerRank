import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim(); 
        
        if(s.length() != 0) {
        
            String[] vect = s.split("[ !,?._'@]+");
            
            System.out.println(vect.length);
            
            for(String x : vect) {
                System.out.println(x);
            }
        }
        else {
            System.out.println(0);
        }
        
        scan.close();
    }
}

/* 
https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
 */