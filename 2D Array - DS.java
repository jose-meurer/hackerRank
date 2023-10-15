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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        Integer max = null;
        
        for(int i = 0; i < arr.size()-2; i++) { //row
            for(int j = 0; j < arr.get(i).size()-2; j++) {//col
                
                int r1 = 0, r2 = 0, r3 = 0;

                for(int k = 0; k < 3; k++) {
                    r1 += arr.get(i).get(j + k);
                    r2 += arr.get(i + 2).get(j+k);
                }
                r3 = arr.get(i + 1).get(j + 1);
                
                int sum = r1 + r2 + r3;
                
                if(max != null) {
                    if(sum > max) {
                    max = sum;
                    }
                } else {
                    max = sum;
                }
 
            }
        }
        
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/* 
https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true
 */