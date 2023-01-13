package Random;

import java.util.Scanner;

public class Replits_Frequency {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

        String output = "";
        //check the string one char at time
        for (int i = 0; i < str.length(); i++) {
            if (!output.contains("" + str.charAt(i))) {

                int frequency = 0;//resets every iteration of the i loop (for each char)

//then inner loop j from beginning to string will compare with the i character
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        frequency++;
                    }
                }
                output += "" + frequency + str.charAt(i);
            }
        }
        return output;
    }


}
/*
 String output = "";
    //check the string one char at time
    for(int i =0; i<str.length(); i++){
      if(output.contains(""+str.charAt(i))){
        continue;
      }
       int frequency = 0;//resets every iteration of the i loop (for each char)

//then inner loop j from beginning to string will compare with the i character
      for(int j = 0; j<str.length(); j++){


      if(str.charAt(i)==str.charAt(j)){
        frequency++;
      }
    }
output +=""+frequency+str.charAt(i);

  }
return output;
}
*/


