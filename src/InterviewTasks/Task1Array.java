package InterviewTasks;

import java.util.HashMap;
import java.util.Map;
public class Task1Array {


    /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}
     */

        public static void main(String[] args) {

            int[] arr = {8, 7, 2, 5, 3, 1};
            int sum = 10;

            int num1 = 0;
            int num2 = 0;

            Map<Integer, Integer> pairs = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {//8 7 2 5 3
                for (int j = i+1; j < arr.length; j++) {//7 2 5 3 1 -->?
                    if(arr[i] + arr[j] == sum){//8 +? = 10  ....> 8+ 2 -- 7 + 3 // 2 //5 // 3 // 1//
                        pairs.put(arr[i], arr[j]);
                    }
                }
            }

            System.out.println(pairs);


        }
// whats the difference?
// == operator -> int
//    equals() -> string


    }

