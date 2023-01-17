package Tasks;

/*
Write a method that can find the frequency of characters
"AAABBCDD" --> A3B2C1D2
 */
public class Frequency_String {

    public static void main(String[] args) {
        frequencyOfChar("");
        System.out.println(frequencyOfChar("AAABDDi"));
    }

    public static String frequencyOfChar(String str) {

        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //each char from string

            int frequency = 0;// to reset

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                    // output += str.charAt(i)+frequency;
                }
            }
            if (output.contains("" + ch)) {
                ;//convert char to string
                continue;
            }
            output += ch;
            output += frequency;


        }
        //System.out.println(output);
        return output;

    }

    // another solution
/*
    public static String frequencyOfChar2(String s) {
        char[] c = s.toCharArray();
        int sz = c.length;
        int counter = 0;
        String result="";

        for (int i = 0; i < sz; i++) {
            counter = 0; //to reset
            for (int j = 0; j < sz; j++) {
                if (j < i && c[i] == c[j]) { // to not duplicate the outcome
                    break;
                }
                if (c[i] == c[j]) {
                    counter++;
                }
                result +=c[i];
                result += counter;

                if (j == sz - 1) {
                    System.out.println(c[i] + counter);
                }
            }//end of j loop

        }// end of i


        return result;
    }


*/

}








