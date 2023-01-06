package Tasks;

public class Swapping {
    public static void main(String[] args) {
        swapping(4,6);

    }


        public static void swapping ( int a, int b){

            a = a + b; //adding the sum of the teo variables and assigning it to a
            b = a - b; // the sum of both (a now) and subtract the original b value from sum to get the original a value
            a = a - b; // substracting new value
            System.out.println("a: "+a);
            System.out.println("b: "+b);
        }





    /*
    Swap two variables without using a third variable

    https://stackoverflow.com/questions/1826159/swapping-two-variable-value-without-using-third-variable
     */
    }
