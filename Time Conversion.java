import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        // String vect[] = s.split(":");
        // String hour = vect[0];
        // String minutes = vect[1];
        // String secondes = vect[2];
        // String meridiem = vect[3];
        
        String hour = s.substring(0,2);
        String minutes = s.substring(3,5);
        String secondes = s.substring(6,8);
        String meridiem = s.substring(8,10);
         
        if(meridiem.intern() == "PM" && hour.intern() != "12") {
            int temp = Integer.parseInt(hour) + 12;
            return String.valueOf(temp) + ":" + minutes + ":" + secondes;
        }
        else if(meridiem.intern() == "AM" && hour.intern() == "12") {
            return "00" + ":" + minutes + ":" + secondes;
        }else {
            return hour + ":" + minutes + ":" + secondes;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
*/