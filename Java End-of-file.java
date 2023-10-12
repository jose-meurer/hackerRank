import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String N;
        int i = 1;
        do {
            N = sc.nextLine();

            if (!N.isBlank()) {
                System.out.println(i + " " + N);
            }
            i++;
        }
        while (!N.isBlank());
    }
}

/*
https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 */
