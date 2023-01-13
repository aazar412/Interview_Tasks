package Random;
import java.util.*;
public class Array_duplicate {





        public static void main(String[] args) {
            // DO NOT TOUCH BELOW:
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                    input.nextInt()};
        }}
            // WRITE YOUR CODE BELOW:
/*

            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                    if (count == 2) {
                        nums.remove(nums[i]);
                       // nums = ArraysUtility.remove(nums, j);
                        count--;
                    }
                }
            }
            return array;
        }


    /*

    String checked = "";
    for (int i = 0; i < nums.length; i++) {

      if (checked.contains("" + nums[i])) {
        continue;
      }
      boolean isUnique = true;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          isUnique = false;
          break;
        }

      }

      if (isUnique) {
        System.out.println(nums[i]);
        break;
      }
      checked += nums[i];
    }
    */


