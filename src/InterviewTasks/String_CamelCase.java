package InterviewTasks;

public class String_CamelCase {
    /*
    Camel Case
    Have the function Camel Case (str) take the str parameter being passed and return it in proper
    camel case format where the first letter of each word is capitalized (excluding the first letter).
    The string will only contain letters and some combination of delimiter punctuation characters separating each word.
        For example:
            if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
        Examples
            Input: "cats AND*Dogs-are Awesome"
            Output: catsAndDogsAreAwesome
            Input: "a b c d-e-f%g"
            Output: aBCDEFG

            \\s adds white space
            \\p{punct} pics up puncuation and special chars
            StringBuilder builds the string
     */


    public static String CamelCase(String s){
        String[] words = s.replaceAll("\\p{Punct}", " ").toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        result.append(words[0]);
        for (int i = 1; i < words.length; i++) { //start at i=1 so we avoid capitalizing the first letter in the array
            result.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "BOB loves-coding";
        String str2 = "cats AND*Dogs-are Awesome";
        String str3 = "a b c d-e-f%g";

        System.out.println(CamelCase(str1));
        System.out.println(CamelCase(str2));
        System.out.println(CamelCase(str3));
    }
}
