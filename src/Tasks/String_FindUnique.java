package Tasks;

public class String_FindUnique {
    /*
        String -- Find the unique
        Write a return method that can find the unique characters from the String
        Ex: unique("AAABBBCCCDEF") ==> "DEF"

     */
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
    }

    /*
    EXTRA: this returns one element of each
        public static String unique(String str){
            String unique = "";

            for (int i = 0; i < str.length(); i++) {
                if (!unique.contains(""+str.charAt(i))){
                  unique += ""+str.charAt(i);
                }
            }
            return unique;

        }



     */
    public static String unique(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            int frequency = 0; //RESETS after each element

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
// within the outer loop but outside the inner loop
                if (frequency == 1) {
                    unique += ""+str.charAt(i);
                }
            }



        return unique;
    }
}
