package Tasks;

import java.util.Scanner;

public class FINRA {
  /*  FINRA :
    Write a method which prints out the numbers from 1 to 30 but for numbers which
    are a multiple of
    3 print "FIN" instead of the number   and for numbers which are a
    multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
    both 3 and 5, print "FINRA" instead of the number

   */

    public static void main(String[] args) {

        String result = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FINRA";
            }else if (i % 3 == 0) {
               result = "FIN";
            } else if (i % 5 == 0) {
                result = "RA";
            }else{
                result = ""+i;
            }
            System.out.print(result+" ");

        }


    }


}
