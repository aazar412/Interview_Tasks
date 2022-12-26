package Tasks;

import java.util.Scanner;

public class Odd_Even {
    /*
    Write a method to identify if the number is even or odd
     */
    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number");
        int numberInQuestion= number.nextInt();

        if (numberInQuestion%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

        number.close();
    }
}
