package Random;

public class RemoveX {


    public static void main(String[] args) {
        System.out.println(removeX("xAFndfxxfXXfxxxlkjx"));
    }

    private static String removeX(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1 || Character.toLowerCase(str.charAt(i)) != 'x') {
                res = res + str.charAt(i);
            }
        }
        return res;
    }
}
