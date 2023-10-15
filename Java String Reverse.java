import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(palindrome(A));
    }
    
    private static String palindrome(String A) {
        
        for(int i = 0; i < A.length()/2; i++) {
            
            char firstLetter = A.charAt(i);
            char lastLetter = A.charAt(A.length() - 1 - i );
            
            if(firstLetter != lastLetter) return "No";
        }
        
        return "Yes";
    }
}


/* 
https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 */
