package Random;

public class Reverse_Remove {


    /*
    this one String reverse interview question was  -
Reverse string and REMOVE all special characters
     */
    public static String reverse(String str){

        String result="";

        for(int i=str.length()-1;i>=0;i--){

            if(str.charAt(i)==' '){
                result+=str.charAt(i);
            }
            if(!(Character.isLetter(str.charAt(i))||
                    Character.isDigit(str.charAt(i)))){
                continue;
            }

            result+=str.charAt(i);  //just reverse

        }
        return result;
    }
}
