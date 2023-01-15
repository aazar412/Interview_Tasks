package Tasks;

/*
A prime number is a whole number greater than 1 whose only factors are 1 and itself.
A factor is a whole number that can be divided evenly into another number.
 The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
 */

public class PrimeNumber {

    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
