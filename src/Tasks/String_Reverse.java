package Tasks;

public class String_Reverse {
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }

    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
         //  reverse += str.substring(i); this one would give the elements duplicated minus one everytime "DCDBCDABCD"
            reverse +=""+ str.charAt(i);
        }

        return reverse;
    }
}
