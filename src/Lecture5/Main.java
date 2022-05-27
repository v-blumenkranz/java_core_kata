package Lecture5;

import java.io.*;
import java.nio.*;
import java.util.*;

public class Main {

    public static void sumDoubles () {
        try (Scanner scanner = new Scanner (System.in).useDelimiter("\\s|\\n")) {
            double number;
            double sum = 0;
            while (scanner.hasNext()) {
                try {
                    number = Double.parseDouble(scanner.next());
                    sum += number;
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            System.out.printf("%.6f", sum);
        }
    }

    public static void main(String[] args) {
       Main.sumDoubles();
    }
}
