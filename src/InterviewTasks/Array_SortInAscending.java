package InterviewTasks;

import java.util.Arrays;

public class Array_SortInAscending {

    public static void main(String[] args) {
        int [] arr = {1,10,8,4,7,2,3,6};
        System.out.println(Arrays.toString(sortingArrayAsc(arr)));
    }

     /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) { // for descending just reverse the > sign
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }


}
