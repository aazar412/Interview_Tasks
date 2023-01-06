package Tasks;

public class Swapping_String {

    public static void main(String[] args) {

        String a = "sasha";
        String b = "eshwa";

        int aL = a.length();//5

        System.out.println(a + "  " + b);

        a = a + b; // a = "sashaeashwa"
        b = a.substring(0,aL);// b = "sasha"
        //  "sashaeshwa"
        a = a.substring(aL);// a = "eashwa"
        //   "sashaeshwa"

        System.out.println(a + "  " + b);
// how to swap two strings

    }
}
