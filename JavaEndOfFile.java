package Java;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String N;

        int i = 1;
        while(sc.hasNext()) {
            N = sc.nextLine();

            if (N.contains("end-of-file")) { //Stop program se tiver "end-of-file" no input
                System.out.println(i + " " + N);
                i++;
                break;
            }
            else {
                System.out.println(i + " " + N);
                i++;
            }
        }
    }
}

/*
https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 */
