package Tasks;


public class CodilityTestCoders {
    public static void main(String[] args) {

        int N= 25;
        consecutive(N);
    }


    public static void consecutive(int N){


            for (int i = 1; i <= N; i++) {
                if (i%2==0 && i%3==0 && i%5==0){
                    System.out.println("CodilityTestCoders");
                } else if (i%2==0 && i%3==0) {
                    System.out.println("CodilityTest");
                } else if (i%2==0 && i%5==0) {
                    System.out.println("CodilityCoders");
                } else if (i%3==0 && i%5==0) {
                    System.out.println("TestCoders");
                } else if (i%2==0) {
                    System.out.println("Codility");
                } else if (i%3==0) {
                    System.out.println("Test");
                } else if (i%5==0) {
                    System.out.println("Coders");
                }else{
                    System.out.println(i);
                }
            }




    }

}
/*
Write a function that a given integer N, print all the consecutive numbersa from 1 to N, each on a seperate ine. Any number divisible by
2 replace by Codility
3 replace by Test
5 replace by Coders.

if divisible by more than one of the 2,3,5, concatenate the respective words associated with it.
example: if divisible by 2,3 then CodilityTest - if divisible by all three then CodilityTestCoders
 */