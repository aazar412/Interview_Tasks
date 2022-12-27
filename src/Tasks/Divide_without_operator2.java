package Tasks;

import java.util.Scanner;

public class Divide_without_operator2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two number");
        int number1= input.nextInt();
        int number2= input.nextInt();

        System.out.println(divide(number1,number2));

    }

    public static int divide(int num1, int num2) {
        int frequency = 0;

        if(num2==0){
            throw new ArithmeticException("Invalid");
        }
        if(num2>num1){

            throw new ArithmeticException("Invalid entry=>Dvivisor has to be smaller than the dividend");

        }

        while(num1>=num2){//repeated if statement //when repetition is not fixed
            num1=num1-num2;
            frequency++;
        }

        return frequency;

    }
}
