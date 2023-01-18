package Tasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
return method to remove duplicate values from a string
example "AAABBBBBCCCC" --> ABC
 */
public class RemoveDuplicate_String {
    public static void main(String[] args) {
        removeDup("AAAAAbbbbAAAAA");
        removeDup2("carcarcar");

        String unique1=uniqueChars("AAABBBBCCCCDDDDDD");
        System.out.println(unique1);
    }


    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // point to each character
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1); //each first ch to commapre to rest

            if (idx == -1) { // -1 is ch that does not repeat
                result += ch;
            }

        }
        System.out.println(result);
        return result;

    }

    // needs improvement
    public static String removeDup2(String str) {
        char[] arr = str.toCharArray();

        String result2 = "";

        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                result2 += arr[i];
            }
        }
        System.out.println(result2);
        return result2;
    }


    // Set character for LInkedHashSet

    public static String removeDup3(String str) {
        String result = "";
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character c : set) {
            result += c;
        }
        return result;

    }

    // another

    public static String removeDuplicate(String a){

        char[] ch= a.toCharArray();


        Set<Character> set1=new LinkedHashSet<>();

        for (char c : ch) {
            set1.add(c);
        }

        ArrayList<Character> list=new ArrayList<>(set1);

        String result="";

        for (int i = 0; i < list.size(); i++) {

            result+=list.get(i);

        }

        return result;
    }


// another generation
    public static String uniqueChars(String str) {


        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            if (!unique.contains("" + str.charAt(i))) {

                unique += str.charAt(i); }}

        return unique;

    }



}

