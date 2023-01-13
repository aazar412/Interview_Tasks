package Random;

import java.util.Scanner;

public class replit {


    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        //WRITE YOUR CODE BELOW:
        String chars = "";
        for (String eachWord : words) {
            System.out.println("" + eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1))
            ;
        }
//or
        for (String eachWord : words) {
            System.out.println("" + eachWord.substring(0, 1) + eachWord.charAt(eachWord.length() - 1))
            ;

            //or

            for (int i = 0; i < words.length; i++) {
                System.out.println("" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1));
            }

        }


    }
}


