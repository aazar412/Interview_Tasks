package Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class REVIEWS {

    public static void main(String[] args) {
        long a = 3_000L;
        double b = (float) a;
        int c = (short) b;
        System.out.println(c % 1000);

        System.out.println("------------------------");
        boolean A = true, B = !false;

        if (B) {
            System.out.println("b");

        } else if (A) {
            System.out.println("A");
        } else {
            System.out.println("C");
        }


        int num = 9; //num 9
        if(num++ ==10){ //num = 9
            System.out.println("hello"+ num); //num 9
        }else{
            System.out.println("hello "+num); //num=10
        }





    }


}
