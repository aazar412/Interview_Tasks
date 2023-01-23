package Random;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class Sum_Index {

    // input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
    // target = 9
    //  output: [1, 3]
    // find the sum of 2 integer values equal
    //  to 9 and return there indexes

    public static int[] main(String[] args) {

        int[] arr = {1, 2, 100, 7, 11, 15, 999};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (current + arr[j] == target) {
                    return new int[]{current, arr[j]};
                }
            }
        }
        return new int[]{-1, 1}; //or return null;?


        /*
         int[] arr = {1 , 2, 100, 7, 11, 8, 999 };
int target=9;
        findSumOfTwoNumbersTarget(arr,target);//[0, 5, 1, 3]

    }

   public static void findSumOfTwoNumbersTarget(int[] arr,int target) {
       String result = "";
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] + arr[j] == target) {
                   result += i + "" + j;
               }
           }
       }
       String[] str = result.split("");
       System.out.println(Arrays.toString(str));//[0, 5, 1, 3]

       int size = str.length;//convert string array to int array
       int[] arr1 = new int[size];
       for (int i = 0; i < size; i++) {
           arr1[i] = Integer.parseInt(str[i]);
       }
       System.out.println(Arrays.toString(arr1));


   }
}
         */




/*


int[] nums = {1, 2, 100, 7, 11, 8, 999 };
        int target = 9;
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] > target) {
                    continue;
                }
                if (target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        }
 */




        // another solution
/*
       int[] arr = {1, 2, 100, 7, 11, 15, 999};
       int targett = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
*/

        //

/*
        int[] arr2 = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        Map<Integer, Integer> pairs = new LinkedHashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] + arr2[j] == sum) {
                    pairs.put(arr2[i], arr2[j]);
                }
            }
        }
        System.out.println(pairs);
    }
*/


}}


