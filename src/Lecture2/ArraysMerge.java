package Lecture2;

import java.util.Arrays;

public class ArraysMerge {

    /*
    Метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
    Массивы могут быть любой длины, в том числе нулевой.
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] mergedArray = new int[a1.length + a2.length];
        int a1Count = 0;
        int a2Count = 0;
        int mergedCount = 0;
        if (a1.length == 0) {
            mergedArray = a2;
        } else if (a2.length == 0) {
            mergedArray = a1;
        } else {
            for (int m : mergedArray) {
                if (a1Count >= a1.length) {
                    mergedArray[mergedCount] = a2[a2Count];
                    a2Count++;
                    mergedCount++;
                } else if (a2Count >= a2.length) {
                    mergedArray[mergedCount] = a1[a1Count];
                    a1Count++;
                    mergedCount++;
                } else {
                    if (a1[a1Count] <= a2[a2Count]) {
                        mergedArray[mergedCount] = a1[a1Count];
                        a1Count++;
                        mergedCount++;
                    } else {
                        mergedArray[mergedCount] = a2[a2Count];
                        a2Count++;
                        mergedCount++;
                    }
                }
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 4}, new int[]{1, 3, 5})));
    }
}
