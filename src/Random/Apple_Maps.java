package Random;

import java.util.*;

public class Apple_Maps {

    public static void main(String[] args) {


        String word = "apple";

        String[] str = word.split("");

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {

            map.put(word.charAt(i), Collections.frequency(List.of(str), str[i]));
        }

        System.out.println(map); // {a=1, p=2, l=1, e=1}


    /*
    public static void frequencyOfChars(String "arg") {

        Map<String, Integer> frequency = new LinkedHashMap<>();

        String[] chars = arg.split("");

        for (int i = 0; i < arg.length(); i++) {
            String eachChar = "" + arg.charAt(i);
            frequency.put(eachChar, Collections.frequency(Arrays.asList(chars), eachChar));
        }
        System.out.println(frequency);

     */
    }
}
