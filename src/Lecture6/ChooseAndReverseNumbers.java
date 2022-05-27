package Lecture6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.function.*;

public class ChooseAndReverseNumbers {

    public static void returnReversedNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            Deque<Integer> arrayDeque = new ArrayDeque<>();
            int count = 0;
            Integer number;
            while (scanner.hasNext()) {
                number = Integer.valueOf(scanner.next());
                if (count % 2 != 0) {
                    arrayDeque.addFirst(number);
                }
                count++;
            }
            for (Integer element : arrayDeque) {
                System.out.print(element + " ");
            }
        }
    }



    public static void main(String[] args) {
        ChooseAndReverseNumbers.returnReversedNumbers();
    }
}


