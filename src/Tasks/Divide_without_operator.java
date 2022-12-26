package Tasks;

import java.util.Scanner;

public class Divide_without_operator {
    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = number.nextInt();
        System.out.println("Enter second number");
        int num2 = number.nextInt();
        int result = 0;

        while (num1 >= num2) { //// if num1 is greater or equal to num 2
            num1 = num1 - num2; // num1 -=num2 // then subtract num2 from num1.
                                // For everytime the subtraction occur, result get increased by 1 and at the end whatever
                                 // is leftover gets assigned to num1
            result++;
        }

        System.out.println(result);
        System.out.println(result + " with a remainder of " + num1);

    }
}
/*
50 and 5

50-5=45  result 1
45-5=40  result 2
40-5=35 result 3
35-5=30 result 4
30-5=25 result 5
25-5=20 result 6
20-5=15 result 7
15-5=10 result 8
10-5=5 result 9
5-5=0 result 10
remainder 0

 */