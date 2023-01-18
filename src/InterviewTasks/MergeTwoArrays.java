package InterviewTasks;

import java.util.Arrays;
public class MergeTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        concatTwoArrays(arr1,arr2);
    }
    /*
    Write a return method that can concat two arrays
     */

        public static int[] concatTwoArrays(int[] arr1, int[] arr2) { //

            int[] result = new int[arr1.length + arr2.length];

            int i = 0;
            for (int each : arr1) {// [1,          2,            3]   the array value
                result[i++] = each; // i=0        i=1           i=2   the array index
            }

            for (int each : arr2) {//[4,           5,            6]   the array value
                result[i++] = each;//i=3            i=4          i=5   the array index
            }

            return result;

        }

    }

