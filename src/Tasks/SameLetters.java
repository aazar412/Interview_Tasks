package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a method that checks if a string is made up of the same letters as the other
 example: "abc" and "cab --> true
 same("abc","abb"); --> false;

 */
public class SameLetters {


    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));

        boolean r1=  sameLetter("asdew12","dsawe21");
        System.out.println(r1);

    }

    public static boolean same(String str1, String str2){
    char[] first = str1.toCharArray();
    char[] second = str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
    return Arrays.equals(first,second);
    }

//solution 2
    public static boolean sameLetter(String str1, String str2){
        ArrayList<String> list2= new ArrayList<>();
        ArrayList<String> list1= new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {

            //  ArrayList<String> list1= new ArrayList<>();

            list1.add(str1.charAt(i)+"");

        }
        for (int i = 0; i <str2.length() ; i++) {

            //   ArrayList<String> list2= new ArrayList<>();

            list2.add(str2.charAt(i)+"");



        }
        if (list1.containsAll(list2) && list1.size()==list2.size() ){
            return true;
        }
        return false;
    }

}




/*
need to fix my code:

String str1 = "abc";
        String str2 = "car";
        boolean isNotSame = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.contains("" + str2.charAt(i))) {
                    isNotSame = true;
                }

            }

        }

        System.out.println(isNotSame);
    }



this here for sentences to check if one contains all the words in one

String s1 = "This is a test";
String s2 = "This is a simple test";
Set<Character> chars = new HashSet<Character>();
for(int i = 0; i < s1.length(); i++) {
    chars.add(s1.charAt(i));
}


for (Iterator<Character> iterator = chars.iterator(); iterator.hasNext();) {
    Character character = iterator.next();
    if(!s2.contains(character.toString())) {
        // break and mark as not contained
        break;
    }
}



 */

