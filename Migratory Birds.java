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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     
        public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {

            if (list.containsKey(arr.get(i))) {

                list.replace(arr.get(i), list.get(arr.get(i)) + 1); //or put
            } else {

                list.put(arr.get(i), 1);
            }
            //Sum and new ID ok
        }

        Integer id = null;
        int max = 0;
        for (int x : list.keySet()) {

            if (id == null) {
                id = x;
                max = list.get(x);

            } else if (list.get(x) >= max) {

                if (list.get(x) == max ) {
                    if(x < id){
                        id = x;
                        max = list.get(x);
                    }
                } else  {
                    id = x;
                    max = list.get(x);

                }
            }
        }

        return id;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/* 
https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
 */