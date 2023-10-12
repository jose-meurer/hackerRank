package Java;

import java.util.Scanner;

public class JavaStdinAndStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }
}

/*
https://www.hackerrank.com/challenges/java-stdin-and-stdout-1?isFullScreen=true
 */