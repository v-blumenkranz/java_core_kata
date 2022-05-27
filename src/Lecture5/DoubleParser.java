package Lecture5;

import java.io.*;
import java.nio.*;
import java.util.*;

public class DoubleParser {

    public static double sumDoubles (String text) {
        Scanner scanner = new Scanner (text).
                useDelimiter(" ").useDelimiter("\n");
        String nextToken;
        double number;
        double sum = 0;

        while (scanner.hasNext()) {
            nextToken = scanner.next();
            try {
                number = Double.parseDouble(nextToken);
                sum += number;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        scanner.close();
        return sum;
    }





    public static void main(String[] args) {
        String test = "Этот прекрасный текст нужен мне, чтобы проверить работоспособность моей чудесной программы." +
                " Он включает в себя разные вещественные числа. Например, 3,14 известное как число пи, 4, 16 и многие другие." +
                " 17, 3 также является вещественным числом. А сумма всех чисел в тексте равна двадцати четырем целым и шести десятым.";
        System.out.println(DoubleParser.sumDoubles(test));
    }
}
