import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        if(a.length() != b.length()) {
            return false;
        }
        
        for(int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            
            int contA = 0;
            int contB = 0;
            for(int j = 0; j < a.length(); j++) {
                
                if(a.charAt(j) == temp) contA++;
                
                if(b.charAt(j) == temp) contB++;
            }
            
            if(contA != contB) return false;
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/* 
https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
 */