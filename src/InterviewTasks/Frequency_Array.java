package InterviewTasks;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_Array {

    /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five
     */
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,3,2,1,3,2,2,2,4};
            String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};
                             // 0      1      2        3      4        5       6      7        8        9        10       11
            //solution1:
            Map<Integer, String> map = new LinkedHashMap<>();//
// nested loop to compare each element with itself and the rest
            for (int each : arr) { // go through all elements of arr
                int count = 0; // gets reset everytime the inner loop is done
                for (int n : arr) { //compare each element in arr and compare to itself and the rest
                    if(each == n){
                        count++; // everytime it matches it counts
                    }
                }
                if(count > 10){ // if count is greater than 10
                    map.put(each, words[11]); // aka ""more than ten"
                }else{
                    map.put(each, words[count]); // each from arr , word based on count
                }
            }

            map.forEach( (k,v) -> System.out.println(k+" is "+v));


        }




    }

