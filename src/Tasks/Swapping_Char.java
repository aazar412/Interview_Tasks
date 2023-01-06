package Tasks;

public class Swapping_Char {

    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        System.out.println(a + " " + b);
        a = (char) (a + b);
        b = (char) (a - b);
        a = (char) (a - b);
        System.out.println(a + " " + b);
    }
}
