package Lecture2;

public class Primitives {
    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value)) == 1) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));

    }
}
