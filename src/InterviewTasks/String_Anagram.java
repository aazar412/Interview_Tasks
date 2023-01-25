package InterviewTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {
     /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
    }

        // solution 1:
        public static boolean same(String a, String b) {
            char[] ch1 = a.toCharArray();//"abc" --- [a,b,c]
            char[] ch2 = b.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String a1 = "", a2 = "";

            for (char each : ch1) { //[a,b,c]
                a1 += each;
            }

            for (char each : ch2) {
                a2 += each;
            }

            return a1.equals(a2);
        }


        // solution 2
        public static boolean Same(String a, String b) {
            a = new TreeSet<String>(Arrays.asList(a.split(""))).toString(); //convert to array list then back to string
            b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
            return a.equals(b);
        }


    }
