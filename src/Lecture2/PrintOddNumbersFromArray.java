package Lecture2;

import java.util.Arrays;

public class PrintOddNumbersFromArray {

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        boolean b = true;
        for (int ar : arr) {
            if (b == true) {
                if (ar % 2 != 0) {
                    sb.append(ar);
                    b = false;
                }
            } else if (ar % 2 != 0) {
                sb.append(",");
                sb.append(ar);
            }
        }
        System.out.println(sb);
    }



    public static void main(String[] args) {
        printOddNumbers(new int[] {1, 2, 3, 4, 5, 6, 17, 19});

    }
}
