package Lecture2;

import java.math.BigInteger;

public class FactorialRecursion {
    public static BigInteger factorial(int value) {
        if (value <= 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }


    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

}
