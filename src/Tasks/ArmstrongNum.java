package Tasks;
/*
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal
to the number itself. For example, 371 is an Armstrong number since 33 + 73 + 1**3 = 371.
 */
public class ArmstrongNum {


    public static void main(String[] args) {

        armstrongNumber(210);
        armstrongNumber2(333);

    }

    // solution 1
    public static void armstrongNumber(int number) {

        int sum = 0;


        String stringNumber = String.valueOf(number);  // convert int to string
        //String stringNumber = number + ""; // convert int to string (2. way)


        for (int i = 0; i < stringNumber.length(); i++) { // to check every number
            int size = stringNumber.length();    // the length of the number
            sum += Math.pow(Integer.parseInt(stringNumber.substring(i, i + 1)), size);//153
            // Integer.parseInt==> covert string to the primitive value
            // first number * first number * first number because size is 3
            // second number * second number * second number because size is 3
            // third number * third number * third number because size is 3

        }

        if (sum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }

    }


    //solution 2
    public static void armstrongNumber2(int number) {
        int digits = 0;
        int temp = number; // 153
        int temp1 = number; // 153
        int total = 0;

        while (number > 0) {  // finding how many digits
            number = number / 10;
            digits++; //
        }
        // 153/10= 15  digit=1,
        // 15/10=1 digit=2
        // 1/10 = 0 digit= 3
        /* at this point we cannot use original number again, bcz after this loop orignal number will zero that's why we assign number to 2 different variable temp and temp1 to use next 2 action.

         */


        while (temp > 0) {

            int result = (int) Math.pow(temp % 10, digits); // finding number is power of digits
            // result =3^3=27
            // result =5^3=125
            // result =1^3 = 3
            temp = temp / 10;
            // 153/10= 15
            // 15/10=1
            // 1/10 = 0
            total += result; // to find out total number of result
            // total = 27+125+3=155;
        }

        if (temp1 == total) { // Checking Armstrong or not
            // 153>155 => false => not armstrong number
            System.out.println("Armstrong Number: " + temp1);
        } else {
            System.err.println("Not Armstrong Number: " + temp1);
        }


    }


}
